package com.jams7777.study.ddd.board.service;

import com.jams7777.study.ddd.board.model.Board;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardServiceTest {

    @Resource(name="boardService")
    BoardService boardService;

    @Test
    public void 게시판생성() throws Exception {
        //given

        //when
        Board board = boardService.createBoard(new Board("공지사항"));

        //then
        assertThat(board.getBoard_name()).isEqualTo("공지사항");
        assertThat(board.getBoard_id()).isNotNull();
    }

    @Test
    public void 게시판수정() throws Exception {
        //given

        //when
        Board board = boardService.createBoard(new Board("공지사항"));

        Board update_board = boardService.updateBoard(board, "공지사항1");

        //then
        assertThat(update_board.getBoard_name()).isEqualTo("공지사항1");
    }


}