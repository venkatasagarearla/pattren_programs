package p2;

public class Demo6 {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0||j==0||i==n||j==n||i==n/2||j==n/2) 
				     System.out.print("*");
				else
					System.out.print(" ");
			
		}
			System.out.println();

	}

}
}
