package threading;

public class MyThread extends Thread{
    private static int count = 0;

    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);

        while (count<10){
            System.out.println(++count);

            try {
                sleep(500);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
