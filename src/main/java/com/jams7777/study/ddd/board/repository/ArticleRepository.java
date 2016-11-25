package com.jams7777.study.ddd.board.repository;

import com.jams7777.study.ddd.board.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
