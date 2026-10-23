package problem5.problem5before;

public class EmailSender {
    private final String stmpServer;

    public EmailSender(String stmpServer){
        this.stmpServer=stmpServer;
    }

    public void send(String email,String message){
        System.out.println("Email to "+email+" : "+message);
    }
}
