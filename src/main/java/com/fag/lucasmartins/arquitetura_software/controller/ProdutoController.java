package com.fag.lucasmartins.arquitetura_software.controller;

import com.fag.lucasmartins.arquitetura_software.controller.mapper.ProdutoDTOMapper;
import com.fag.lucasmartins.arquitetura_software.view.dto.ProdutoDTO;
import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.model.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity<ProdutoDTO> criarProduto(@Valid @RequestBody ProdutoDTO dto) {

        ProdutoBO produtoBO = ProdutoDTOMapper.toBo(dto);

        ProdutoBO produtoCriadoBO = produtoService.criarProduto(produtoBO);

        ProdutoDTO produtoCriadoDTO = ProdutoDTOMapper.toDto(produtoCriadoBO);

        return ResponseEntity
                .status(201)
                .body(produtoCriadoDTO);
    }
}
