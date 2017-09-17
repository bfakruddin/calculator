package calculator;

import enums.Operators;

public class Arithmetic {
	static ReUsableFunctions rf = new ReUsableFunctions();
	static Object op=null;
	public static void main(String[] args) {
		Operators or = Operators.ADD;
//		System.out.println(or);
		String operator=null;
		Boolean blnFlag = false;
		for(Operators o:Operators.values()){
			if(!args[0].equalsIgnoreCase(o.toString())){
				blnFlag = false;
			}else{
				blnFlag = true;
				operator = o.toString();
				break;
			}
		}
		if(!blnFlag){
			try {
				throw new Exception("No Arithmetic operation with : "+args[0]);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		switch (operator.toUpperCase()){
		case ("ADD"):
			op = rf.Addition(Double.parseDouble(args[1]), Double.parseDouble(args[2]));
			System.out.println(op.toString());
		break;
		default:
			System.out.println("Error");
		}
	}
}
