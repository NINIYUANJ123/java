package thread;
class MyThread5 implements Runnable {
    @Override
    public void run() {
        for (int x = 0; x < 10000; x++) {
            try {
                Thread.sleep(1000);				// 每次执行休眠1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "，x = " + x);
        }
    }
}

public class TextDemo5 {
    public static void main(String[] args) throws Exception {
        MyThread5 mt = new MyThread5();
        new Thread(mt, "自己的线程对象A").start();
    }
}
