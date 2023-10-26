package ne_oop;

public class DynamicStringMain {
    public static void main(String[] args) {
        DynamicStringArray d1 = new DynamicStringArray();
        /*d1.add("1");
        d1.add("2");
        d1.add("3");
        d1.add("4");
        d1.add("5");
        d1.arrayDem();
        d1.add("6");
        d1.arrayDem();
        d1.remove(2);
        d1.arrayDem();
        d1.add(1, "add");
        d1.arrayDem();
        d1.add("add");
        d1.add("add");
        d1.arrayDem();
        System.out.println(d1.contains("ad"));
        System.out.println(d1.indexOf("add"));
        System.out.println(d1.lastIndexOf("add"));*/

        d1.add("a");
        d1.add("b");
        d1.add("a");
        d1.add("a");
        d1.add("c");
        d1.add("a");
        d1.add("a");
        d1.add("d");
//        d1.arrayDem();
//        System.out.println();

        /*for (int i = 0; i < d1.getSize(); i++) {
//            System.out.println(d1.indexOf("a"));
            if (d1.get(i).equals("a")) {
                d1.remove(i);
                i--;
            }
        }

        d1.arrayDem();*/

        DynamicStringArray d2 = new DynamicStringArray();
        d2.add("a");
        d2.add("b");
        d1.arrayDem();

        /*for(int i = 0; i < d2.getSize(); i++) {
            for (int j = 0; j < d1.getSize(); j++) {
                if(d1.get(j).equals(d2.get(i))) {
                    d1.remove(j);
                    j--;
                }
            }
        }*/


        /*for(int i = 0; i < d1.getSize(); i++) {
            if (d2.contains(d1.get(i))) {
                d1.remove(i);
                i--;
            }
        }

        d2.arrayDem();
        d1.arrayDem();*/


    }
}
