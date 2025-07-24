import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class registerDao {
    private static final String jdbcURL = "jdbc:mysql://localhost:3306/registrationform";
    private static final String jdbcUsername = "root";
    private static final String jdbcPassword = "001906";
    private static final String dbDriver = "com.mysql.cj.jdbc.Driver";

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(dbDriver);
            con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public boolean insert(Member member) {
        boolean result = false;
        String sql = "INSERT INTO member_register(username,email,password,phone) VALUES (?,?,?,?)";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, member.getUsername());
            ps.setString(2, member.getEmail());
            ps.setString(3, member.getPassword());
            ps.setString(4, member.getPhone());

            int rows = ps.executeUpdate();   // <--- execute
            result = rows > 0;               // <--- set result
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}