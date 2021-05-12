package davut.repaet.ch1;

public class Chap7forloop {

	public static void main(String[] args) {

//		int a;
//		for (a = 0; a < 5; a++) {
//			System.out.println(a+" ");
//		
//		}
//		
//		System.out.println("==================");
//		int sum = 0;
//		
//		for(int i=0; i<10; i++) {
//			sum=sum+i;
//			System.out.print(sum+" ");
//		}
//		
//		System.out.println("====================");
//		int x;
//		for(x=1; x<=50;x++) {
//			if(x%5==0) {
//			System.out.print(x+" ");
//		}
//			
//		}	
//		System.out.println();
//		int y;
//		for(y=20; y>=0;y--) {
//			if(y%2==0) {
//				System.out.print(y+" ");
//			
//			}			
//		}
//		int sum=0;
//		for(int i=0; i<5; i++) {
//			
//			sum=sum+i;
//			System.out.println(sum);
//		}

//		for(int i=0; i<30; i++) {
//			if(i%2!=0) {
//				System.out.print(i+" ");
//			}

//			for(int x=0; x<30; x+=2) {
//				System.out.print(x+" ");
//			}

//		int total=2;
//		for(int i=1; i<4; i++) {
//			total=total+i;
//			
//		}
//		System.out.println(total);

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		/*
		 * task2
		 */
		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println("task3");
		
		for(int i=20; i>=1; i--) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("task 3 second way");
		for(int i=20; i>=1; i-=2) {
			System.out.print(i+" ");
		}
		System.out.println("last");
		for(int r=20; r<=50; r++) {
			if(r%2!=0) {
				System.out.print(r+" ");
			}
		}
		
		System.out.println("=====================");
		for (int t=21; t<=50; t+=2) {
			System.out.print(t+" ");
		}
		
		System.out.println("=========================");
		int p=2;
		int rslt;
		for(int d=0; d<=10; d++) {
			rslt=p*d;
			System.out.println(p+" * "+d +" is "+rslt);
		}
		
		
	}

}
