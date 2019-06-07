package thread;
class MyThread2 implements Runnable { 		// 线程的主体类
    private int ticket = 5; 						// 一共5张票
    @Override
    public void run() { 							// 线程的主方法
        for (int x = 0; x < 50; x++) {			// 循环50次
            if (this.ticket > 0) {
                System.out.println("卖票，ticket = " + this.ticket --);
            }
        }
    }
}
public class TextDemo2 {
    public static void main(String[] args) throws Exception {
        MyThread2 mt = new MyThread2();        // 创建线程对象
        new Thread(mt).start();                // 启动线程
        new Thread(mt).start();                // 启动线程
        new Thread(mt).start();                // 启动线程
    }
}
