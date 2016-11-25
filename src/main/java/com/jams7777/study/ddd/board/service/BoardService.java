package com.jams7777.study.ddd.board.service;

import com.jams7777.study.ddd.board.model.Board;

public interface BoardService {

    /**
     * 게시판 생성
     * @param board
     */
    Board createBoard(Board board);

    /**
     * 게시판 수정
     * @param board
     * @param board_name
     * @return
     */
    Board updateBoard(Board board, String board_name);
}
