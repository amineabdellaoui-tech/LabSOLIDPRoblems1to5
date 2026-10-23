package problem5.problem5after;

public class Test {
    public static void main(String[] args) {
        StudentRepository repository=new CsvStudentRepository("students.csv");
        Notifier notifier=new SmsNotifier();

        EnrollmentService service=new EnrollmentService(repository, notifier);

        service.enroll("12345678","SAFI Amal","0612345678");

        try{
            service.enroll("22885676","Test Student","0600000000");
            service.enroll("22885676","Test Student","0600000000");
        }catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}