package thread;
class A {
    public synchronized void say(B b) {
        System.out.println("A先生说：把你的本给我，我给你笔，否则不给！");
        b.get();
    }
    public synchronized void get() {
        System.out.println("A先生：得到了本，付出了笔，还是什么都干不了！");
    }
}
class B {
    public synchronized void say(A a) {
        System.out.println("B先生说：把你的笔给我，我给你本，否则不给！");
        a.get();
    }
    public synchronized void get() {
        System.out.println("B先生：得到了笔，付出了本，还是什么都干不了！");
    }
}

public class TextDemo7 implements Runnable {
    private static A a = new A();				// 定义类对象
    private static B b = new B();				// 定义类对象
    public static void main(String[] args) throws Exception {
        new TextDemo7();						// 实例化本类对象
    }
    public TextDemo7(){						// 构造方法
        new Thread(this).start();				// 启动线程
        b.say(a);								// 互相引用
    }
    @Override
    public void run() {
        a.say(b);								// 互相引用
    }
}
