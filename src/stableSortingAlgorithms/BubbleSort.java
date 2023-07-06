package stableSortingAlgorithms;
import java.util.Scanner;

public class BubbleSort {
	
	public static void sort(int[] arr,int n)
	{
		
		//It pushes maximum to the last
		for(int i=0;i<n-1;i++)
		{
			boolean flag=false;
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{   //swap
					arr[j]=arr[j]^arr[j+1]^(arr[j+1]=arr[j]);
					flag=true;
				}
				
				
				
			}
			
			if(flag==false)
			{
				break;
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
