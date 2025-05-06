
public class Main {

    public static void main(String[] args) {

        Message message = new Message("abc", "xyz");
        MessagingService messagingService = new MessagingService();

        messagingService.add(message);
        messagingService.getMessages();


    }
}
