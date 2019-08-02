package ten;

public class Ugly_number {
    public static void main(String[] args) {
        ugly(14,0);
    }
    private static void ugly(int numb,int flag) {
        if (numb ==1 && flag == 1)
            System.out.println("True");
        else if (numb % 2 == 0)
            ugly(numb/=2,flag = 1);
        else if (numb % 3 == 0)
            ugly(numb/=3,flag = 1);
        else if (numb % 5 == 0)
            ugly(numb/=5,flag = 1);
        else
            System.out.println("Flase");
    }
}
