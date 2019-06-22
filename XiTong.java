package cd.mldn.demo;
class Book{
    private String msg = "hello world";
    public void fun(final int num){
        final int score = 100;
        class dong{
            public void print(){
                System.out.println(Book.this.msg);
                System.out.println(num);
                System.out.println(score);
            }
        }
        new dong().print();
    }
}

public class XiTong {
    public static void main(String[] args) {
        new Book().fun(99);
    }
}
