

public class main {
    public static void main(String[] args) {
//        customArrayList c = new customArrayList();
//        c.add(1);
//        c.add(2);
//        c.add(3);
//        c.add(4);
//        c.add(5);
//        c.add(6);
//        c.print();
//        c.remove(2);
//        c.print();
//        c.set(0,0);
//        c.print();
//        c.get(3);
//        c.get(8);

        customGenericArrayList<String> g = new customGenericArrayList<>();
        g.add("a");
        g.add("b");
        g.add("c");
        g.add("d");
        g.add("e");
        g.print();
        g.remove("a");
        g.print();
        g.get("d");
        g.set(0,"m");
        g.print();
        System.out.println(g.size());


    }
}
