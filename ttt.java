class Node{
    private String data ;
    private Node next;
    public Node(String data){
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public String getData() {
        return data;
    }
    public void addNode(Node newNode){
        if (this.next == null){
            this.next = newNode;
        }
        else{
            this.next.addNode(newNode);
        }
    }
    public void printNode(){
        System.out.println(this.data);
        if (this.next != null){
            this.next.printNode();
        }
    }
    public boolean containsNode(String data){
        if (data.equals(this.data)){
            return true ;
        }
        else {
            if (this.next != null){
                return this.next.containsNode(data) ;
            }
            else{
                return false;
            }
        }
    }
}

class Link{
    private Node root ;
    public void add(String data){
        Node newNode = new Node(data);
        if (this.root == null){
            this.root = newNode ;
        }
        else {
            this.root.addNode(newNode);
        }
    }
    public void print(){
        if (this.root != null){
            this.root.printNode();
        }
    }
    public boolean contains(String data){
        if (data == null || this.root == null){
            return false;
        }
        return this.root.containsNode(data);
    }

}
public class ttt {
    public static void main(String[] args) {
        Link link = new Link();
        link.add("hello");
        link.add("袁佳伟");
        System.out.println(link.contains("h"));
        System.out.println(link.contains("袁"));
    }
}
