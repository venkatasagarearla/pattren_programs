package alphabetspatterns;

public class G {

	public static void main(String[] args) {
		int n=11;
		for(int i=0; i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if((j==0||i==0||(i==n&&j<=7)||(j==7&&i>=7)||(i==6&&j>=7)||(i>=7&&j==n)))
					
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		

	}

}
