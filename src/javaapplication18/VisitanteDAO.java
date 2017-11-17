/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 11944413600
 */
public class VisitanteDAO {
    private Connection conexao;
    private PreparedStatement operacaoEntrada;
    private PreparedStatement operacaoListar;
    private PreparedStatement operacaoSaida;

    public VisitanteDAO() throws Exception {
        this.conexao = ConexaoJavaDB.getConnection();
        this.operacaoEntrada = conexao.prepareStatement("INSERT INTO visitante (nome,idade) VALUES (?,?)");
        this.operacaoListar = conexao.prepareStatement("SELECT * FROM visitante");
        this.operacaoSaida = conexao.prepareStatement("UPDATE visitante SET saida = CURRENT_TIMESTAMP WHERE id=? AND saida IS NULL");
    }
    
    public void criar(Visitante v) throws SQLException{
        operacaoEntrada.clearParameters();
        operacaoEntrada.setString(1, v.getNome());
        operacaoEntrada.setInt(2, v.getIdade());
        operacaoEntrada.executeUpdate();
    }
    
    public void alterar(Visitante v) throws SQLException{
        operacaoSaida.clearParameters();
        operacaoSaida.setLong(1, v.getId());
        operacaoSaida.executeUpdate();
    }
    
    public List<Visitante> lista() throws SQLException{
        List<Visitante> visitantes = new ArrayList();
        operacaoListar.clearParameters();
        ResultSet rs = operacaoListar.executeQuery();
        while(rs.next()){
            Visitante v = new Visitante( rs.getLong("id"), rs.getString("nome"), rs.getInt("idade"), rs.getDate("entrada"), rs.getDate("saida"));
            visitantes.add(v);
        }
        return visitantes;
    }
    
    
}
