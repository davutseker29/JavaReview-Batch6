package davut.repaet.ch1;

public class Chap7forloop {

	public static void main(String[] args) {

		int a;
		for (a = 0; a < 5; a++) {
			System.out.println(a+" ");
		
		}
		
		System.out.println("==================");
		int sum = 0;
		
		for(int i=0; i<10; i++) {
			sum=sum+i;
			System.out.print(sum+" ");
		}
		
		System.out.println("====================");
		int x;
		for(x=1; x<=50;x++) {
			if(x%5==0) {
			System.out.print(x+" ");
		}
			
		}	
		System.out.println();
		int y;
		for(y=20; y>=0;y--) {
			if(y%2==0) {
				System.out.print(y+" ");
			
			}
			
		}
	}

}
