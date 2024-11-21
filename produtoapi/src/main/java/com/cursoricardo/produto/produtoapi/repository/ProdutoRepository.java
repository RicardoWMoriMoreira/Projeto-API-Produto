package com.cursoricardo.produto.produtoapi.repository;

import com.cursoricardo.produto.produtoapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
    List<Produto> findByNome(String nome);
}
