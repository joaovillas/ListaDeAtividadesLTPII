package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteJDBCDriverConnection {
    
    public Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:Atividades.bd";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            //System.out.println("A conexão com o banco de dados ocorreu com sucesso!");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        
        return conn;
    }
    
    public static void criaTabelaAtividade (Connection conn) {
        
        String sql = "CREATE TABLE IF NOT EXISTS Atividade (";
                sql += "	codigo integer not null PRIMARY KEY autoincrement,";
                sql += "	matricula varchar(4) not null,";
                sql += "	nome varchar(20) not null,";
                sql += "	data varchar(8),";
                sql += "	local varchar(50),";
                sql += "	descricao varchar(500)";
                sql += ");";
        
        try {
                Statement stmt = conn.createStatement();
                
            // cria uma tabela
            stmt.execute(sql);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void criaTabelaCategoria (Connection conn) {
        
        String sql = "CREATE TABLE IF NOT EXISTS Categoria (";
                sql += "	codigo integer not null PRIMARY KEY autoincrement,";
                sql += "	categoria varchar(30) not null";
                sql += ");";
        
        try {
                Statement stmt = conn.createStatement();
                
            // cria uma tabela
            stmt.execute(sql);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void insereDadosAtividade (Connection conn, int codigo, String matricula, String nome, String data, String local, String descricao) {
        String sql = "INSERT INTO Atividade VALUES(?,?,?,?,?,?)";
 
        try {
                PreparedStatement pstmt = conn.prepareStatement(sql); 
                
                pstmt.setInt(1, codigo);
                pstmt.setString(2, matricula);
                pstmt.setString(3, nome);
                pstmt.setString(4, data);
                pstmt.setString(5, local);
                pstmt.setString(6, descricao);
                
                pstmt.executeUpdate();
                
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void insereDadosCategoria (Connection conn, int codigo, String categoria) {
        String sql = "INSERT INTO Categoria VALUES(?,?)";
 
        try {
                PreparedStatement pstmt = conn.prepareStatement(sql); 
                
                pstmt.setInt(1, codigo);
                pstmt.setString(2, categoria);
                
                pstmt.executeUpdate();
                
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    

    /*public static void testar() {
        
        SQLiteJDBCDriverConnection bd = new SQLiteJDBCDriverConnection();
        
        Connection conn = bd.connect();
        
        bd.criaTabelaAtividade(conn);
        
        bd.insereDadosAtividade(conn, 0, "01","joao","33/33/3333","salvador","testando");
        
        bd.insereDadosAtividade(conn, 1, "02","victor","44/44/4444","salvador","testando2");
        
    }
*/
    
}
