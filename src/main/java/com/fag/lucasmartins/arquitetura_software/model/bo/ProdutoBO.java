package com.fag.lucasmartins.arquitetura_software.model.bo;

public class ProdutoBO {
    
    private Long id;

    private String nome;

    private Double preco;

    private Integer estoque;

    public ProdutoBO() {
    }

    public ProdutoBO(Long id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
    }

    public ProdutoBO(Long id, String nome, Double preco, Integer estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void validarPremium() {

        if (nome != null && nome.toLowerCase().contains("premium")) {
            if (preco < 100.0) {
                throw new RuntimeException(
                        "Produtos Premium não podem custar menos que R$100"
                );
            }
        }

    }

    public Double calcularPrecoFinal() {

        if (estoque != null && estoque >= 50) {
            return preco - (preco * 0.10);
        }

        return preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
}
