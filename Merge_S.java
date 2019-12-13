//2 1-D arrays A and B ascending order. Merge into single sorted array C containing items from arrays A and B in ascending order
import java.util.*;
class Merge_S
{
	public static void main(String args[])
	{
		int i=0,j=0,k=0;
		int[] arr1={1,3,5,7};
		int n1=arr1.length;
		int[] arr2={2,4,6,8};
		int n2=arr2.length;
		int[] arr3=new int[n1+n2];
		while(i<n1&&j<n2)
		{
			if(arr1[i]<arr2[j])
			{
				arr3[k++]=arr1[i++];
			}
			else
			{
				arr3[k++]=arr2[j++];
			}
		}
		while(i<n1)
		{
			arr3[k++]=arr1[i++];
		}
		while(j<n2)
		{
			arr3[k++]=arr2[j++];
		}
		//mergeArrays(arr1,arr2,n1,n2,arr3);
		System.out.println("Array after merging");
		for(int a=0;a<n1+n2;++a)
		{
			System.out.print(arr3[a]+" ");
		}
	}
}