package linked;

/**
 * @Author:MaakcoekVine
 * @Date:2022-01-17 11:29:51
 */

/**
 * 商品名,单链表节点
 */
public class GoodeNode {
    public Integer id;
    public String name;
    public Double price;
    //下个节点
    public GoodeNode next;

    public GoodeNode(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
