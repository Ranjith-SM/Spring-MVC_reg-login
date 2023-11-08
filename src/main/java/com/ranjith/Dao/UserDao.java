package com.ranjith.Dao;

import com.ranjith.DbCon.DbCon;
import com.ranjith.Model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UserDao {
    private static final String INSERT_USER = "INSERT INTO form_users(email,pwd,fname,lname,country,state,language,os) VALUES(?,?,?,?,?,?,?,?);";
    private static final String CHECK_USER = "SELECT email,pwd FROM form_users WHERE email=? AND pwd=?;";
    private static final String ALL_USERS = "SELECT fname,lname,country,state,language,os FROM form_users;";
    private static Connection connection = null;

    public UserDao() {
        connection = DbCon.getconnection();
    }


    public static User checkUser(String email, String pwd) {
        User user = null;
        try {
            PreparedStatement ps = connection.prepareStatement(CHECK_USER);
            ps.setString(1, email);
            ps.setString(2, pwd);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                user = new User();
                user.setEmail(rs.getString("email"));
                user.setPwd(rs.getString("pwd"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    public static List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(ALL_USERS);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                User user = new User();
                user.setFirstName(rs.getString("fname"));
                user.setLastName(rs.getString("lname"));
                user.setCountry(rs.getString("country"));
                user.setState(rs.getString("state"));
                user.setFavoriteLanguage(rs.getString("language"));
                user.setOperatingSystem(rs.getString("os"));
                users.add(user);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

//    public static void AddUser(String email, String pwd, String fname, String lname, String country, String state, String language, String os) {
//        try {
//            PreparedStatement ps = connection.prepareStatement(INSERT_USER);
//            ps.setString(1, email);
//            ps.setString(2,pwd);
//            ps.setString(3,fname);
//            ps.setString(4,lname);
//            ps.setString(5,country);
//            ps.setString(6,state);
//            ps.setString(7,language);
//            ps.setString(8,os);
//
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public void addUser(User user) {
        try {
            PreparedStatement ps = connection.prepareStatement(INSERT_USER);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPwd());
            ps.setString(3, user.getFirstName());
            ps.setString(4, user.getLastName());
            ps.setString(5, user.getCountry());
            ps.setString(6, user.getState());
            ps.setString(7, user.getFavoriteLanguage());
            ps.setString(8, user.getOperatingSystem());

            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
