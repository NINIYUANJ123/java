/*class A{
    public void print(){
        System.out.println("hell yuan");
    }
}
class B extends A{
    public void print(){
        super.print();
        System.out.println("hell jia");
    }
}
public class fuxie {
    public static void main(String[] args) {
        B soma = new B();
        soma.print();
    }
}*/

/*
class A{
    public void print(){
        System.out.println("hello");
    }
}
class B extends A{
    public void print(){
        System.out.println("yuan ");

    }
}
class C extends A{
    public void print(){
        System.out.println("jia wei");
    }
}
public class fuxie {
    public static void main(String[] args) {
        A c = new B();
        A b = new C();
        B d = (B) c;
        d.print();
        b.print();
        c.print();
        fun(new B());
        fun(new C());
    }
    public static void fun(A a) {
        a.print();
   }
}*/

/*
abstract class A{
    public void print(){
        System.out.println("袁佳伟");
    }
    abstract public void fun();
}

class B extends A{
    public void fun(){
        System.out.println("hello world");
    }
}
public class fuxie {
    public static void main(String[] args) {
        B soma = new B();
        soma.print();
    }
}

*/

/*abstract class Action{
    public static final int EAT = 1 ;
    public static final int SLEEP = 2 ;
    public static final int WORK = 3 ;
    public void command(int flag){
        switch (flag){
            case EAT:
                this.eat();
                break;
            case SLEEP:
                this.sleep();
                break;
            case WORK:
                this.work();
                break;
            case EAT + WORK:
                this.work();
                this.eat();
                break;
        }
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void work();

}

class Human extends Action {
    public void sleep() {
        System.out.println("人在睡觉");
    }

    public void eat() {
        System.out.println("人在吃饭");
    }

    public void work() {
        System.out.println("人在工作");
    }
}
class Pig extends Action {
    public void sleep() {
        System.out.println("猪在睡觉");
    }

    public void eat() {
        System.out.println("猪在吃饭");
    }

    public void work() {
    }
}
public class fuxie {
    public static void main(String[] args) {
        fun(new Human());
        fun(new Pig());
    }
    public static void fun(Action act) {
        act.command(Action.EAT);
        act.command(Action.SLEEP);
        act.command(Action.WORK);

    }
}*/

interface A{
    public abstract void fun();
    abstract static interface B{
        public abstract void fun();
    }
}

class X implements A.B {

    public void fun(){
        System.out.println("hello world");
    }

}
public class fuxie {
    public static void main(String[] args) {
        A.B a = new X();
        a.fun();
    }
}