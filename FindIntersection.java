import java.util.Scanner;

public class FindIntersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of array1:- ");
        int m=sc.nextInt();
        int[] array1=new int[m];
        System.out.println("Enter the sorted elments in array1:- ");
        for(int i=0;i<m;i++)
        {
            array1[i]=sc.nextInt();
        }
        System.out.println("Size of array2:- ");
        int n=sc.nextInt();
        int[] array2=new int[n];
        System.out.println("Enter the sorted elments in array2:- ");
        for(int j=0;j<n;j++)
        {
            array2[j]=sc.nextInt();
        }
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (array1[i] < array2[j])
                i++;
            else if (array2[j] < array1[i])
                j++;
            else {
                System.out.print(array2[j++] + " ");
                i++;
            }
        }
    }
}
