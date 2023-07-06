package stableSortingAlgorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {

	public static void merge(int[] arr, int low, int mid, int high) {
		ArrayList<Integer> list = new ArrayList<>();
		int left = low, right = mid + 1;
		while (left <= mid && right <= high) {

			if (arr[left] <= arr[right]) {
				list.add(arr[left]);
				left++;
			} else {
				list.add(arr[right]);
				right++;
			}
		}

		while (left <= mid) {
			list.add(arr[left]);
			left++;

		}

		while (right <= high) {
			list.add(arr[right]);
			right++;
		}

		for (int i = low; i <= high; i++) {
			arr[i] = list.get(i - low);
		}

	}

	public static void sort(int[] arr, int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = low + (high - low) / 2;
		// calling for 1st half
		sort(arr, low, mid);
		// calling for second half
		sort(arr, mid + 1, high);
		// merging
		merge(arr, low, mid, high);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements of array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		sort(arr, 0, arr.length - 1);

		for (int i : arr) {
			System.out.print(i + " ");
		}

		sc.close();
	}

}
