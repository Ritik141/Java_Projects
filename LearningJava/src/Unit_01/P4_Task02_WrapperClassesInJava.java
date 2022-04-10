package Unit_01;

public class P4_Task02_WrapperClassesInJava {

	public static void main(String[] args) {
	 //converting int into Interger
		int a = 20;
		String s = "" + a + "";
		Integer i = Integer.valueOf(a);//converting int into Integer explicitly
		Integer j = a; //autoboxing , now compiler will write Integer.valueof(a) internally
		
		System.out.println(a + "" + i + "" + j );  
		System.out.println(i.toString());
		//a.toString() can not be done due to a is int not object
		//Autoboxing : Converting primitives into objects
		byte b =  10;
		Byte byteobj = b;
		System.out.println(byteobj);
		
		//Unboxing : Converting  Objects to Primitives
		byte bytevalue = byteobj;
		System.out.println(bytevalue);

	}

}