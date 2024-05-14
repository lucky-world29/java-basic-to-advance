package Multithreading;

public class Example1 extends Thread{
    public void run(){
        for(int i=1;i<10;i++){
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(this.getName()+":"+i);
            
        }
    }

    public static void main(String[] args) {
        Example1 t1 = new Example1();
        Example1 t2 = new Example1();
        Example1 t3 = new Example1();
        
        t1.setName("A");
        t2.setName("B");
        t3.setName("C");
        t1.start();
        // t1.isDaemon();

        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}