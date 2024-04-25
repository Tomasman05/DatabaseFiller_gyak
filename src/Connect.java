import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Connect {
    private Connection conn;

    public Connect(){
        conn=null;
    }
    public void connecting(){
        String url="jdbc:mariadb://localhost:3306/diak_konyvtarVizsga?user=diak&password=123";
        try {
            conn = DriverManager.getConnection(url); 
        } catch (SQLException e) {
            System.out.println("Hiba a kapcsolódás során:\n"+ e);
        }
        if (conn!=null) {
            System.out.println("Sikeres kapcsolat");
        }else{
            System.out.println("Nincs kapcsolat");
        }
    }
    public void closeConnect(){
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("Hiba a kapcsolat zárása közben.");
        }
    }
    public Connection getConnection() {
        return conn;
    }

}
