package cn.zhen77.joseph;

/**
 * @author : zhen77
 * @date: 2021/3/28 - 03 - 28 - 16:31
 * @Description: cn.zhen77.joseph
 * @version: 1.0
 */
public class LinkedNode {
        Node first;
        Node cur;
        Node p;
        int len;

    public void createNodes(int len) {
        this.len = len;
        for (int i = 1; i <= len; i++) {
            if (i == 1) {
                Node node = new Node(i);
                System.out.println(node.no);
                this.first = node;
                cur = node;

            }
            if (i > 1 && i < len) {
                Node node = new Node(i);
                System.out.println(node.no);
                cur.next = node;
                cur = node;
            }
            if (i == len) {
                Node node = new Node(i);
                System.out.println(node.no);
                cur.next = node;
                cur = node;
                cur.next = first;
            }
        }
    }
    public void start(int t) {
        cur = first;
        //当长度为1的时候，就是最后剩下的那个节点
        while (len != 1) {
            //for循环查找出被删除的前一个节点。
            for (int i = 1; i < t - 1; i++) {
                cur = cur.next;
            }
            //用被删除的后一个节点替换删除的节点
            p = cur.next;
            System.out.print(p.no + " ");
            cur.next = p.next;
            cur = cur.next;
            len--;
        }
        System.out.println("最后剩下的节点----------" + cur.no);

    }
}
