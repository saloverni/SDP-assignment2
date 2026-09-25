package org.example;

import org.example.database.*;

public class Main {
    public static void main(String[] args) {
        String type = "MariaDB";
        Database db;

        // A lot of if/else in client code
        // Client depends on concrete classes
        // Adding a new type requires modifying existing client code
        if (type.equals("MariaDB")) {
            db = new MariaDB();
        } else if (type.equals("PostgreSQL")) {
            db = new PostgreSQL();
        } else if (type.equals("SQLite")) {
            db = new SQLite();
        } else {
            throw new IllegalArgumentException();
        }

        System.out.println(db.connect());
    }
}
