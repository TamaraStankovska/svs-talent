package repository;

import book.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long>{

    Book findByTitle(String title);
    Book findByIsbn(String isbn);
    Book findById(Long id);

}
