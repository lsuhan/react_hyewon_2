package com.example.reacts.board;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_board_article")
public class BoardArticle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String content;
    @Column(name = "delete_yn")
    private String deleteYn;
    @Column(name = "attach_yn")
    private String attachYn;
    @Column(name = "create_date")
    private Timestamp createDate;
    @Column(name = "update_date")
    private Timestamp updateDate;
    @ManyToOne
    @JoinColumn(name = "board_id", referencedColumnName = "id")
    private Board board;
}
