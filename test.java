package leetcode.com.company;

public class test {
    public static void main(String[] args) {
        MergeNode0 obj = new MergeNode0();

        obj.add(0);
        obj.add(3);
        obj.add(1);
        obj.add(0);
        obj.add(4);
        obj.add(5);
        obj.add(2);
        obj.add(0);

   //     obj.print();

        obj.margeNode(obj.head);

     obj.print();
    }
}
