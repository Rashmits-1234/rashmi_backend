package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectRecordImp {
    private Connection connection;
    private Scanner scanner;

    public SelectRecordImp(Connection connection, Scanner scanner) {
        this.connection = connection;
        this.scanner = scanner;
    }

    public void selectRecord() throws SQLException {
        System.out.println("Enter roll number to find the result:");
        int number = Integer.parseInt(scanner.nextLine());
        String query = "SELECT * FROM student WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, number);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int rollNumber = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double percentage = resultSet.getDouble("percentage");
                String address = resultSet.getString("address");

                System.out.println("Roll number: " + rollNumber);
                System.out.println("Name: " + name);
                System.out.println("Percentage: " + percentage);
                System.out.println("Address: " + address);
                System.out.println("=========================");
            } else {
                System.out.println("No record found for roll number: " + number);
            }
        }
    }
}
