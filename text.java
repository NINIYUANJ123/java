public class text {
    public static void main(String[] args) {
        /*int n = c ;
        int num = n + 32 ;
        c = (char)num ;


        boolean n = false ;
        if(!n) {
            char c = '袁';
            String  num = "袁佳伟" ;
            num += "!!! " ;
            System.out.println(num) ;
            System.out.println(c) ;
        }
        System.out.println("3 > 1 为"+(3>1));


        int c = 10 ;
        if(c % 2 == 0) {
            System.out.println(c+ "是偶数");

        }
        else{
            System.out.println(c +"是奇数");
        }


        if ((3>1) && (3<1)) {
            System.out.println("hello") ;
        }
        else{
            System.out.println("h") ;
        }


        int n = 0 ;
        int sum = 0 ;
        //while(n <= 100)
        for(;n <= 100;){
            sum += n ;
            n++;
        }
        System.out.println(sum);


        for (int n = 1;n<=9;n++){
            for (int m = 1;m<=n;m++){
                System.out.print(m + "*" + n + "=" +(n*m) + "\t");
            }
            System.out.print("\n");

        }


        public static void Pay(double money){    //无返回值有参数的方法(函数)
            if (money > 0) {
                System.out.println("你可以支付");
            }
            else{
                System.out.println("没钱还想买东西");
            }


        int numb = add(10, 20);
        System.out.println("计算结果" + numb);
        System.out.println("计算结果" + add(30, 50));
    }

    public static int add(int i,int m) {
        int a = i + m ;
        return a ;

        set (4);
        set (56);

    }

    public static void set(int n) {
        if (n == 56){
            return ;
        }
        System.out.println("n ="+n);


        System.out.println("100求和=" + sum(100));
    }

    public static int sum(int n) {
        if(n == 1){
            return 1;

    }
    int a = n + sum(n - 1);
    return a ;*/
        for (int i=100;i<1000;i++){
            int a = i%10 ;
            int b = i/10%10 ;
            int c = i/100 ;
            if (a*a*a + b*b*b + c*c*c == i){
                System.out.println(i);
            }
        }

        int d = 4 ;
        int e = 5 ;
        int g ;
        System.out.println(d+","+e);
        g = d ;
        d = e ;
        e = g ;
        System.out.println(d+","+e);
    }
}

