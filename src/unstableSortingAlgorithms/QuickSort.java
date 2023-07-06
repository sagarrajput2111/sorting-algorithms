package unstableSortingAlgorithms;
import java.util.*;
public class QuickSort {
	
	public static int findPos(int[] arr,int low,int high)
	{
		int i=low,j=high;
		int pivot=arr[low];
		while(i<j)
		{
			while(arr[i]<=pivot&&i<=high-1)
			{
				i++;
			}
			
			while(arr[j]>pivot&&j>=low+1)
			{
				j--;
			}
			
			//swap j with i;
			if(j>i)
			arr[i]=arr[i]^arr[j]^(arr[j]=arr[i]);
		}
		
		arr[j]=arr[j]^arr[low]^(arr[low]=arr[j]);
		
		return j;
		
		
	}
	
	public static void sort(int[] arr, int low, int high)
	{
		
		if(low<high)
		{
			int itr=findPos(arr, low, high);
			sort(arr, low, itr-1); // sorting the left half
			sort(arr, itr+1, high);
			
		}
		
	}

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		sort(arr,0,arr.length-1);

		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		sc.close();
	}

}
