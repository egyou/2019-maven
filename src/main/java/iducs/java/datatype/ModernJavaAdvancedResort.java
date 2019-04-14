package iducs.java.datatype;

import java.util.Arrays;

public class ModernJavaAdvancedResort {
	public static void main(String[] args) {
		Arrays.asList(1,2,3,7,5,6).stream().forEach(System.out::println);
		
		System.out.println(Arrays.asList(1,3,5).stream().reduce((a,b)-> a-b).get());
	}
}