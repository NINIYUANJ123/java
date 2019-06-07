package thread;
class MyThread1 extends Thread { 				// 线程的主体类
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
public class TextDemo1 {
    public static void main(String[] args) throws Exception {
        MyThread1 mt1 = new MyThread1() ;		// 创建线程对象
        MyThread1 mt2 = new MyThread1() ;		// 创建线程对象
        MyThread1 mt3 = new MyThread1() ;		// 创建线程对象
        mt1.start() ;								// 启动线程
        mt2.start() ;							// 启动线程
        mt3.start() ;							// 启动线程
    }
}
