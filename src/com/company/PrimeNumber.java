package com.company;
import java.util.Scanner;
        public class PrimeNumber { //creating class
            public static void main(String[] args) {
                int num,b,c; //integer type variable
                System.out.println(" Enter a Number");
                Scanner s = new Scanner(System.in);
                num = s.nextInt(); //pre defined method of Scanner Class
                b=1;
                c=0;
                while(b<=num){
                    if((num%b)==0)
                        c=c+1;
                    b++;

                }
                if (c==2)
                    System.out.println(num + " is a prime number");
                else
                    System.out.println(num + " is not a prime number");
            }
        }


