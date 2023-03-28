package com.mysite.sbb.question;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


// Question 엔티티의 PK(Primary Key) 속성인 id의 타입은 Integer
public interface QuestionRepository extends JpaRepository<Question, Integer> {

    Question findByContent(String content);

    Question findBySubject(String subject);

    Question findBySubjectAndContent(String subject, String content);

    List<Question> findBySubjectLike(String subject);

    Page<Question> findAll(Pageable pageable);
}
