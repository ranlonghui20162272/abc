public class Test10{
	public static void main(String[] args) {
          int a[][]=new int [7][7];
          for(int i=0;i<a.length;i++)
          {
        	  for(int j=0;j<a[i].length;j++)
        	  {
        		  if(((i+j)>2)&&((i-j)<4)&&((j-i)<4)&&((i+j)<10))
        			  System.out.print("*");
        		  else
        			  System.out.print(" ");
        	  }
        	  System.out.println();
          }
	}
}
