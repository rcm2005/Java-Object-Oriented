package br.com.fiap.dao;

import br.com.fiap.dto.Carro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CarroDAO {
    private Connection con;

    public CarroDAO(Connection con){
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public String inserir(Carro carro){
        String sql = "insert into ddd_carro(placa,cor,descricao,ano) values(?,?,?,?)";
        try (PreparedStatement ps = getCon().prepareStatement(sql);){
            ps.setString(1,carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3,carro.getDescricao());
            ps.setInt(4, carro.getAno());

            if (ps.executeUpdate() > 0){
                return "Inserido com sucesso";
            } else{
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return "Erro de sql: " + e.getMessage();
        }
    }
}
