package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть Ваш дохід:");
        double income = scanner.nextDouble();
        double x = 2.5;
        double y = 4.3;
        double z = 6.7;

        double resx = income/100 * x;
        double resy = income/100 * y;
        double resz = income/100 * z;


        if (income>0 && income<10000){
            System.out.println("Оподаткування Вашого доходу - 2,5%. Сума податку складатиме: " + resx);
        }else if (income>10001 && income<25000){
            System.out.println("Оподаткування Вашого доходу - 4,3%. Сума податку складатиме:  " + resy);
        }else if (income>25001){
            System.out.println("Оподаткування Вашого доходу - 6,7%.Сума податку складатиме:  " + resz);
        }
        scanner.close();










    }

}
