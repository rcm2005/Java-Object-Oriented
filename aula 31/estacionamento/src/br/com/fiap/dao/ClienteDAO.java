package br.com.fiap.dao;

import br.com.fiap.dto.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {

    private Connection con;

    public ClienteDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public String inserir(Cliente cliente){
        String sql = "insert into ddd_cleinte(id_cliente, nome_cliente, placa) values(?,?,?)";
        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
            ps.setInt(1, cliente.getIdCliente());
            ps.setString(2, cliente.getNomeCliente());
            ps.setString(3, cliente.getPlaca());

            if (ps.executeUpdate() > 0){
                return "Inserido com sucesso";
            }
            else {
                return "Erro ao inserir";
            }
        } catch (SQLException e){
            return "Erro de SQL: " + e.getMessage();
        }
    }

    public String alterar(Cliente cliente){
        String sql = "update ddd_cleinte set nome_cliente = ?, placa =? where id_cliente=?";
        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
            ps.setInt(3, cliente.getIdCliente());
            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getPlaca());

            if (ps.executeUpdate() > 0){
                return "Inserido com sucesso";
            }
            else {
                return "Erro ao inserir";
            }
        } catch (SQLException e){
            return "Erro de SQL: " + e.getMessage();
        }
    }

    public String excluir(Cliente cliente){
        String sql = "delete from ddd_cleinte where id_cliente=?";
        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
            ps.setInt(1, cliente.getIdCliente());

            if (ps.executeUpdate() > 0){
                return "Inserido com sucesso";
            }
            else {
                return "Erro ao inserir";
            }
        } catch (SQLException e){
            return "Erro de SQL: " + e.getMessage();
        }
    }
    public ArrayList<Cliente> listarTodos(){
        String sql = "select * from ddd_cliente order by id_cliente";
        ArrayList <Cliente> lisCliente = new ArrayList<Cliente>();
        try ( PreparedStatement ps = getCon().prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while (rs.next()){
                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(rs.getInt("id_cliente"));
                    cliente.setNomeCliente(rs.getString("nome_cliente"));
                    cliente.setPlaca(rs.getString("placa"));
                    lisCliente.add(cliente);
                }
                return lisCliente;
            }else{
                return null;
            }
        }catch (SQLException e){
            System.out.println("Erro de sql"+e.getMessage());
            return null;
        }
    }
}
