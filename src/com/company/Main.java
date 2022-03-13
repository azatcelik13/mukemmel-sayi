package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// mükemmel sayıyı bulma.
        Scanner inp=new Scanner(System.in);
        int n;
        int total=0;
        do {


            System.out.print("sayı giriniz=");
            n = inp.nextInt();
            for (int i = 1; i < n; i++) {

                if (n % i == 0){
                    total = total + i;
                }
            }

            if (total == n) {
                System.out.println(n + " mükemel sayıdır");
                total=0;
            } else {
                System.out.println(n+ " mükemel sayı değildir");
                total=0;
            }
        }while (n>0);
        return;




        }


    }

