public class MessageProcessor implements Runnable{
    private String message;

    public MessageProcessor(String message){
        this.message = message;
    }

    @Override
    public void run(){
        if (message.length() > 3){
            System.out.println(Thread.currentThread().getName() + " accepted: " + message);
        } 
        else {
            System.out.println(Thread.currentThread().getName() + " rejected: " + message);
        }
    }
}
