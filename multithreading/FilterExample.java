public class FilterExample{
    public static void main(String[] args){
        String [] messages = {"Hi", "World", "Java", "is", "awesome"};

        for (String msg : messages){
            Thread t = new Thread(new MessageProcessor(msg));
            t.start();
        }
    }
}