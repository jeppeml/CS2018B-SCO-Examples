/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasetransactions.dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;

/**
 *
 * @author jeppjleemoritzled
 */
public class DBConnector {

    SQLServerDataSource ds = new SQLServerDataSource();
    private static DBConnector instance;
    
    public static DBConnector getInstance(){
        if(instance==null)
            instance = new DBConnector();
        return instance;
    }
    
    private DBConnector() {
        ds.setDatabaseName("PersonExample");
        ds.setUser("CS2018B_40");
        ds.setPassword("CS2018B_40");
        ds.setPortNumber(1433);
        ds.setServerName("10.176.111.31");
        
    }
    
    public Connection getConnection() throws SQLServerException{
        return ds.getConnection();
    }
    
    
}
