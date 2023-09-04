package alphabetspatterns;

public class R {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
	         if((i==0||j==0)||(j==n&&i<=4)||(i==4)||((i>=4&&i==j-8||j==i-4)))
	        	 System.out.print("*");
	            	
	         else
	        	 System.out.print(" ");
	}
			System.out.println();

}
	}
}
