package com.example.testDB.connection;

import com.example.testDB.model.Person;
import com.example.testDB.repository.impl.PersonDAOImpl;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        JDBCConnector jdbcConnector = new JDBCConnector();
        PersonDAOImpl personDAO = new PersonDAOImpl(jdbcConnector);

        Person person = new Person("Pavel", "Minsk", 22);
        /*personDAO.create(person);*/
        /*personDAO.findAll().forEach(System.out::println);*/
        /*System.out.println(personDAO.findByID(4));*/



        /*personDAO.create(person);*/
        /*try(Connection connection1 = jdbcConnector.getConnection()) {
            System.out.println(connection1.isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }
}
