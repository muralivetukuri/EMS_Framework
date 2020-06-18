package com.prokarma.qa.base;

public class Split {

	public static void main(String[] args) {
		String output_header_data="218.64";
		String report_header_data="1243.3848";
		 float output_header_data_float = Float.parseFloat(output_header_data);
		 float report_header_data_float = Float.parseFloat(report_header_data);
		 
		 float diff1=output_header_data_float-report_header_data_float;
		 float diff2=report_header_data_float-output_header_data_float;
		 
//		 yes -1024.7448 <> 1024.7448 Spend matching 218.64 1243.3848
//		 yes 0.001953125 <> -0.001953125 Consumption matching 16860.85 16860.8468
		 
		 if(diff1<1 || diff2<1) {
			 System.out.println(" yes "+diff1+" <> "+diff2+" "+" matching "+output_header_data+" "+report_header_data);
		 }else {
			 System.out.println("not matching");
		 }
	}

}
