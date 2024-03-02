package br.com.alurasenac.farmacia;

import br.com.alurasenac.farmacia.modelo.Produto;
import br.com.alurasenac.farmacia.service.ProdutoService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CadastraProduto {
    public static void main(String[] args) {
        System.out.println("Teste Cadastra Produto");

        Produto produto = new Produto(25, "Doril","EMS");
        ProdutoService produtoService = new ProdutoService();
        produtoService.cadastrar(produto);
    }
}