package queuq;

/**
 * @Author:MaakcoekVine
 * @Date:2022-01-18 15:29:25
 */

/**
 * 队列的入队和出队
 */
public class Queq {
    //队头指针
    private int fron=-1;
    //队尾指针
    private int rear=-1;
    //队的最大
    private int maxSize;
    //数组容量
    private int[] array;

    public Queq(int maxSize) {
        this.maxSize = maxSize;
        this.array=new int[maxSize];
    }

    //判断队列是否为空
    private boolean isEmpty(){

        return this.fron==this.rear;
    }

    //判断队列是否为满
    private boolean isFull(){

        return this.rear==this.maxSize-1;
    }
    //入队
    public void add(int x){

        if (this.isFull()){
            System.out.println("sorry,队列已满无法添加");
            return;
        }
        this.rear++;
        this.array[this.rear]=x;
    }
    //出队
    public int  del(){

        if (this.isEmpty()){
            throw new RuntimeException("sorry,队列为空无法出队");
        }
        this.fron++;
        int x=this.array[this.fron];
        return x;
    }
    //获取当前队列元素
    public void selectAll(){

        if (this.isEmpty()){
            System.out.println("当前队列为空");
            return;
        }
        for (int i=0;i<this.array.length;i++){
            System.out.println("array["+i+"]="+this.array[i]);
        }
    }
    //查看当前对头指针位置
    public int getFron(){

        return this.fron;
    }
    //查看当前队尾指针位置
    public int getRear(){

        return this.rear;
    }
}
