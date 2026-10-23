package problem4.problem4after;

import java.util.List;

public class Test {
    public static void main(String[] args){
        TeachingAssistant teachingAssistant1=new TeachingAssistant("ALAMI Samir");

        List<Learner> learners=List.of(new Student("SAFI Amal"),teachingAssistant1);
        List<Teacher> teachers=List.of(new Professor("KALLOUBI"),teachingAssistant1);

        new Registrar().enrollAll(learners, "SE101");
        new ExamBoard().collectGrades(teachers, "SE101");
    }
}
