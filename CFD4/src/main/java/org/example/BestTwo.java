package org.example;

import java.util.Scanner;

public class BestTwo {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>=0)
        {
            int[] alice= new int[3];
            int[] bob = new int[3];
            for(int i=0;i<6;i++)
            {
                if(i<3) {
                    alice[i] = Integer.parseInt(sc.next());
                }else {
                    bob[i-3] = Integer.parseInt(sc.next());
                }
            }
            int a=0,b=0;
            if(alice[0] <= alice[1] && alice[0] <= alice[2])
            {
                a=alice[1]+alice[2];
            }else if(alice[1] <= alice[0] && alice[1] <= alice[2])
            {
                a=alice[0]+alice[2];
            }else{
                a=alice[0]+alice[1];
            }

            if(bob[0] <= bob[1] && bob[0] <= bob[2])
            {
                b=bob[1]+bob[2];
            }else if(bob[1] <= bob[0] && bob[1] <= bob[2])
            {
                b=bob[0]+bob[2];
            }else{
                b=bob[0]+bob[1];
            }
            if(a>b)
            {
                System.out.println("Alice");
            }else if(b>a)
            {
                System.out.println("Bob");
            }else{

                System.out.println("TIE");
            }
            t--;
        }
    }
}
