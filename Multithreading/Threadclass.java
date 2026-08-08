class MyThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread: " + i);

        }
    }
}

public class ThreadClassDemo {

    public static void main(String[] args) {

        MyThread thread = new MyThread();

        thread.start();

        System.out.println("Main thread is running");

    }
}
