import java.util.Arrays;

public class Megingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a1=  {1,4,7,10,15,17};
		int[] a2= {1,2,6,7,9,22,23};
		int m=a1.length;
		int n=a2.length;
		int k=0;
		int i = 0,j=0;
	int[] a3=new int[m+n];
		while(i<m&& j<n)
		 {
			 if(a1[i]>a2[j])
			 {
				a3[k]=a2[j];
				k++;
				j++;
				
			 }
			 else
				 //if(a1[i]<a2[j])
			 {
				 a3[k]=a1[i];
				 k++;
				 i++;
				 
			 }
			 
		 }
		if(m>n)
		{
		while (i < m)
		{
            a3[k] = a1[i];
		k++;
		i++;
		}
		}
		else
		{
			while (j < n)
			{
	            a3[k] = a2[j];
			k++;
			j++;
			}
		}
     
		
		 
		System.out.println(Arrays.toString(a3));

	}

}
