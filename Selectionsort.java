package com.company;
import java.util.Scanner;
class Sorting
{
    public static void s()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i,j,temp;
        int []a = new int[n];
        for(i=0;i<n;i++)
            a[i]=in.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        System.out.println(a[i]);
    }
}
public class Main {
    public static void main(String[] args) {
	Sorting s = new Sorting();
    s.s();
    }
}
