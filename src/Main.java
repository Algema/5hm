public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задание 1
        int[] money = new int [3];
        money[0] = -1;
        int money1 = money[0];
       // System.out.println(money1);
        //System.out.println(money[0]);

        money[1] = 1;
        int money2 = money[1];
        //System.out.println(money2);
        //System.out.println(money[1]);

        money [2] = 2;
        int money3 = money[2];
       //System.out.println(money3);
        //System.out.println(money[2]);

        for (int i = 0; i < money.length; i++) {
            System.out.println(money[i]);
        }
        for (int i = 0; i < money.length ; i++) {
            System.out.print(money[i] + ", ");
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(money[i] + ", ");
        }
        System.out.println();

        double [] weights = {-1.57,7.654,9.986};
        for (int q = 0; q < weights.length; q++) {
            System.out.println(weights[q]);
        }
        for (int q=0; q< weights.length; q++){
            System.out.print(weights[q] + ", ");
        }
        System.out.println();
        for (int q = 2; q>= 0; q--){
            System.out.print(weights[q] + ", ");
        }
        System.out.println();


        int[] booksIn1Box = {10,11,56,43,87,23,90,76,72,58,43,48};
        for (int i = 0; i < booksIn1Box.length; i++) {
            System.out.println(booksIn1Box[i]);
        }
        System.out.println();
        for (int i = 0; i < booksIn1Box.length; i++) {
            System.out.print(booksIn1Box[i] + ", ");
        }
        System.out.println();
        for (int i = 11; i>=0; i--) {
            System.out.print(booksIn1Box[i] + ", ");
        }
        System.out.println();
        // Задание 4
        int box []= new int [3];
        box[0] = -1;
        int box1= box[0];
        box[1]=1;
        int box2= box[1];
        box[2]=2;
        int box3=box[2];
        for (int i = 0; i < box.length; i++) {
            if (box[i] % 2 == 0) {
                System.out.print(box[i]);
            } else {
                System.out.print((box[i] + 1) + ",");

            }
        }
    }
}


























