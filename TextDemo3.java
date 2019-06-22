package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyThread4 implements Callable<String> { 		// 多线程主体类
    private int ticket = 10;								// 卖票
    @Override
    public String call() throws Exception {
        for (int x = 0; x < 100; x++) {
            if (this.ticket > 0) {							// 还有票可以出售
                System.out.println("卖票，ticket = " + this.ticket--);
            }
        }
        return "票已卖光！";						// 返回结果
    }
}
public class TextDemo3 {
    public static void main(String[] args) throws Exception {
        MyThread4 mt1 = new MyThread4();		// 实例化多线程对象
        MyThread4 mt2 = new MyThread4();		// 实例化多线程对象
        FutureTask<String> task1 = new FutureTask<String>(mt1) ;
        FutureTask<String> task2 = new FutureTask<String>(mt2) ;
        // FutureTask是Runnable接口子类，所以可以使用Thread类的构造来接收task对象
        new Thread(task1).start();			// 启动第一个线程
        new Thread(task2).start(); 			// 启动第二个线程
        // 多线程执行完毕后可以取得内容，依靠FutureTask的父接口Future中的get()方法实现
        System.out.println("A线程的返回结果：" + task1.get());
        System.out.println("B线程的返回结果：" + task2.get());
    }
}
