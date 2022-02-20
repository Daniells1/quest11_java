package com.company;
import java.util.Scanner;



import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        Scanner input = new Scanner(System.in);

        String entrance = input.nextLine();

        String[] aux = new String[entrance.length()];

        aux = entrance.split("");

        double x;

        if (aux[0].equals("+")){

            entrance = entrance.substring (1);

            x = Double.parseDouble(entrance);

            System.out.printf("+%.4E\n",x);

        }

        else if (aux[0].equals("-")){

            entrance = entrance.substring (1);

            x = Double.parseDouble(entrance);

            System.out.printf("-%.4E\n",x);

        }

        else{

            x = Double.parseDouble(entrance);

            if(x>0)

                System.out.printf("+%.4E\n",x);

            else if(x<0)

                System.out.printf("-%.4E\n",x);

            else

                System.out.printf("+%.4E\n",x);

        }

        input.close();

    }

}