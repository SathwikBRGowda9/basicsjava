package loops.starpatternss;

public class arrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Arrow pattern with star variable");
		int n=5;
		int star = 0;
		for(int i=0;i<n;i++) {
			if(i<n/2+1) {
				star++;
			}
			else {
				star--;
			}
			for(int j=0;j<star;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
