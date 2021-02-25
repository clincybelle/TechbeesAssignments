package com.TechBee.DAO;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;



public class BankAccountDaoDB {
	public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	public static final String DB_URL = "jdbc:mysql://database-1.cpooke9gjme2.us-east-2.rds.amazonaws.com:3306/TEST";
	public static final String USER = "admin";
	public static final String PASS = "clincy14";
    
        private static final String INSERT_USERS_SQL = "INSERT INTO BANKACCOUNT VALUES (?, ?, ?,?,?);";

        private static final String SELECT_USER_BY_ID = "select firstname,LastName,phoneNumber,email,AccountNumber from users where firstName =?";
        private static final String SELECT_ALL_USERS = "select * from users";
        private static final String DELETE_USERS_SQL = "delete from users where firstName = ?;";
        private static final String UPDATE_USERS_SQL = "update users set phoneNumber = ? where firstName = ?;";
	
        protected Connection getConnection() {
        	
            Connection conn = null;
            try {
            	Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
        	/*	if (conn != null) 
        	     System.out.println("Creating table in given database...");
        	    Statement stmt = conn.createStatement();
        	      System.out.println("Connected to DataBase");
        	      System.out.println("Creating Table.....");
        		  String sql = "CREATE TABLE BankAccountDB " + 
                        " (firstName VARCHAR(255) not NULL, " + 
                        " LastName VARCHAR(255), " + 
                        "phoneNumber VARCHAR(30),"+
                        " email VARCHAR(30),"+
                        "AccountNumber INTEGER(6))";
        		stmt.executeUpdate(sql);
        		System.out.println("Table Created");
        		*/
        	} catch (SQLException e) {
        		e.printStackTrace();
        	} catch (ClassNotFoundException e) {
        		// TODO Auto-generated catch block
        		e.printStackTrace();
        	}
        return conn;
            }
          
        
        public void addUserDB(BankAccount newAccount)
    	{
    		
        	String sql = "INSERT INTO BANKACCOUNT (CustomerFirstName,LastName, PhoneNumber, Email,AccountNumber) VALUES (?, ?, ?, ?,?)";
    		 try(Connection connection = getConnection();PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
    			preparedStatement.setString(1, newAccount.getCustFirstName());
    			preparedStatement.setString(2, newAccount.getCustLastName());
    			preparedStatement.setString(3, newAccount.getPhoneNum());
    			preparedStatement.setString(4, newAccount.getEmail());
    			preparedStatement.setInt(5, newAccount.getAccountNum());
    			
    			int rowsInserted = preparedStatement.executeUpdate();
    			if (rowsInserted > 0) {
    			    System.out.println("A new user was inserted successfully!");
    			}
    			} catch (SQLException e) {
    				
    				e.printStackTrace();
    			}
    			
    		}
        public void userAccountInfoDB(String name)
    	{
        	
      String sql = "SELECT * FROM BANKACCOUNT WHERE CustomerFirstName = ? ";
   		ResultSet rs = null;
      try(Connection connection = getConnection();PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
   		   
   			   preparedStatement.setString(1,name);
   			  rs = preparedStatement.executeQuery();
   			while(rs.next()) {
   		        System.out.println("First Name"+ rs.getString("CustomerFirstName")+
   	             " Last Name: " + rs.getString("LastName")+" PhoneNumber: "+
   	           rs.getString("PhoneNumber")+
   	             " Email Address: " +rs.getString("Email")+
   	           " Account Number: " + rs.getInt("AccountNumber"));
   			}
   	            
   	            //System.out.println(FirstName + "\t" +LastName+ "\t" +PhoneNumber+ "\t" +Email+ "\t" +AccountNumber);
   	    

   	    } catch (SQLException ex) {
   	        ex.printStackTrace();
   	    }
    			
    		}
        public void displayAllUsersDB()
    	{
    		
    		Connection connection = getConnection();
    		 try {
    		   
    		    Statement stmt = connection.createStatement();
    		    ResultSet rs = stmt.executeQuery("SELECT CustomerFirstName FROM BANKACCOUNT");

    	        while(rs.next())
    	        {
    	            String FirstName =rs.getString("CustomerFirstName");
    	        
    	           System.out.println(FirstName);
    	        }

    	    } catch (SQLException ex) {
    	        ex.printStackTrace();
    	    }
    		}
        
        public void displayAllUsersInfoDB()
    	{
    		
    		Connection connection = getConnection();
    		 try {
    		   
    		    Statement stmt = connection.createStatement();
    		    ResultSet rs = stmt.executeQuery("SELECT * FROM BANKACCOUNT");

    	        while(rs.next())
    	        {
    	            String FirstName =rs.getString("CustomerFirstName");
    	            String LastName = rs.getString("LastName");
    	            String PhoneNumber = rs.getString("PhoneNumber");
    	            String Email = rs.getString("Email");
    	            int AccountNumber = rs.getInt("AccountNumber");
    	            System.out.println(FirstName + "\t" +LastName+ "\t" +PhoneNumber+ "\t" +Email+ "\t" +AccountNumber);
    	        }

    	    } catch (SQLException ex) {
    	        ex.printStackTrace();
    	    }
    		}
       public void updateUserInfoDB(String CustomerFirstName,String PhoneNumber)
    	{
        	String sql = " UPDATE BANKACCOUNT SET PhoneNumber = ? WHERE CustomerFirstName = ? ";
   		 try(Connection connection = getConnection();PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
   			 
   			preparedStatement.setString(1 , PhoneNumber);
   			preparedStatement.setString(2 , CustomerFirstName);
   			
   			
   			int columnupdated = preparedStatement.executeUpdate();
   			
   			System.out.println(String.format("User Phone Number updated successfully!", columnupdated));
   			
   			} catch (SQLException ex) {
   				
   				//e.printStackTrace();
   				System.out.println(ex.getMessage());
   			}
    		}
        public void deleteOneAccountDB(String FirstName)
    	{
        	String sql = "DELETE FROM BANKACCOUNT WHERE CustomerFirstName=?" ;
   		 try(Connection connection = getConnection();PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
   			
   			 preparedStatement.setString(1, FirstName);
   			 int rowsDelete = preparedStatement.executeUpdate();
   			if (rowsDelete == 1) {
   			    System.out.println("User Account is deleted successfully!");
   			}
   			} catch (SQLException e) {
   				
   				e.printStackTrace();
   			}
   		 //System.out.println("User Account is deleted successfully!");
    		}
        public void deleteAllDB()
    	{
        	String sql = "DELETE FROM BANKACCOUNT" ;
      		 try(Connection connection = getConnection();PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
      			
      			 int rowsDelete = preparedStatement.executeUpdate();
      			if (rowsDelete != 0) {
      			    System.out.println("All user accounts are removed");
      			}
      			} catch (SQLException e) {
      				
      				e.printStackTrace();
      			}
    			
    		}
        
}

