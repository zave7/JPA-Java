package com.jpa.java.domain.practices.repositoies;

import com.jpa.java.domain.practices.entities.Tags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagsRepository extends JpaRepository<Tags, Long> {
}
