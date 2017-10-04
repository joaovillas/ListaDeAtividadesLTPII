package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Categorias.JIFrameCategoriasInserir;
import javax.swing.JComboBox;

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
    
    
    
    
    
    
    
    
    
    
    //ATIVIDADE
    public static void criaTabelaAtividade (Connection conn) {
        
        String sql = "CREATE TABLE IF NOT EXISTS Atividade (";
                sql += "	codigo integer not null PRIMARY KEY autoincrement,";
                sql += "	matricula varchar(4) not null,";
                sql += "	nome varchar(20) not null,";
                sql += "	categoria varchar(20) not null,";
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
    
      
   
   
       public static void insereDadosAtividade (Connection conn, int matricula, String nome, String categoria, String data, String local, String descricao) {
        String sql = "INSERT INTO Atividade (matricula, nome, categoria, data, local, descricao) VALUES(?,?,?,?,?,?)";
 
        try {
                PreparedStatement pstmt = conn.prepareStatement(sql); 
                
         
                pstmt.setInt(1, matricula);
                pstmt.setString(2, nome);
                pstmt.setString(3, categoria);
                pstmt.setString(4, data);
                pstmt.setString(5, local);
                pstmt.setString(6, descricao);
                
                pstmt.executeUpdate();
                
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void alteraDadosAtividade (Connection conn, String nome, String data, String local, String descricao , int matricula){
        
        String sql = "UPDATE Atividade SET nome= ?,data=? ,local = ? ,descricao =? WHERE matricula = ?";
        
        try{
                PreparedStatement pstmt = conn.prepareStatement(sql); 
                
                pstmt.setString(1, nome);
                pstmt.setString(2, data);
                pstmt.setString(3, local);
                pstmt.setString(4, descricao);
                pstmt.setInt(5, matricula);
                pstmt.executeUpdate();
        
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    
    
    public static void deletarDadosAtividade (Connection conn, int matricula){
        
        String sql = "DELETE FROM Atividade WHERE matricula=?";
        
        try{
                PreparedStatement pstmt = conn.prepareStatement(sql); 
                
                pstmt.setInt(1, matricula);
                pstmt.executeUpdate();
        
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //CATEGORIA 
    
    public static void insereDadosCategoria (Connection conn, int codigo, String categoria) {
        String sql = "INSERT INTO Categoria VALUES(?,?)";
 
        try {
                PreparedStatement pstmt = conn.prepareStatement(sql); 
                
                //pstmt.setInt(1, codigo);
                pstmt.setString(2, categoria);
                
                pstmt.executeUpdate();
                
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    
    private String x;
    
    public static void selecionaDadosCategoria (Connection conn) {
        
        String sql = "SELECT codigo, categoria "
                     + "FROM Categoria;";
        
        
        try {
            
            Statement comandoSql = conn.createStatement();
            
            ResultSet rs  = comandoSql.executeQuery(sql);
                
            // loop no resultado
          
           /* while (rs.next()) {
                
                System.out.println(rs.getInt("codigo") +  "\t" + 
                                  rs.getString("categoria"));  
                
                

            }*/
           
       /* jcomb.removeAllItems(); //remove os itens atuais do comboBox.
            ArrayList produtos = produtoDAO.findAll(); //'produtoDAO' é meu objeto que retorna os produtos do banco.
            Iterator i = produtos.iterator();
            while(i.hasNext()) {
            comboBox.addItem(String.valueOf(i.next()));
        }*/
            
             
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    public static void visualizarCategoria (Connection conn, int codigo, String categoria){
        
    }
    

    /*public static void testar() {
        
        SQLiteJDBCDriverConnection bd = new SQLiteJDBCDriverConnection();
        
        Connection conn = bd.connect();
        
        bd.criaTabelaAtividade(conn);
        
        bd.insereDadosAtividade(conn, 0, "01","joao","33/33/3333","salvador","testando");
        
        bd.insereDadosAtividade(conn, 1, "02","victor","44/44/4444","salvador","testando2");
        
    }
*/

    public void criaTabelaCategoria(Connection conn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
