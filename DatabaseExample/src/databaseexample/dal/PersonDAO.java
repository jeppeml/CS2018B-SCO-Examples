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
        ds.setUser("CS2018B_40");
        ds.setPassword("CS2018B_40");
        ds.setPortNumber(1433);
        ds.setServerName("10.176.111.31");
    }
    
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
