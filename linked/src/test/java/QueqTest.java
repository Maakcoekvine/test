import queuq.Queq;

/**
 * @Author:MaakcoekVine
 * @Date:2022-01-18 15:42:06
 */
public class QueqTest {

    public static void main(String[] args) {

        Queq q=new Queq(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.del();
        q.del();
        q.del();
        q.del();
        q.del();
        System.out.println(4==q.getFron());
    }
}
