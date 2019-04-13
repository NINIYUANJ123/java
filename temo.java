import jdk.internal.dynalink.beans.StaticClass;

public class temo {
    public static void main(String[] args) {
        int data[] = cls() ;
        print(data) ;
        System.out.println("数组长度" + cls().length);
        int a[] = new int[]{3,6,1,9,2};
        java.util.Arrays.sort(a);
        print(a);
        String str = "yuan is a handsome man" ;
        byte c[] = str.getBytes() ;
        //print1(c);
        System.out.println();
        for (int i = 0 ; i < c.length ; i++){
            c[i] -= 32 ;
        }
        System.out.println(new String(c));
        System.out.println(str.replaceAll("a","!"));
        String str1 = "袁佳伟:20|袁佳瑶:30|葛晓宁:40" ;
        String result[] = str1.split("\\|") ;
        for (int i=0;i<result.length;i++){
            String result1[] = result[i].split(":") ;
            System.out.print("姓名:"+result1[0]+" 成绩:"+result1[1]+"\n") ; 
        }
    }

    public static int[] cls() {
        return new int[]{1,2,3} ;
    }

    public static void print(int data[]) {
        for (int i = 0 ; i < data.length; i++){
            System.out.print(data[i] + ",");
        }
        System.out.println();
    }
    public static void print1(char data[]) {
        for (int i = 0 ; i < data.length; i++){
            System.out.print(data[i]);
        }
    }

}
