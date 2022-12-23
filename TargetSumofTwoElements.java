import java.util.Scanner;

public class TargetSumofTwoElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of array1:- ");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("Enter the sorted elments in array1:- ");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int targets=12;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                sum=(array[i]+array[j]);
                if (sum==targets)
                {
                    System.out.println(array[i]+" "+array[j]);
                }

            }
        }

    }
}
