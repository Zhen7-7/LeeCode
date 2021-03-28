/*
package cn.zhen77;

*/
/**
 * @author : zhen77
 * @date: 2021/3/28 - 03 - 28 - 15:43
 * @Description: cn.zhen77
 * @version: 1.0
 *//*

public class Joseph {
    public class Node{
        public int no;
        public Node next;

        public Node(int no){
            this.no = no;
        }
    }
     public static class JosephLoop {
        public Node first;
        public int nums;//成员个数

        public JosephLoop(int nums) {
            this.nums = nums;
            if (nums < 1) {
                System.out.println("节点数量不正确");
                return ;
            }
            Node cur = null;  //辅助指针帮助构建环
            for(int i=1;i<=nums;i++){
                //根据编号创建节点;
                Node node = new Node(i);
                if(i==1){
                    first = node;
                    first.next = first;//构成环
                    cur = first;

                }else{
                    cur.next = node;
                    node.next = first;
                    cur= node;
                }
            }
        }
        //遍历当前链表
        public void show(){
            if(first == null){
                System.out.println("没有节点");
                return;
            }
            Node cur = first;

            for(int i=1;i<nums;i++){
                System.out.println(cur.no);
                cur= cur.next;
            }
        }

    }


}
*/
