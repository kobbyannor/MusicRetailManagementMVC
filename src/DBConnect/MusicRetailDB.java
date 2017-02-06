/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnect;

import java.sql.*;

/**
 *
 * @author Cobby Dollar
 */
public class MusicRetailDB {

    public static void main(String[] args) {

        java.sql.Connection conn = null;

        System.out.println("This program demos DB connectivity for MusicRetailManagement database");

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = java.sql.DriverManager.getConnection(
                    "jdbc:mysql://localhost/ghamro?user=root&password=9144");

        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }

        System.out.println("Connection established");

        try {
            java.sql.Statement s = conn.createStatement();
            java.sql.ResultSet r = s.executeQuery("SELECT * FROM song");
            while (r.next()) {
                System.out.println(
                        r.getString("song_ID") + " "
                        + r.getString("song_title") + " "
                        + r.getString("artist_Name") + " "
                        + r.getString("release_Year") + " "
                        + r.getString("genre"));
            }

            r.close();
            s.close();
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
    }
}
