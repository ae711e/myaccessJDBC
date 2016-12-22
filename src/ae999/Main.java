package ae999;

/*
 Чтение данных из Access 2010
 Использует библиотеку  UCanAccess http://ucanaccess.sourceforge.net/site.html
 (
  эта библиотека требует еще 5 бибилиотек - они есть в дистрибутиве UCanAccess подкаталог lib:
   UCanAccess (ucanaccess-x.x.x.jar)
   HSQLDB (hsqldb.jar, version 2.2.5 or newer)
   Jackcess (jackcess-2.x.x.jar)
   commons-lang (commons-lang-2.6.jar, or newer 2.x version)
   commons-logging (commons-logging-1.1.1.jar, or newer 1.x version)
 )
  
 */

import java.sql.*;

public class Main {

    public static void main(String[] args) {
      // write your code here
  
      Connection conn;
      try {
        conn = DriverManager.getConnection("jdbc:ucanaccess://C:/tmp/Database1.accdb");
        Statement s = conn.createStatement();
  
        ResultSet rs = s.executeQuery("SELECT * FROM view3");
        while (rs.next()) {
          System.out.println(rs.getString(1)+" "+ rs.getString("val"));
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
      //
    }
    
}// end of class Main

