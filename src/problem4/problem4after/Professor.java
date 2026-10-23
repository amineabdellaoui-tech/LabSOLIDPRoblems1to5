package problem4.problem4after;

public class Professor implements Teacher,Researcher{
    private final String name;
    public Professor(String name) { this.name = name; }

    public void teach(String code){
        System.out.println("Prof. "+name+" teaches "+code);
    }
    public void gradeExam(String code){
        System.out.println("Prof. "+name+" grades "+code);
    }
    public void publishPaper(String title){
        System.out.println("Prof. "+name+" publishes "+title);
    }
}
