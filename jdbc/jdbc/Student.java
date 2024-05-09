package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;

public class Student {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Scanner scanner = new Scanner(System.in);
			String url ="jdbc:mysql://localhost:3306/jdbc";
			String user = "root";
			String pass = "Sa123";
			
			Connection connection = DriverManager.getConnection(url,user,pass);
			String query="insert into student(name,percentage,address) values (?,?,?)";
			//Statement statement =  connection.createStatement();
			//int excecuteUpdate = statement.excecuteUpdate(query);
			//System.out,println(excecuteUpdate);
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			System.out.println("Enter the Name:");
			preparedStatement.setString(1,scanner.next());
			
			System.out.println("Enter the percentage:");
			preparedStatement.setDouble(2,scanner.nextDouble());
			
			System.out.println("Enter the address:");
			preparedStatement.setString(3,scanner.next());
			
			boolean execute = preparedStatement.execute();
			System.out.println(execute);
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			

	}

}
