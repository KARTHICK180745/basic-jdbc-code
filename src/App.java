import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("java jdbc");
        String url = "jdbc:mysql://localhost:3306/list";
        String username = "root";
        String password = "Sql@1807";
        String query = "select * from patients";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        String userdata = "";
        while(rs.next())
        {
            userdata = rs.getString(1)+":"+rs.getString(2);
            System.out.println(userdata);
        }
        st.close();
        con.close();





    }
}
