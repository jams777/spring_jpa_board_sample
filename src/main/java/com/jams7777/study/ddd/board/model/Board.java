package com.jams7777.study.ddd.board.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@ToString
public class Board {

    @Id
    @GeneratedValue
    private Long board_id;
    private String board_name;

    public Board() {
    }

    public Board(String board_name) {
        this.board_name = board_name;
    }

    public void updateBoard(String board_name) {
        this.board_name = board_name;
    }
}
