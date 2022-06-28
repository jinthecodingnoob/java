package ch09;

public class LocalVariableenter {

	public static void main(String[] args) {
		
		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var srt2 = str;
		System.out.println(srt2);
		
		str = "hello";
		
	}

}
