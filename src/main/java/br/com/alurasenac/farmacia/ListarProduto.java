package br.com.alurasenac.farmacia;

import br.com.alurasenac.farmacia.service.ProdutoService;

public class ListarProduto {
    public static void main(String[] args) {
        System.out.println("Teste Listar Produtos");

        ProdutoService produtoService = new ProdutoService();
        System.out.println(produtoService.listar());
    }
}
