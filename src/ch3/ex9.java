package ch3;

import static java.lang.Thread.sleep;

public class ex9 {

    public static void main (String[] args){
        Runnable first = () -> {
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i =0 ; i <= 5; i++) {
                System.out.println("First thread: i="+i);
            }
        };

        Runnable second = new Runnable() {
            @Override
            public void run (){
                for (int i =0 ; i <= 5; i++) {
                    System.out.println("Second thread: i="+i);
                }
            }
        };

        Runnable third = new Runnable() {
            @Override
            public void run (){
                for (int i =0 ; i <= 5; i++) {
                    System.out.println("Third thread: i="+i);
                }
            }
        };

        runInOrder(first, second, third);
        runTogether(first, second, third);

    }


    public static void runTogether(Runnable... p){
        for (Runnable r:p){
            new Thread(r).start();
       }
    }

    public static void runInOrder(Runnable... po){
        for (Runnable r:po){
            r.run();
        }
    }
}
