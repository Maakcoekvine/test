import linked.BookLinked;
import linked.BookNode;

/**
 * @Author:MaakcoekVine
 * @Date:2022-01-17 13:14:58
 */

public class DoubleLinkedTest {

    public static void main(String[] args) {
        BookNode b1=new BookNode("java",49.9,1);
        BookNode b2=new BookNode("c",39.9,2);
        BookNode b3=new BookNode("python",39.9,3);
        BookLinked bookLinked=new BookLinked();
        bookLinked.addNode(b1);
        bookLinked.addNode(b2);
        bookLinked.addNode(b3);
        bookLinked.update(new BookNode("c++",38.8,2));
        System.out.println(bookLinked.length());
    }
}
