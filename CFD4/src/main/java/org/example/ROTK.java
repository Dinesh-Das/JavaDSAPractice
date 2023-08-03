package org.example;

import java.util.Scanner;

public class ROTK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            String line=sc.next();
            boolean startC=false,endC=false,rp=false,lp=false;
            int cnt=0;
            for(int i=0;i<n;i++)
            {
                if(line.charAt(i) ==':')
                {
                    if(!startC)
                    {
                        startC=!startC;
                    }
                    else{
                        if(!rp) endC=!endC;
                    }
                }
                if(!startC) continue;
                if(line.charAt(i)== '(')
                {
                    rp=true;
                }

                if(startC && endC && rp)
                {
                    cnt++;
                    endC=false;rp=false;
                }
            }
            System.out.println(cnt);

            t--;
        }


    }
}

//Schrodinger Smiley
//caesar cipher