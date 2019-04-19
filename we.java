import jdk.internal.dynalink.beans.StaticClass;

class Message{
    private String num = "love";
    public Message(String num) {
        this.num = num;
    }
    public void setNum(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }
}
public class we {
    public static void main(String[] args) {
        Message msg = new Message("world") ;
        fun(msg);
        System.out.println(msg.getNum());
    }
    static {
        System.out.println("我是静态块");
    }

    public static void fun(Message temp) {
        temp.setNum("WORLD");

    }

}


/*public class we {
    public static void main(String[] args) {
        String a = "hello" ;
        fun(a) ;
        System.out.println(a);
    }

    public static void fun(String num) {
        num = "world" ;
        System.out.println(num);
    }
}*/
