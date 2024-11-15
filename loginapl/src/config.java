/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TOSHIBA
 */
public class config {
    public static Connection configDB() throws SQLException {
    try {
        String url = "jdbc:mysql://localhost:3306/online_store";
        String user = "root";
        String password = "";
 
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    } catch (SQLException e) {
        System.out.println("Koneksi ke database gagal: " + e.getMessage());
        throw e;
    }
}


    private static class connetion {

        public connetion() {
        }
    }
    
}
