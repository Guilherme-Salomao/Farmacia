package br.com.alurasenac.farmacia.service;

import br.com.alurasenac.farmacia.dao.ConnectionFactory;
import br.com.alurasenac.farmacia.dao.ProdutoDao;
import br.com.alurasenac.farmacia.modelo.Produto;

import java.sql.Connection;
import java.util.List;


public class ProdutoService {
    private ConnectionFactory connection;

    public ProdutoService(){
        this.connection = new ConnectionFactory();
    }

    //FAZER AS VALIDAÇÕES E CADASTRO.
    public void cadastrar(Produto produto){
       Connection conn = connection.recuperarConexao();
        new ProdutoDao(conn).salvar(produto);
    }

    //BUSCA DE DADOS NO BANCO
    public List<Produto> listar(){
        Connection conn = connection.recuperarConexao();
        return new  ProdutoDao(conn).listar();
    }

    //BUSCA DE DADOS NO BANCO
     public void alteraPreco(String nome, double preco){
        Connection conn = connection.recuperarConexao();
        new ProdutoDao(conn).editar(nome, preco);
    }

    //BUSCA DE DADOS NO BANCO
    public void deltaProduto(int id){
        Connection conn = connection.recuperarConexao();
        new ProdutoDao(conn).deletar(1);
    }
}
