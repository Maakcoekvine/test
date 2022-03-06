package linked;

/**
 * @Author:MaakcoekVine
 * @Date:2022-01-17 11:31:46
 */

/*
单链表节点
 */
public class GoodeLinked {
    //头节点
    private GoodeNode head=new GoodeNode(0,"",0.00);

    //添加节点
    public void addGoode(GoodeNode goodeNode){
        GoodeNode temp=head;
        while (true){
            if (temp.next==null){
                break;
            }
            temp=temp.next;
        }
        temp.next=goodeNode;
        System.out.println("添加成功！");
    }

    /*修改节点
        根据商品的id来进行修改
    */
    public void updateGoode(GoodeNode goodeNode){
        GoodeNode temp=head.next;
        if (temp==null){
            System.out.println("sorry,当前链表为空");
            return;
        }
        boolean flag=false;
        while (true){

            if (temp.next==null){
                break;
            }
            if (temp.id==goodeNode.id){
                flag=true;
                break;
            }
            temp=temp.next;
        }

        if (flag){
            temp.name=goodeNode.name;
            temp.price= goodeNode.price;
            System.out.println("修改成功！当前商品信息为："+temp.name+","+temp.price);
        }else{
            System.out.println("sorry,没找到要修改的商品");
        }
    }
    /*
    删除节点，通过商品id

     */
    public void delGoode(Integer id){

        boolean flag=false;
        GoodeNode temp=head.next;
        if (temp==null){
            System.out.println("sorry,当前链表为空");
            return;
        }
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
            System.out.println("删除成功!,删除的商品为"+temp.next.name);
            temp.next=temp.next.next;
        }else{
            System.out.println("sorry,没有找到要删除的商品");
        }
    }
    /*
    查询当前链表长度
     */
    public int length(){
        GoodeNode temp=head;
        int length=0;
        while (true){

            if (temp.next==null){
                break;
            }
            length++;
            temp=temp.next;
        }
        return length;
    }
}
