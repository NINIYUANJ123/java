package thread;
class MyThread6 implements Runnable {
    @Override
    public void run() {
        for (int x = 0; x < 20; x++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "，x = " + x);
        }
    }
}

public class TextDemo6 {
    public static void main(String[] args) throws Exception {
        MyThread6 mt = new MyThread6();
        Thread t1 = new Thread(mt, "自己的线程对象A");
        Thread t2 = new Thread(mt, "自己的线程对象B");
        Thread t3 = new Thread(mt, "自己的线程对象C");
        t3.setPriority(Thread.MAX_PRIORITY);			// 修改一个线程对象的优先级
        t1.start();
        t2.start();
        t3.start();
    }
}
