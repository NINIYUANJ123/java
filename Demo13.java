package ten;

interface A{
    public void yjw();
}
class D implements A{

    @Override
    public void yjw() {
        System.out.println("接口");
    }
}
public class Demo13 {
    public static void main(String[] args) {
        D d = new D();
        A a = d;
        a.yjw();

    }
}
