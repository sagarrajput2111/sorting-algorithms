package stableSortingAlgorithms;

import java.util.Scanner;

public class InsertionSort {
	
	public static void sort(int[] arr,int n)
	{
		
		for(int i=1;i<n;i++)
		{
			int ptr=i;
			while(ptr>0&&arr[ptr-1]>arr[ptr])
			{	//swap
				arr[ptr]=arr[ptr]^arr[ptr-1]^(arr[ptr-1]=arr[ptr]);
				ptr--;
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
