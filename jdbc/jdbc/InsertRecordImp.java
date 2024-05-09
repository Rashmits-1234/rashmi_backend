package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecordImp {
    private Connection connection;
    private Scanner scanner;

    public InsertRecordImp(Connection connection, Scanner scanner) {
        this.connection = connection;
        this.scanner = scanner;
    }

    public void insertRecord() {
        String query = "insert into student(name, percentage, address) values(?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            System.out.println("Please enter the name:");
            preparedStatement.setString(1, scanner.next());

            System.out.println("Please enter the percentage:");
            preparedStatement.setDouble(2, scanner.nextDouble());

            System.out.println("Please enter the address:");
            preparedStatement.setString(3, scanner.next());

            int rows = preparedStatement.executeUpdate();

            if (rows != 0)
                System.out.println("Record inserted successfully!!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
