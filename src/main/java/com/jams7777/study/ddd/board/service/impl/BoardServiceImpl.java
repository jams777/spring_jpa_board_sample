package com.jams7777.study.ddd.board.service.impl;

import com.jams7777.study.ddd.board.model.Board;
import com.jams7777.study.ddd.board.repository.BoardRepository;
import com.jams7777.study.ddd.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardRepository boardRepository;

    /**
     * 게시판 생성
     * @param board
     */
    @Override
    public Board createBoard(Board board) {
        return boardRepository.save(board);
    }

    /**
     * 게시판 수정
     * @param board
     * @param board_name
     * @return
     */
    @Override
    public Board updateBoard(Board board, String board_name) {
        board.updateBoard(board_name);
        return boardRepository.save(board);
    }
}
