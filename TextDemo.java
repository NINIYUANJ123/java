package thread;

class MyThread extends Thread {     //  或者 implements Runnable  两种方法
    private String name ;
    public MyThread(String name) {
        this.name = name ;
    }
    @Override
    public void run() {
        for (int x = 0 ; x < 200 ; x ++) {
            System.out.println(this.name + " --> " + x);
        }
    }
}
public class TextDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("线程A") ;
        MyThread mt2 = new MyThread("线程B") ;
        MyThread mt3 = new MyThread("线程C") ;
        mt1.start();
        mt2.start();
        mt3.start();
    }
}