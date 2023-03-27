package com.mysite.sbb.question;

import com.mysite.sbb.answer.Answer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Question {

    @Id // 기본 키(primary key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1씩 자동으로 증가
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT") // "내용"처럼 글자 수를 제한할 수 없는 경우
    private String content;
    private LocalDateTime createDate; // 실제 테이블의 컬럼명은 create_date


    // 질문을 삭제하면 그에 달린 답변들도 모두 함께 삭제하기 위해 = CascadeType.REMOVE
    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

}
