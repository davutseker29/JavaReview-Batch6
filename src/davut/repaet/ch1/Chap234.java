package davut.repaet.ch1;

public class Chap234 {

	public static void main(String[] args) {

//		example for explicit casting
		int a = (int) 12.44;

		System.out.println(a);

		long b = (long) 123123.4223;
		System.out.println(b);

		b += 122;
		b -= 32;
		b *= 2;
		b /= 4;
		System.out.println(b);

		double d = 500.4444;
		long e = (long) d;
		System.out.println(e);

		int num1 = 10;
		int num2 = 20;

		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);

		double x = 12.99;
		double y = 12.999;

		boolean r1 = x > y;
		boolean r2 = x < y;
		boolean r3 = x == y;
		boolean r4 = x != y;
		System.out.println("-------------------boolean-------------------");
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);

		int nums1, nums2, nums3;

		nums1 = 3;
		nums2 = 4;
		nums3 = 6;

		System.out.println("===last practice===");
		boolean r01 = nums1 > nums3;
		boolean r02 = nums2 != nums3;
		boolean r03 = nums1 == nums2;

		System.out.println(r01);
		System.out.println(r02);
		System.out.println(r03);

		int abc = (int) 3.45;
		double s = 123;

		System.out.println(abc + "" + s);
	}

}
