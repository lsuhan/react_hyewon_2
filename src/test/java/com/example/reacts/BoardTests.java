package com.example.reacts;

import com.example.reacts.board.Board;
import com.example.reacts.board.BoardRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTests {

    @Autowired
    public BoardRepository boardRepository;

    @Test
    public void save(){

        Board params = Board.builder()
                .title("1번게시글")
                .deleteYn("N")
                .createDate(Timestamp.valueOf(LocalDateTime.now()))
                .updateDate(Timestamp.valueOf(LocalDateTime.now())).build();

        boardRepository.save(params);

    }
}
