
package Arrays;
public class Alphabets {

	public static void main(String[] args) {
		int k=0;
		char ch;
  char a[]=new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
  for(int x=0;x<a.length;x++)
  {
	  k=a.length-1;
	  ch=' ';
	  for(int y=k;y>=a.length/2;y--)
	  {
		  if(a[x]+a[y]==219)
		  {
			 ch=a[x];
			 a[x]=a[y];
			 a[y]=ch;
			 k--;
			 
		  }
	  }
  }
  for(char temp:a)
  {
	  System.out.print(temp+" ");
  }
 

  
	}

}
