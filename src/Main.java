import threading.MyRunnable;
import threading.MyThread;

public class Main {
    public static void main(String[] args) {

//        runnableCreation();
//        threadCreation();
        variableConcurrent();



    }

    private static void variableConcurrent() {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();

        myThread1.start();
        myThread2.start();
        myThread3.start();
    }

    private static void threadCreation() {
        String mainThreadName = Thread.currentThread().getName();
        System.out.println(mainThreadName);

        MyThread myThread = new MyThread();
        myThread.start();
//        myThread.run();
    }

    private static void runnableCreation(){
        String mainThreadName = Thread.currentThread().getName();
        System.out.println(mainThreadName);

        Thread myRun = new Thread(new MyRunnable());
//        myRun.start();
        myRun.run();
    }
}
