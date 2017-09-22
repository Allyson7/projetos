package util;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allyson Lopes
 * JDBC
 */
public class ConexaoPostGreSql {
    public static Connection getConexao() {
        Connection connection = null;
        String url = "org.postgresql.Driver";
        String bd = "jdbc:postgresql://localhost:5432/bd1";
        String usuario = "postgres";
        String senha = "12345";
        try {
            Class.forName(url);
            connection = DriverManager.getConnection(bd, usuario, senha);
            return connection;
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoPostGreSql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoPostGreSql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param stm
     */
    public static void fechar(Statement stm) {
        try {
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoPostGreSql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param con
     */
    public static void fechar(Connection con) {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoPostGreSql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param rs
     */
    public static void fechar(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoPostGreSql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public static void fechar(PreparedStatement stmt) {
        try {
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoPostGreSql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

