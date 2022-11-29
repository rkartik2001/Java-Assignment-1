class TempScale{
	public static void main (String[] args){
	String ini = args[0];
	String fin = args[1];
	double num = Double.parseDouble(args[2]);
	if (ini.equals("Cel") && fin.equals("Kel")){
		System.out.println(num+" "+"Degree"+" "+"Celcius"+" "+"is"+" "+"equal"+" "+"to"+" "+(num+273.15)+" "+"Kelvin");
	}
		else if (ini.equals("Kel") && fin.equals("Cel")){
			System.out.println(num+" "+"Degree"+" "+"Kelvin"+" "+"is"+" "+"equal"+" "+"to"+" "+(num-273.15)+" "+"Celcius");
		}
		else if (ini.equals("Cel") && fin.equals("Far")){
			System.out.println(num+" "+"Degree"+" "+"Celcius"+" "+"is"+" "+"equal"+" "+"to"+" "+((num*9/5)+32)+" "+"Fahrenheit");
		}
		else if (ini.equals("Far") && fin.equals("Cel")){
			System.out.println(num+" "+"Degree"+" "+"Fahrenheit"+" "+"is"+" "+"equal"+" "+"to"+" "+((num-32)*5/9)+" "+"Celcius");
		}
		else if (ini.equals("Far") && fin.equals("Kel")){
			System.out.println(num+" "+"Degree"+" "+"Fahrenheit"+" "+"is"+" "+"equal"+" "+"to"+" "+((num-32)*5/9+273.15)+" "+"Kelvin");
		}
		else if (ini.equals("Kel") && fin.equals("Far")){
			System.out.println(num+" "+"Degree"+" "+"Kelvin"+" "+"is"+" "+"equal"+" "+"to"+" "+((num-273.15)*9/5+32)+" "+"Fahrenheit");
		}
		
		
}
}