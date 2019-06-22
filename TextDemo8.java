package thread;

import com.oracle.jrockit.jfr.Producer;

class Message {
    private String title;
    private String content;
    private boolean flag = true;
    // flag == true：表示可以生产，但是不能取走
    // flag == false：表示可以取走，但是不能生产
    public synchronized void set(String title, String content) {
        if (this.flag == false) { 					// 已经生产过了，不能生产
            try {
                super.wait();					// 等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.title = title;
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;
        this.flag = false;						// 已经生产完成，修改标志位
        super.notify();							// 唤醒等待线程
    }
    public synchronized void get() {
        if (this.flag == true) { 					// 未生产，不能取走
            try {
                super.wait();					// 等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.title + " --> " + this.content);
        this.flag = true; 						// 已经取走了，可以继续生产
        super.notify();							// 唤醒等待线程
    }
    // setter、getter略
}
public class TextDemo8 {
    public static void main(String[] args) throws Exception {
        Message msg1 = new Message() ;					// 定义Message对象，用于保存和取出数据
        new Thread(new Producer(msg1)).start() ;			// 启动生产者线程
        new Thread(new Producer(msg1)).start() ;			// 取得消费者线程
    }
}
