import java.util.Scanner;

public class MergeTwoArray {
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

        int[] mergeArray= new int[m + n];
        for(int x=0;x<m;x++)
        {
            System.out.println(array1[x]+" ");
        }
        for(int x=0;x<n;x++)
        {
            System.out.println(array2[x]+" ");
        }
        int i=0,j=0,k=0,x=0;
        while(i<m &&j<n)
        {
            if(array1[i]<array2[j])
            {
                mergeArray[k++] = array1[i++];
            }
            else
            {
                mergeArray[k++] = array2[j++];
            }
        }
        while (i < m) {
            mergeArray[k++] = array1[i++];
        }
        while (j < n) {
            mergeArray[k++] = array2[j++];
        }
        System.out.print("Array after merging: ");
        for (x = 0; x < m + n; x++)
            System.out.print(mergeArray[x] + " ");
    }
}
