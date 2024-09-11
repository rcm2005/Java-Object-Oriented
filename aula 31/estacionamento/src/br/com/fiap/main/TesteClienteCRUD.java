package br.com.fiap.main;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;
import java.util.ArrayList;

public class TesteClienteCRUD {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();
        ClienteDAO clienteDAO = new ClienteDAO(con);
        Cliente cliente = new Cliente();

        // inserir cliente
        cliente.setIdCliente(1);
        cliente.setNomeCliente("Astrogildo");
        cliente.setPlaca("Jkk1900");
        System.out.println(clienteDAO.inserir(cliente));

        cliente.setIdCliente(2);
        cliente.setNomeCliente("Berisvaldo");
        cliente.setPlaca("Jkk1901");
        System.out.println(clienteDAO.inserir(cliente));

        cliente.setIdCliente(3);
        cliente.setNomeCliente("Gumercindo");
        cliente.setPlaca("Jkk1902");
        System.out.println(clienteDAO.inserir(cliente));

        cliente.setIdCliente(4);
        cliente.setNomeCliente("Parafau");
        cliente.setPlaca("Jkk1903");
        System.out.println(clienteDAO.inserir(cliente));

        ConnectionFactory.fecharConexao(con);


        ArrayList<Cliente> resultado = clienteDAO.listarTodos();
        if(resultado !=null){
            for (Cliente cliente1 : resultado){
                System.out.println("id: " + cliente1.getIdCliente());
                System.out.println("Nome: " + cliente1.getNomeCliente());
                System.out.println("id: " + cliente1.getPlaca());
            }
        }
    }
}
