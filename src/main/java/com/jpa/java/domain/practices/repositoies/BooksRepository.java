package com.jpa.java.domain.practices.repositoies;

import com.jpa.java.domain.practices.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {
}
