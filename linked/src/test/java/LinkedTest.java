import linked.GoodeLinked;
import linked.GoodeNode;

/**
 * @Author:MaakcoekVine
 * @Date:2022-01-17 11:39:52
 */

public class LinkedTest {


    public static void main(String[] args) {
        GoodeNode goodeNode1=new GoodeNode(1,"aj1",599.0);
        GoodeNode goodeNode2=new GoodeNode(2,"aj2",699.0);
        GoodeNode goodeNode3=new GoodeNode(3,"aj3",699.0);
        GoodeNode goodeNode4=new GoodeNode(4,"aj4",699.0);
        GoodeLinked goodeLinked=new GoodeLinked();
        goodeLinked.addGoode(goodeNode1);
        goodeLinked.addGoode(goodeNode2);
        goodeLinked.addGoode(goodeNode3);
        goodeLinked.addGoode(goodeNode4);
        goodeLinked.updateGoode(new GoodeNode(3,"addidas",388.0));
        //goodeLinked.delGoode(3);
        GoodeNode goodeNode5=new GoodeNode(5,"aj5",699.0);
        goodeLinked.addGoode(goodeNode5);
        goodeLinked.delGoode(5);
        int length = goodeLinked.length();
        System.out.println(length);
    }
}
