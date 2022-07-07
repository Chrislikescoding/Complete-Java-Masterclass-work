package com.example.mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class db2Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            System.out.println("Trying to Connect...");
            String DRIVER = "com.ibm.as400.access.AS400JDBCDriver";
            String URL = "jdbc:as400://10.231.1.10";
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, "CSHARP", "");
            Statement stmt = conn.createStatement();
//      //      ResultSet rs = stmt.executeQuery("Select CHANGED,USED,ODLBNM, ODOBNM from csharp.archmnup ");
            ResultSet rs = stmt.executeQuery("select CHANGED,ODLBNM, ODOBNM, MCMENU,MCPGMC \n " +
                    "from csharp.archmnup join mglibr35.mgfpcomd on \n" +
                   "odobnm = mcpgmc  ");
            // MGFPOPTN OPOPAT SUSP
//            ResultSet rs = stmt.executeQuery(" mglibr35.mgfpcomd " +
//                    "set x = y  where mcpgmc = 'COMMISRPT'                          ");

        //    String name;
            String changed;
            String used;
            String lib;
            String name;
            String menuName;
            String programCalled;
            System.out.println("Connected with " + conn);
            System.out.println("CHANGED|Library|ODOBNM|MENU NAME|PROGRAM CALLED");
            while (rs.next()) {
                changed = rs.getString("CHANGED");
         //       used = rs.getString("USED");
                lib = rs.getString("ODLBNM");
                name = rs.getString("ODOBNM");
                menuName = rs.getString("MCMENU");
                programCalled = rs.getString("MCPGMC");
              //  sts = rs.getString("STATUS");
                System.out.println(changed + "  " + "  " + lib + "  " + name + " " + menuName + " " + programCalled + "");
            }
            conn.close();
            System.exit(0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

