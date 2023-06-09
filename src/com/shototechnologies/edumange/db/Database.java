package com.shototechnologies.edumange.db;

import com.shototechnologies.edumange.model.Program;
import com.shototechnologies.edumange.model.Student;
import com.shototechnologies.edumange.model.Teacher;
import com.shototechnologies.edumange.model.User;
import com.shototechnologies.edumange.util.security.PasswordManager;

import java.util.ArrayList;

public class Database {
    public static ArrayList<User> userTable = new ArrayList<>();
    public static ArrayList<Student> studentTable = new ArrayList<>();
    public static ArrayList<Teacher> teacherTable = new ArrayList<>();
    public static ArrayList<Program> programTable = new ArrayList<>();

    static {
        userTable.add(new User("Hasantha",
                "karunachandra",
                "hasa@gmail.com",
                new PasswordManager().encrypt("1234")));
    }
}
