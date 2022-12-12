package com.example.reacts.board;

import com.example.reacts.user.User;
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
    @Column(name = "delete_yn")
    private String deleteYn;
    @Column(name = "create_date")
    private Timestamp createDate;
    @Column(name = "update_date")
    private Timestamp updateDate;
    @ManyToOne
    @JoinColumn(name = "creator_id", referencedColumnName = "id")
    private User creatorId;







}

