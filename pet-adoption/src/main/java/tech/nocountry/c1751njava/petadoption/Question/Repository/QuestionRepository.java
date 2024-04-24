package tech.nocountry.c1751njava.petadoption.Question.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.nocountry.c1751njava.petadoption.Question.Model.Question;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, String> {

    List<Question> findAllByFormId(String formId);
}
