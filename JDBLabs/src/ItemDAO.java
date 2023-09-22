import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO {
    private Connection conn;

    public ItemDAO(Connection conn) {
        this.conn = conn;
    }

    public MusicItem searchById(int id) {
        String sql = "SELECT * FROM Item WHERE item_id = " + id;

        try (Statement stmt = conn.createStatement()) {
            try (ResultSet rs = stmt.executeQuery(sql)) {
                if (rs.next()) {
                    return new MusicItem(
                            rs.getInt("item_id"),
                            rs.getString("title"),
                            rs.getString("artist"),
                            rs.getString("releasedate"),
                            rs.getFloat("listprice"),
                            rs.getFloat("price"),
                            rs.getInt("version")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<MusicItem> searchByKeyWord(String key) {
        ArrayList<MusicItem> result = new ArrayList<>();
        String sql = "SELECT * FROM Item WHERE title LIKE '%" + key + "%'";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                result.add(new MusicItem(
                        rs.getInt("item_id"),
                        rs.getString("title"),
                        rs.getString("artist"),
                        rs.getString("releasedate"),
                        rs.getFloat("listprice"),
                        rs.getFloat("price"),
                        rs.getInt("version")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int create(MusicItem item) {
        String sql = String.format(
                "INSERT INTO Item VALUES(%d, '%s', '%s', '%s', %f, %f, %d)",
                item.getId(),
                item.getName(),
                item.getArtist(),
                item.getReleaseDate(),
                item.getListPrice(),
                item.getPrice(),
                item.getVersion());

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            return stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}