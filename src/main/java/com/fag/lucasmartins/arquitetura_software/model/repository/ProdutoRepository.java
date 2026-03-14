package com.fag.lucasmartins.arquitetura_software.model.repository;

import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;

public class ProdutoRepository {
    ProdutoBO salvar(ProdutoBO bo);

    ProdutoBO buscarPorId(Long id);

}