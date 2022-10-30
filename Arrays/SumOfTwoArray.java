import java.io.IOException;
import java.util.*;
public class SumOfTwoArray
{
    public static void main(String args[])throws IOException
    {
        Scanner scn=new Scanner(System.in);

        int n,m,i,temp,base,carry=0;

        m=scn.nextInt();
        int[] arr1= new int[m];
        for(i=0;i<m;i++)
        {
            arr1[i]=scn.nextInt();
        }

        n=scn.nextInt();
        int[] arr2= new int[n];
        for(i=0;i<n;i++)
        {
            arr2[i]=scn.nextInt();
        }
        
        int[] arr3=new int[Math.max(n, m)];
        
        if(m>n)
        {
            for(i=0;i<m;i++)
            {
                temp = arr1[m-1]+arr2[n-1] + carry;
                if(temp>10)
                {
                    base = temp%10;
                    arr3[m]=base;
                    carry = 1;
                }
                else{
                    base = temp;
                    arr3[m-1]=base;
                }
                    
            }
        }
        for(i=0;i<m;i++)
        {
            System.out.print("\t"+arr3[i]+"\t");
        }
    }
}


import java.io.*;

public class Bulb {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float j, i;
        int n, k;
        n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        for (k = 0; k < n; k++) {
            a[k] = 1;
        }
        for (i = 2; i <= n; i++) {
            for (j = 2; j <= n; j++) {
                k = (int) j - 1;
                if (j % i == 0) {
                    if (a[k] == 0) {
                        a[k] = 1;
                    } else if (a[k] != 0) {
                        a[k] = 0;
                    }
                }
            }
        }
        for (k = 0; k < n; k++) {
            if (a[k] == 1)
            System.out.println(k + 1);
        }
    }
}
