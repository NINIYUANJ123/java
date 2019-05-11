package cd.mldn.demo;

public class text2 {
    public static void main(String[] args) {
        int data[] = new int[]{1,2,3,4,5};
        for (int x : data)      //循环次数由数组长度控制,循环实际上都表示数组角标增长,取得每一个数据并赋值给变量X
            System.out.println(x);
        for (int x=0;x<data.length;x++){
            System.out.println(data[x]);
        }
    }
}
