package com.jams7777.study.ddd.board.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.OffsetDateTime;

@Entity
@Getter
@ToString
public class Article {

    @Id
    @GeneratedValue
    private Long article_id;
    @ManyToOne(optional = false)
    private Board board;
    private String article_title;
    private String article_registrant;
    private String article_contents;
    private String article_password;

    private OffsetDateTime article_created;
    private OffsetDateTime article_updated;

    public Article() {
    }

    public Article(Board board, String article_title, String article_registrant, String article_contents, String article_password) {
        this.board = board;
        this.article_title = article_title;
        this.article_registrant = article_registrant;
        this.article_contents = article_contents;
        this.article_password = article_password;
        this.article_created = OffsetDateTime.now();
    }
}
