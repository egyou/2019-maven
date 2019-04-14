package iducs.java.datatype;

public class RealTypeTester {
	public static void main(String[] args) {
		RealType rt = new RealType();
		rt.printFloatBit();
		rt.printDoubleBit();
	}
}

class RealType {
	float floatVal = -64.625f;
	double doubleVal = -64.625;
	public void printFloatBit() {
		System.out.println(Long.toBinaryString(Double.doubleToLongBits(doubleVal)));
		
		int length = Integer.toBinaryString(64625).length();
		for(int i = 0; i < 32 - length; i++)
			System.out.print("0");
		System.out.println(Integer.toBinaryString(625));
		int toLong = Float.floatToIntBits(floatVal);
		System.out.println(toLong + " : " + "00" + Integer.toBinaryString(toLong));
		
		floatVal = floatVal * 1000;
		toLong = Float.floatToIntBits(floatVal);
		System.out.println(toLong + " : " + "00" + Integer.toBinaryString(toLong));
		
	}
	public void printDoubleBit() {
		long toLong = Double.doubleToLongBits(doubleVal);
		System.out.println(toLong + " : " + "00" + Long.toBinaryString(toLong));
	}
	
}
