/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseexample.dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import databaseexample.be.Person;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeppjleemoritzled
 */
public class PersonDAO {
    SQLServerDataSource ds;

    public PersonDAO() {
        ds = new SQLServerDataSource();
        ds.setDatabaseName("CS2018B_40");
        ds.setUser("CS2018B_40_java");
        ds.setPassword("javajava");
        ds.setPortNumber(1433);
        ds.setServerName("10.176.111.31");
    }
    
    // crUd
    public void updatePerson(Person p)
    {
        try (Connection con = ds.getConnection()){
           String sql = "UPDATE Person SET name=?, job=? "
                   + "WHERE cprno=?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, p.getName());
           stmt.setString(2, p.getJob());
           stmt.setString(3, p.getCpr());
           stmt.execute();
        }
        catch (SQLServerException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Crud
    public Person createPerson(String cprno, String name, String job)
    {
        Person p = null;
        try (Connection con = ds.getConnection()){
           String sql = "INSERT INTO Person(cprno, name, job) "
                   + "VALUES(?,?,?)";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, cprno);
           stmt.setString(2, name);
           stmt.setString(3, job);
           stmt.execute();
           p = new Person(cprno, name, job);
        }
        catch (SQLServerException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return p;
    }
    
    
    // cruD
    public void deletePerson(Person p)
    {
        try (Connection con = ds.getConnection()){
           String sql = "DELETE FROM Person WHERE cprno=?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, p.getCpr());
           stmt.execute();
        }
        catch (SQLServerException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // cRud
    public Person getPerson(String cprno)
    {
        try (Connection con = ds.getConnection()){
           /* String sqlStatement = "SELECT * FROM Person WHERE "
                    + "cprno='" + cprno + "'"; // BAD
            
            Statement statement = con.createStatement();*/ // BAD BAD BAD
            PreparedStatement pstmt =
                    con.prepareStatement("SELECT * FROM Person WHERE cprno=?");
            pstmt.setString(1, cprno);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next())
            {
                String cpr = rs.getString("cprno");
                String name = rs.getString("name");
                String job = rs.getString("job");
                Person p = new Person(cpr, name, job);
                return p;
            }
            
        }
        catch (SQLServerException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
        
    }
    
    // cRud
    public List<Person> getAllPersons() 
    {
        List<Person> persons = new ArrayList();
        try (Connection con = ds.getConnection()){
            String sqlStatement = "SELECT * FROM Person";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sqlStatement);
            while(rs.next())
            {
                String cpr = rs.getString("cprno");
                String name = rs.getString("name");
                String job = rs.getString("job");
                Person p = new Person(cpr, name, job);
                persons.add(p);
            }
            
        }
        catch (SQLServerException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return persons;
    }
    
    
}
