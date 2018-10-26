package com.produtos.produtosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.produtos.produtosapi.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	Produto findById(long id);
}
