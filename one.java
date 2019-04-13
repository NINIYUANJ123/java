//第四章 编程题 第一题

/*interface ClassName{
    public String getClassName();
}
class Company implements ClassName{
    public String getClassName(){
        return "Company";
    }
}
public class one{
    public static void main(String[] args) {
        ClassName n = new Company();

        System.out.println(n.getClassName());
    }
}*/




//第四章 编程题第二题
/*class person{
    private String name;
    private String address;
    private char sex;
    private int age;
    public person(){
    }
    public person(String name,String address,char sex,int age){
        super();
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "姓名"+this.name+",地址"+this.address+",性别"+this.sex+",年龄"+this.age;
    }
}

class Student extends person{
    private int math;
    private int english;
    public Student(){
    }
    public Student(String name,String address,char sex,int age,int math,int english){
        super(name,address,sex,age);
        this.math = math ;
        this.english = english ;
    }

    @Override
    public String toString() {
        return super.toString()+",数学成绩"+this.math+",英语成绩"+this.english;
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setSex(char sex) {
        super.setSex(sex);
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public char getSex() {
        return super.getSex();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }
}

public class one{
    public static void main(String[] args) {
        person n = new Student("袁佳伟","兴平市",'男',19,99,98);
        System.out.println(n);
    }
}*/



//第四章 编程题第三题

class yuangong{
    private String name ;
    private int age ;
    private char sex ;
    public yuangong(){}
    public yuangong(String name,int age,char sex){
        super();
        this.name = name ;
        this.age = age ;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "姓名:"+this.name+"  年龄:"+this.age+"  性别:"+this.sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }
}

class guanliceng extends yuangong{
    private String position;
    private int salary;
    public guanliceng(){}
    public guanliceng(String name,int age,char sex,String position,int salary){
        super(name,age,sex);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+"  职位:"+this.position+"  年薪:"+this.salary+"万";
    }

    @Override
    public void setSex(char sex) {
        super.setSex(sex);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public char getSex() {
        return super.getSex();
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }
}

class zhiyuan extends yuangong{
    private String belong;
    private int monthsalary;
    public zhiyuan(){}
    public zhiyuan(String name,int age,char sex,String belong,int monthsalary){
        super(name,age,sex);
        this.belong = belong;
        this.monthsalary = monthsalary;
    }

    @Override
    public String toString() {
        return super.toString()+"  职位:"+this.belong+"  月薪:"+this.monthsalary;
    }
}
public class one{
    public static void main(String[] args) {
        yuangong yuan = new guanliceng("袁佳伟",19,'男',"总裁",900);

        System.out.println(yuan);
    }
}