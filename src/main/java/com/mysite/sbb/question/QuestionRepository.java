package com.mysite.sbb.question;

import org.springframework.data.jpa.repository.JpaRepository;


// Question Id Type -> Integer
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject);

    Question findBySubjectAndContent(String subject, String content);
}
