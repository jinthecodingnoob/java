package ch11;

public class RealtionalTest {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 3;
		
		boolean value = (num1 > num2);
		System.out.println(value);
		
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
		int num3 = 10;
		int num4 = 20;
		
		boolean flag = (num3 > 0) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num3 < 0) && (num4 > 0);
		System.out.println(flag);
		
		flag = (num3 > 0) || (num4 > 0);
		System.out.println(flag);
		
		flag = (num3 < 0) || (num4 > 0);
		System.out.println(flag);
		
		flag = !(num3 < 0);
		System.out.println(flag);
		
		int num5 = 10;
		int i = 2;
		
		boolean value2 = ((num5 = num5 + 10) < 10) && ((i = i + 2) < 10);
		char[] vlaue2;
		System.out.println(value2);
		System.out.println(num5);
		System.out.println(i);
		
		value = ((num5 = num5 + 10) < 10) || ((i = i + 2) < 10);
		System.out.println(value2);
		System.out.println(num5);
		System.out.println(i);
		
	}

}
