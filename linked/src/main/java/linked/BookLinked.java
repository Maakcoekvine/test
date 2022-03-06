package linked;

/**
 * @Author:MaakcoekVine
 * @Date:2022-01-17 13:07:41
 */

/**
 * 双向链表
 */
public class BookLinked {
    //初始化头结点
    private BookNode head=new BookNode("",0.00,0);


    //添加节点
    public void addNode(BookNode bookNode){
        BookNode temp=head;
        while (true){

            if (temp.next==null){
                break;
            }

            temp=temp.next;
        }

        //链表末尾添加节点
        temp.next=bookNode;
        bookNode.pre=temp;
        System.out.println("添加成功!");
    }

    //删除节点
    public void delNode(Integer id){
        BookNode temp=head;
        boolean flag=false;
        while (true){
            if (temp.next==null){
                break;
            }
            if (temp.next.id==id){

                flag=true;
                break;
            }

            temp=temp.next;
        }

        if (flag){
            //当前节点指向要被删除节点的下一个节点
            temp.next=temp.next.next;
            temp.next.pre=temp;
        }else{

            System.out.println("sorry，找不到要删除的书本");
        }
    }

    /*
    修改节点信息
     */

    public void update(BookNode bookNode){
        BookNode temp=head.next;
        if (temp==null){
            System.out.println("当前链表为空");
            return;
        }
        boolean flag=false;
        while (true){

            if (temp.next==null){
                break;
            }

            if (temp.id==bookNode.id){
                flag=true;
                break;
            }

            temp=temp.next;
        }

        if (flag){
            temp.bookname=bookNode.bookname;
            temp.price=bookNode.price;
        }else{
            System.out.println("sorry,当前商品不存在");
        }
    }

    /*
    获取当前链表长度
     */
    public int length(){
        BookNode temp=head;
        int length=0;
        while(true){

            if (null==temp.next){
                break;
            }

            length++;
            temp=temp.next;
        }
        return length;
    }
}
