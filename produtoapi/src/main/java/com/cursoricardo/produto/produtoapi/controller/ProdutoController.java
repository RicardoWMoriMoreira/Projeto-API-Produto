package com.cursoricardo.produto.produtoapi.controller;

import com.cursoricardo.produto.produtoapi.model.Produto;
import com.cursoricardo.produto.produtoapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

// ==========================================================

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    // =============================================================

    private ProdutoRepository produtoRepository;

    // =============================================================

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    // =============================================================
    // Metodo que Cria um novo Objeto

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {

        System.out.println("Salvando com sucesso" + produto);

        var id = UUID.randomUUID().toString();

        produto.setId(id);

        produtoRepository.save(produto);

        return produto;
    }

    // =============================================================
    // Metodo que Lê um Objeto da tabela, neste caso, por ID

    @GetMapping("{id}")
    public Produto obterProduto(@PathVariable("id") String id) {

        return produtoRepository.findById(id).orElse(null);

    }

    @DeleteMapping("{id}")
    public void deletarPorId(@PathVariable("id") String id){
        produtoRepository.deleteById(id);
    }

    // =============================================================
    // Metodo que Atualiza um Objeto da tabela, neste caso, por ID

    @PutMapping("{id}")
    public void AtualizarProdutoPorId(@PathVariable("id") String id,
                                      @RequestBody Produto produto) {
        produto.setId(id);
        produtoRepository.save(produto);
    }

    // =============================================================
    // Metodo que Atualiza um Objeto da tabela, neste caso, por nome
    @GetMapping
    public List<Produto> buscar(@RequestParam("nome") String nome){
        return produtoRepository.findByNome(nome);
    }
}
