public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

////////////////task 1.1/////////////////////
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
////////////////task 1.2/////////////////////
        double[] fractional = {1.57, 7.654, 9.986};
////////////////task 1.3/////////////////////
        int[] arbitrary = new int[5];
        arbitrary[2] = 34;
        arbitrary[4] = 15;

        {
            System.out.println("Задача 2");
        }

////////////////task 2.1 (Integer)/////////////////////
        for (int i = 0; i < integer.length; i++) {
            if (i != integer[1])
                System.out.print(integer[i] + ", ");
            else {
                System.out.print(integer[i] + ". ");
            }
        }
        {
            System.out.println();
        }
////////////////task 2.2 (Fractional)/////////////////////
        for (int i = 0; i < fractional.length; i++) {
            if (i != fractional.length - 1)
                System.out.print((double) fractional[i] + ", ");
            else {
                System.out.print((double) fractional[i] + ". ");
            }
        }
        {
            System.out.println();
        }
////////////////task 2.3 (Arbitrary)/////////////////////
        for (int i = 0; i < arbitrary.length; i++) {
            if (i != arbitrary.length-1)
                System.out.print(arbitrary[i] + ", ");
            else {
                System.out.print(arbitrary[i] + ". ");
            }
        }
        {
            System.out.println();
        }

        {
            System.out.println("Задача 3");
        }
////////////////task 3.1 (Integer)/////////////////////
            for (int i = integer.length - 1; i < integer.length; i--) {
                if (i >= integer[0])
                    System.out.print(integer[i] + ", ");
                else {
                    System.out.print(integer[i] + ". ");
                    break;
                }
            }
            {
                System.out.println();
            }
////////////////task 3.2 (Fractional)/////////////////////
            for (int i = fractional.length - 1; i < fractional.length; i--) {
                if (i >= fractional.length - 2)
                    System.out.print((double) fractional[i] + ", ");
                else {
                    System.out.print((double) fractional[i] + ". ");
                    break;
                }
            }
            {
                System.out.println();
            }
////////////////task 3.3 (Arbitrary)/////////////////////
            for (int i = arbitrary.length - 1; i < arbitrary.length; i--) {
                if (i != arbitrary[0])
                    System.out.print(arbitrary[i] + ", ");
                else {
                    System.out.print(arbitrary[i] + ". ");
                    break;
                }
            }
            {
                System.out.println();
            }

        {
            System.out.println("Задача 4");
        }
////////////////task 4.1 (Integer)/////////////////////

        for (int i = 0; i < integer.length; i++) {
            int numberInteger = integer[i];
            numberInteger++;
            if (numberInteger % 2 == 0)
                System.out.print(numberInteger + " ");
        }
    }
}