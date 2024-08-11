public class Main {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.insert(20, 30);
        LL.insertFirst(50);
        LL.insertFirst(40);
        LL.insertLast(60);
        LL.insert(100, 1);
        LL.insertLast(160);
        LL.insertLast(170);
        LL.insertLast(180);
        LL.insert(35, 4);
        LL.insert(98, 6);

        LL.display();
        LL.deleteFirst();

        LL.display();
        LL.deleteLast();

        LL.display();
        LL.delete(2);
        LL.display();

        System.out.println(LL.getFirst().getValue());
        System.out.println(LL.getLast().getValue());
        System.out.println(LL.get(3).getValue());
        System.out.println(LL.getSize());

        LL.display();
    }
}