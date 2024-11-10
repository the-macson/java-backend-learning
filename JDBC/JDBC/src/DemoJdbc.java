import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
            import package
            load and register
            create connection
            create statement
            execute statement
            process the result
            close
         */
        String url = "jdbc:postgresql://localhost:5432/lms";
        String username = "mukesh";
        String password = "root";
        String query = "select * from \"Users\" u";
        Integer cid = 30;
        String course = "Java";
//        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery(query);
//        while (rs.next()) {
//            System.out.println(rs.getString("name"));
//        }
//        while (rs.next()){
//            System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3));
//        }

        String query1 = "insert into \"Courses\" values(32,'java', 'Java Description','1','2024-06-21 07:28:03.476 +0530', '2024-06-21 07:28:03.476 +0530')";
//        st.execute(query1);
        // Prepared statement
        String query2 = "insert into \"Courses\" values(?,?,?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, cid);
        pst.setString(2, course);
//        and so on
        pst.execute();
        con.close();

        System.out.println("Connected to PostgreSQL database");
    }
}
