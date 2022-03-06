package linked;

/**
 * @Author:MaakcoekVine
 * @Date:2022-01-17 13:06:15
 */
/*
双向链表节点
 */
public class BookNode {
    public  String bookname;
    public  Double price;
    public  Integer id;
    public BookNode next;
    public BookNode pre;

    public BookNode(String bookname, Double price, Integer id) {
        this.bookname = bookname;
        this.price = price;
        this.id = id;
    }
}
