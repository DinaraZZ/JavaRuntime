package ne_oop;

public class Var230718 {
    public static void main(String[] args) {
     /*  char a = 'a';
         char b = 'b';
         char c = 'c';
         char d = 'd';

         char temp = a;
         a = b;
         b = c;
         c = d;
         d = temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);*/


//        int num = 33; //35...75
////        System.out.println(!(num >= 35 && num <= 75));
//        System.out.println((num < 35 || num > 75));

//        int num = 20; // -500...-100 or 100...500 -> true
//        System.out.println((num >= -500 && num <= -100) || (num >= 100 && num <= 500));

//        int n1 = 50;
//        int n2 = 60;
//        int n3 = 40;
//        boolean result = n1 + n2 + n3 == 150;
//        System.out.println(result);
//
//        result = n1 == 50 && n2 == 50 && n3 == 50;
//        System.out.println(result);
//
//        result = n1 + n2 + n3 == 150 && (n1 == 50 || n2 == 50 || n3 == 50);
//        System.out.println(result);

//        true == true || false;

        int month = 2;
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Зима");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Весна");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Лето");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Такого месяца не существует");
        }
    }
}
