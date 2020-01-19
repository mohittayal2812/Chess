package MyPack;

public class Gun1 {

	public static void main(String[] args) {
		
		//autoboxing
		
		Integer intobj = Integer.valueOf(300);
		System.out.println(intobj);
		
		Integer autoboxingobj = 10;
		System.out.println(autoboxingobj);
		
		// unboxing
		
		int primiteType = intobj;
		System.out.println(primiteType);
		
		
		// Method ( String s, Radix IR)
		Integer IR = Integer.valueOf("11010", 2);
		System.out.println("test value of (string s , radix Ir) method: " +IR);
		
		//Test xyz value method
		System.out.println("\n \ntest xyzValue() Method:");
		System.out.println(intobj.floatValue());
		System.out.println(intobj.intValue());
		System.out.println(intobj.longValue());
		System.out.println(intobj.shortValue());
		System.out.println(intobj.byteValue());
		System.out.println(intobj.doubleValue());
				
	}

}
