package problem4.problem4before;

public interface UniversityMember {
    void enrollInCourse(String code);
    void payTuition(double amount);
    void teach(String code);
    void gradeExam(String code,int examId);
    void publishPaper(String title);
}
