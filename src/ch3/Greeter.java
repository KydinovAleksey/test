package ch3;

public class Greeter implements Runnable {

    public static void main (String[] args){
        Thread thread = new Thread(new Greeter(5, "- ты даун"));
        Thread thread1 = new Thread(new Greeter(5,"- ты так им и остался"));
        thread.start();
        thread1.start();
    }

    private final long n;
    private final String message;

    @Override
    public void run(){
        long i = 0;
        while (i++ < n) {
        System.out.println("Hello " + message);}
    }

    public Greeter(long n,String message){
        this.n=n;
        this.message=message;
    }
}