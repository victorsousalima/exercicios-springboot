package br.com.cod3r.exerciciossb.model.repositories;

import br.com.cod3r.exerciciossb.model.entites.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>  {
    //CrudRepository<Produto, Integer>

    Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

//    findByNomeContaining
//    findByNomeIsContaining
//    findByNomeContains

//    findByNomeStartsWith
//    findByNomeEndsWith

//    findByNomeNotContaining
}
