package problem5.problem5after;

public class EmailNotifier implements Notifier {
    private final String smtpServer;

    public EmailNotifier(String smtpServer) {
        this.smtpServer = smtpServer;
    }

    @Override
    public void notify(String to,String message) {
        System.out.println("Email to " +to+" : "+message);
    }
}