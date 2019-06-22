package cd.mldn.demo;

public class text {
    public static void main(String[] args) {
        System.out.println(add(new int[]{1,2,3,4}));
        System.out.println(add(6,24));
    }

    /**
     *
     * @param data
     * @return
     */
    /*public static int add(int []data){
        int sum = 0;
        for (int x = 0;x < data.length;x ++){
            sum += data[x];
        }
        return sum;
    }*/
    public static int add(int ...data){
        int sum = 0;
        for (int x = 0;x < data.length;x ++){
            sum += data[x];
        }
        return sum;
    }
}
