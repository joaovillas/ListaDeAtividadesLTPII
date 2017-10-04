package sqlite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ModeloAtividades {
    
    private int codigo;
    private String matricula;
    private String nome;
    private String data;
    private String local;
    private String descricao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
    
    
}
