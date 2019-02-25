/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasetransactions.dal;

import databasetransactions.Person;
import java.sql.*;
import static java.sql.Connection.*;
import static java.sql.Statement.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeppjleemoritzled
 */
public class PersonDAODB implements PersonDAO {

    @Override
    public void add(Person p) {
        try(Connection con = DBConnector.getInstance().getConnection()){
            add(p, con);
        }
        catch (SQLException ex) {
            Logger.getLogger(PersonDAODB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void add(Person p, Connection con) throws SQLException {
        String sql = "INSERT INTO persons(name, balance) VALUES (?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql, RETURN_GENERATED_KEYS);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next())
            p.setId(rs.getInt(1));
        
    }

    @Override
    public Person get(int id) {
        try (Connection con = DBConnector.getInstance().getConnection()) {
            return get(id, con);
        }
        catch (SQLException ex) {
            Logger.getLogger(PersonDAODB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Person get(int id, Connection con) throws SQLException {
        String sql = "SELECT * FROM Persons WHERE id=?";
        Person p = new Person();

        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setBalance(rs.getFloat("balance"));
        }

        return p;
    }

    @Override
    public List<Person> getAll() {
        try (Connection con = DBConnector.getInstance().getConnection()) {
            return getAll(con);
        }
        catch (SQLException ex) {
            Logger.getLogger(PersonDAODB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Person> getAll(Connection con) throws SQLException {
        ArrayList<Person> persons = new ArrayList();
        String sql = "SELECT * FROM Persons";

        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            Person p = new Person();
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setBalance(rs.getFloat("balance"));
            persons.add(p);
        }

        return persons;

    }

    @Override
    public void remove(Person p) {
        try(Connection con= DBConnector.getInstance().getConnection()){
            remove(p, con);
        }
        catch (SQLException ex) {
            Logger.getLogger(PersonDAODB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void remove(Person p, Connection con) throws SQLException {
        String sql = "DELETE FROM persons WHERE id=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, p.getId());
        pstmt.executeUpdate();
    }

    @Override
    public void update(Person p) {
        try (Connection con = DBConnector.getInstance().getConnection()) {
            update(con, p);
        }
        catch (SQLException ex) {
            Logger.getLogger(PersonDAODB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Connection con, Person p) throws SQLException {

        String sql = "UPDATE Persons SET name=?, balance=? WHERE id=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, p.getName());
        pstmt.setFloat(2, p.getBalance());
        pstmt.setInt(3, p.getId());
        pstmt.executeUpdate();

    }

    @Override
    public void withdraw(Person p, float amount) {
        try (Connection con = 
                DBConnector.getInstance().getConnection()){
            // START TRANSACTION
            // read the balance FROM DB
            con.setAutoCommit(false);
            con.setTransactionIsolation(TRANSACTION_REPEATABLE_READ);
            Float balance = get(p.getId()).getBalance();

            // calculate new balance MEMORY
            Float newBalance = balance - amount;

            // persistance to DB
            p.setBalance(newBalance);
            update(p);
            con.commit();
            // END TRANSACTION
            // set connection back to normal
            con.setAutoCommit(true);
            con.setTransactionIsolation(TRANSACTION_NONE);
            // Fetch new balance
            float balAfter = get(p.getId()).getBalance();
            p.setBalance(balAfter);
        }
        catch (SQLException ex) {
            Logger.getLogger(PersonDAODB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
