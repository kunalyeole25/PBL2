/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
public class DBConnection {
	
	public static Connection getConnection() {
		//Properties prop = DBProperties.getDBProperties();
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost/crm?useSSL = false";
			String username = "root";
			String password = "sdidd";
			Class.forName(driver);
			try {
				Connection connection = DriverManager.getConnection(url,username,password);
				System.out.println("DB Connected");
				return connection;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
		
	}

	public static int loginUser(String username, String password) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		String query = "select * from users where username = ?";
		
			try{
	        PreparedStatement pStatement = connection.prepareStatement(query);
	        pStatement.setString(1,username);
	        
	        ResultSet resultSet = pStatement.executeQuery();
	        if(resultSet.next() == true)
	        {
	        String pass = resultSet.getString(2);
	    
	        System.out.println(pass);
	               if(password.equals(pass))
	                {
	                    System.out.println("in side returnlogin value function");
	                    return 1;
	                }
	        }
	        }
	        catch(SQLException e)
	        {
	            e.printStackTrace();
	        }
		return 0;
	}
}