/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.sql.*;

/**
 *
 * @author Cobby Dollar
 */
public class MusicRetailDBCrud {

    /* unzip the mysql-connector-java-3.1.11-bin.jar file. Place the com folder (and org) folder in same directory as this file
     */
    java.sql.Connection conn = null;

 
    public void initialize() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = java.sql.DriverManager.getConnection(
                    "jdbc:mysql://localhost/musicretail?user=root&password=9144");

        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
        System.out.println("Connection established");
    }

    public void listAll() {
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

        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
    }

    public void addRecord() {
        Scanner in = new Scanner(System.in);

        System.out.println("enter  Song ID");
        int song_ID = in.nextInt();

        System.out.println("enter  Song Title");
        String song_title = in.next();

        System.out.println("enter artist name");
        String artist_Name = in.next();

        System.out.println("enter release Year");
        int release_Year = in.nextInt();

        System.out.println("enter genre");
        String genre = in.next();

        System.out.println("DONE!!!");
        try {
            PreparedStatement p = conn.prepareStatement(
                    "Insert Into song set song_ID=?, song_title=? ,artist_Name =?,release_Year =?,genre=?");
            p.setInt(1, song_ID);
            p.setString(2, song_title);
            p.setString(3, artist_Name);
            p.setInt(4, release_Year);
            p.setString(5, genre);
            p.execute();  //use execute if no results expected back
        } catch (Exception e) {
            System.out.println("Error" + e.toString());
            return;
        }
//    do another raw insert
//        try {
//            PreparedStatement p2 = conn.prepareStatement(" insert into song where artist_name='sarkodie'");
//            p2.execute();
//            p2.close();
//        } catch (Exception e) {
//            System.out.println("Error" + e.toString());
//            return;
//        }
    }

}//class

