package generator;

import org.apache.axis.wsdl.WSDL2Java;

public class CodeGenerator {

	public static void main(String[] args) {
	    
		
		//== test case for AWSECommerceService.wsdl ==//
		WSDL2Java.main(new String[]{
			"--NStoPkg", "http://webservices.amazon.com/AWSECommerceService/2011-08-01=gen.com.amazon.webservices",
			"--output", "src",
			"resource/AWSECommerceService.wsdl"
		});
		System.out.println("code generation is done!");
		
//		WSDL2Java.main(new String[]{
//			"--fileNStoPkg", "resource/NStoPkg.properties",
//			"--output", "src",
//			"resource/multipleNamesapces.wsdl"
//		});
//		System.out.println("code generation is done!");

	}

}
