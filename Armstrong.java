package ArrayChapter1;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args)
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
			
		}
		isarm obj =new isarm();
		System.out.println("armstrong numbers which are present in array :");
        obj.meth1(a);
	}

}
class isarm
{
     public void meth1(int []b)
     {
       int y=0,count=0,rem=0,sum;
	   for(int x=0;x<b.length;x++)
	   {
		   y=b[x];
		   count=0;
		   for(;y>0;y/=10)
		   {
			   count++;
		   }
		   y=b[x];
		   sum=0;
		   for(;y>0;y/=10)
		   {
			   rem=y%10;
			   sum=sum+(int)Math.pow(rem, count);
		   }
		   if(sum==b[x])
		   {
			   System.out.println(+b[x]);
		   }
	   }
	   
     }
}
