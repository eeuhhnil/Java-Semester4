import java.sql.*;
import java.util.List;

public class JDBCPostgres {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;

        String url="jdbc:postgresql://localhost:5432/postgres";
        String user="postgres";
        String password="161101";

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);

            DatabaseMetaData dbmd = conn.getMetaData();

            System.out.println("Driver Name: " + dbmd.getDriverName());
            System.out.println("User Name: " + dbmd.getUserName());

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        ItemDAO itemDAO = new ItemDAO(conn);

        System.out.println("===== Test searchById() =====");
        MusicItem item = itemDAO.searchById(1);
        System.out.println((item.toString()));

        System.out.println("===== Test searchByKeyWord() =====");
        List<MusicItem> items = itemDAO.searchByKeyWord("M");
        for(MusicItem i : items) {
            System.out.println(i.toString());
        }

//        System.out.println("===== Test create() =====");
//        MusicItem tmp = new MusicItem(99, "abc", "abc", "2023-01-01", 123,123, 1);
//        int result = itemDAO.create((tmp));
//        System.out.println(result);
//
//        conn.close();
    }
}