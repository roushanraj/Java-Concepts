package casting;

public class NumericalCasting {
	public static void main(String[] args) {
		short shortVal= 55;
		int intVal= 8745;
		byte bytVal= 121;
		long longVal= 45687;
		float floatVal=7894.35f;	//f for specifying type
		float floatVal2 = (float)7894.35;		//it is also a way to specify
		
		double doubleVal=456878;
		
		System.out.println(Byte.MAX_VALUE);	//prints max value accepted for certain data type
		
		intVal=(int)longVal;		//Type casing of long to Int
		
		System.out.println(intVal);
		
		doubleVal=intVal;		//we can do directly
		System.out.println(doubleVal);
		
		//intVal=floatVal;	//will not work because it is not back compatible
		intVal=(int)floatVal; //this will work because we are explicitly converting float to int.
								//but the decimal part will be trimmed (not roundoff)
		System.out.println(intVal);
		
		byte byteVal2= (byte)128;	//max value for byte is 128 but here it will assign by wrapping around (like modulus function) and it will give -128 value
		System.out.println(byteVal2);
	}	
	
}
