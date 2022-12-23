import java.util.Scanner;

public class MeanArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of array:- ");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("Enter the elments of array:- ");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int sum=0;
        for(int j=0;j<n;j++)
        {
            System.out.println(array[j]+" ");
            sum+=array[j];
        }
        System.out.println("The mean of array:-  "+ sum/n);


    }
}
