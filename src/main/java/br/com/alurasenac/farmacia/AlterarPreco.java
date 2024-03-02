package br.com.alurasenac.farmacia;

import br.com.alurasenac.farmacia.modelo.Produto;
import br.com.alurasenac.farmacia.service.ProdutoService;

public class AlterarPreco {
    public static void main(String[] args) {
        System.out.println("Teste Altera Produto");

        ProdutoService produtoService = new ProdutoService();
        produtoService.alteraPreco("Dipirona", 4);

    }
}
