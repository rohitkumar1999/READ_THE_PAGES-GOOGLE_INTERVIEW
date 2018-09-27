#CODE_FOR_READ_THE_PAGES_PROBLEM

package assignment;

import java.util.Scanner;

public class book_allocation_problem {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in); 
			int t = 1; 
			while(t>0)
			{
			int n = scn.nextInt();
			int m = scn.nextInt();
			long[] arr = new long[n] ; 
			int i;
			for(i=0;i<arr.length; i++)
			{
				arr[i]= scn.nextLong(); 
			}
			long ans ; 
			
		
			ans = bsearch(m,arr) ;
			System.out.println(ans);
              t--  ; 
			}

}

	public static long bsearch(int x, long[] arr)
	{   long lo=arr[arr.length-1],hi=0;
	long finalans=lo;
	    for(int i = 0 ; i<arr.length;i++)
	    {
	    	hi=hi+arr[i]; 
	    }
	    long mid ; 
		while(lo<=hi)
		{
			mid=(lo+hi)/2 ;
			if(config(arr,x,mid))
			{ 
			finalans=mid ; 	
			hi=mid-1;
			}
			else 
			{
				lo=mid+1 ; 
			}
		}
		return finalans; 
	}	
		public static boolean config(long[] arr,int m , long ans)
		{
			long student=1 ; 
			long ans1 = 0 ; 
			for(int i=0;i<arr.length;i++)
			{
				if(ans1+arr[i]>ans)
				{
					ans1=arr[i]; 
					student++; 
					if(student>m)
						return false ; 
				}
				else 
				{
					ans1+=arr[i]; 
				}
			}return true ; 
		}
}
	
