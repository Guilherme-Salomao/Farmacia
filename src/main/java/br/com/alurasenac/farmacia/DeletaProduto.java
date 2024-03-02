package br.com.alurasenac.farmacia;

import br.com.alurasenac.farmacia.service.ProdutoService;

public class DeletaProduto {
    public static void main(String[] args) {
        System.out.println("Teste Delete Produto");

        ProdutoService produtoService = new ProdutoService();
        produtoService.deltaProduto(1);
    }
}
