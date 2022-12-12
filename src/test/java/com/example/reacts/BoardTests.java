package com.example.reacts;

import com.example.reacts.board.Board;
import com.example.reacts.board.BoardRepository;
import com.example.reacts.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTests {

    @Autowired
    public BoardRepository boardRepository;

    @Test
    public void save(){
        User user = User.builder().id(1L).build();
        Board params = Board.builder()
                .title("1번게시글")
                .creatorId(user)
                .deleteYn("N")
                .createDate(new Timestamp(System.currentTimeMillis()))
                .updateDate(new Timestamp(System.currentTimeMillis())).build();

        boardRepository.save(params);

    }
}
