/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasetransactions.dal;

import databasetransactions.Person;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class PersonDAODB implements PersonDAO{

    @Override
    public void add(Person p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Person> getAll() {
        ArrayList<Person> persons = new ArrayList();
        String sql = "SELECT * FROM Persons";
        try(Connection con = DBConnector.getInstance().getConnection();){
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                Person p = new Person();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                persons.add(p);
            }
        }
        catch(SQLException sqle){
            return null;
        }
        return persons;
        
    }

    @Override
    public void remove(Person p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Person p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
