package DatabaseConnectie;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//De connectie met de database wordt gemaakt.
public class Connection {
     static private java.sql.Connection connection;

        static {
            try {
                connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\MSSQLSERVER;databaseName=NetflixStatistix;integratedSecurity=true;");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    static public List<Map<String, Object>> RunQuery(String sqlcode){
        Statement stmt = null;
        ResultSet rs = null;
        List<Map<String, Object>> result = null;

        try {
            stmt = connection.createStatement();
            rs = stmt.executeQuery(sqlcode);
            result = resultSetToList(rs);
        }

        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (rs != null) try { rs.close(); } catch(Exception ignored) {}
            if (stmt != null) try { stmt.close(); } catch(Exception ignored) {}
        }
        return result;
    }

    static private List<Map<String, Object>> resultSetToList(ResultSet rs) throws SQLException {
        ResultSetMetaData md = rs.getMetaData();
        int columns = md.getColumnCount();
        List<Map<String, Object>> rows = new ArrayList<>();
        while (rs.next()){
            Map<String, Object> row = new HashMap<>(columns);
            for(int i = 1; i <= columns; ++i){
                row.put(md.getColumnName(i), rs.getObject(i));
            }
            rows.add(row);
        }
        return rows;
    }


    }

