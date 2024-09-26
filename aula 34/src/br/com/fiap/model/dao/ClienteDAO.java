package br.com.fiap.model.dao;

import br.com.fiap.model.dto.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO implements IDAO {
    private Connection con;
    private Cliente cliente;

    public ClienteDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public String inserir(Object object) {
        cliente = (Cliente) object;
        String sql = "insert into ddd_cliente(nome_cliente,placa) values(?,?)";
        try (PreparedStatement ps = getCon().prepareStatement(sql)) {
            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getPlaca());
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    public String alterar(Object object) {
        cliente = (Cliente) object;
        String sql = "update ddd_cliente set nome_cliente=?,placa=? where id_cliente=?";
        try (PreparedStatement ps = getCon().prepareStatement(sql)) {
            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getPlaca());
            ps.setInt(3, cliente.getIdCliente());
            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso.";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    public String excluir(Object object) {
        cliente = (Cliente) object;
        String sql = "delete from ddd_cliente where id_cliente=?";
        try (PreparedStatement ps = getCon().prepareStatement(sql)) {
            ps.setInt(1, cliente.getIdCliente());
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    public String listarUm(Object object) {
        cliente = (Cliente) object;
        String sql = "select * from ddd_cliente where id_cliente=?";
        try (PreparedStatement ps = getCon().prepareStatement(sql)) {
            ps.setInt(1, cliente.getIdCliente());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return "Id: " + cliente.getIdCliente() + "\nNome: " + rs.getString("nome_cliente") + "\nPlaca: " + rs.getString("placa");
            } else {
                return "Registro não encontrado!";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }
}
