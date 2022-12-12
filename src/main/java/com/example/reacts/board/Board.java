package com.example.reacts.board;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.mapping.Collection;

import java.sql.Timestamp;

@Builder
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String type;
    @Column(name = "delete_yn")
    private String deleteYn;
    @Column(name = "create_date")
    private Timestamp createDate;
    @Column(name = "update_date")
    private Timestamp updateDate;






}

