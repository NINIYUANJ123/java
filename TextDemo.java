class  Book{
    private String title ;
    private double price ;

    public void setTitle(String tit) {
        this.title = tit ;
    }

    public void setPrice(double pri) {
        this.price = pri ;
    }

    public String getTitle() {
        return title ;
    }

    public double getPrice() {
        return price;
    }

    public void getInfo(){
        System.out.println("图书名称: " + title + ",价格:" + price) ;
    }

}

public class TextDemo {
    public static void main(String[] args) {
        Book b= new Book()  ;
        b.setTitle("java开发项目") ;
        b.setPrice(99) ;
        b.getInfo() ;
    }
}