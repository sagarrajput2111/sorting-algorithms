package unstableSortingAlgorithms;

import java.util.Scanner;

public class SelectionSort {
	
	public static void sort(int[] arr, int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[min]>arr[j]) {
					//update minindex
					min=j;
				}
			}
			if(min!=i)
			{
				//swap
				arr[min]=arr[min]^arr[i]^(arr[i]=arr[min]);

			}
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
		
		sort(arr,arr.length);

		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		sc.close();
	}

}
