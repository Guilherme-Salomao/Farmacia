package br.com.alurasenac.farmacia.dao;

import br.com.alurasenac.farmacia.modelo.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Classe para fazer o mapeamento com o banco de dados
public class ProdutoDao {
    //variavel de conexão
    private Connection conn;

    //metodo para recuperar a conexão com o banco
    public ProdutoDao (Connection connection){
        this.conn = connection;
    }

    //Fazendo o Insert no Banco
    public void salvar(Produto produto){
        String sql = "INSERT INTO produto (preco, nome, fabricante)" +
                "VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setDouble(1, produto.getPreco());
            preparedStatement.setString(2, produto.getNome());
            preparedStatement.setString(3, produto.getFabricante());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //Fazendo a consulta no banco de dados
    public List<Produto> listar() {
        PreparedStatement ps;
        ResultSet resultSet;
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produto";

        try {
            ps = conn.prepareStatement(sql);
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                double preco = resultSet.getDouble(2);
                String nome = resultSet.getString(3);
                String fabricante = resultSet.getString(4);
                produtos.add(new Produto(preco, nome, fabricante));
            }
            resultSet.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produtos;
    }

    //ALTERANDO PRODUTO
    public void editar(String nome, double preco){
        PreparedStatement ps;
        String sql = "UPDATE produto SET preco = ? WHERE nome = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setDouble(1, preco);
            ps.setString(2, nome);
            ps.execute();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //EXCLUINDO PRODUTO
    public void deletar(int id){
        PreparedStatement ps;
        String sql = "DELETE FROM produto WHERE id = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setDouble(1, id);
            ps.execute();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
