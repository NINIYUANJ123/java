
public class suanfa {
    public static void main(String[] args) {
        int i,a[]=new int[16];
        int s=0;
        int w=0;
        for(i=0;i<16;i++)
        {
            a[i]=1;
        }
        System.out.println("<初始为假药在第13瓶>\n");
        a[15]=0;//假药初始值处
        for(i=0;i<=6;i++)
        {
            s+=a[i];
        }
        for(i=7;i<=13;i++)
        {
            w=w+a[i];
        }
        if(s==w)
        {
            System.out.println("假药在第15,第16瓶");
            if(a[14]<a[15])
                System.out.println("假药为15瓶");
            else
            System.out.println("假药为16瓶");
        }
        if(s>w)
        {
            s=0;
            w=0;
            System.out.println("假药在第8到第14瓶中");
            for(i=7;i<=9;i++)
            {
                s+=a[i];
            }
            for(i=10;i<=12;i++)
            {
                w+=a[i];
            }
            if(s==w)
            {
                System.out.println("假药在第14瓶");
            }
            else if(s<w)
            {
                System.out.println("假药在第8~10瓶中");
                if(a[7]==a[8])
                    System.out.println("假药是第10瓶");
                else if(a[7]>a[8])
                    System.out.println("假药是第9瓶");
                else
                    System.out.println("假药是8瓶");
            }
            else
            {
                System.out.println("假药在第11~13瓶中");
                if(a[10]==a[11])
                    System.out.println("假药是第13瓶");
                else if(a[10]>a[11])
                    System.out.println("假药是第12瓶");
                else
                    System.out.println("假药是11瓶");
            }
        }
        else if(s<w)
        {
            s=0;
            w=0;
            System.out.println("假药在第1到第7瓶中");
            for(i=0;i<=2;i++)
            {
                s+=a[i];
            }
            for(i=3;i<=5;i++)
            {
                w+=a[i];
            }
            if(s==w)
            {
                System.out.println("假药在第7瓶");
            }
            else if(s<w)
            {
                System.out.println("假药在第1~3瓶中");
                if(a[0]==a[1])
                    System.out.println("假药是第3瓶");
                else if(a[0]>a[1])
                    System.out.println("假药是第2瓶");
                else
                    System.out.println("假药是1瓶");
            }
            else
            {
                System.out.println("假药在第4~6瓶中");
                if(a[3]==a[4])
                    System.out.println("假药是第6瓶");
                else if(a[3]>a[4])
                    System.out.println("假药是第5瓶");
                else if(a[3]<a[4])
                System.out.println("假药是第4瓶");
            }
        }
    }
}
