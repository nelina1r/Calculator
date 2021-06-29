public class SolveArabic {

    public static int solve(String digit1, String operator, String digit2){
        if(operator.equals("+")){
            return Integer.parseInt(digit1) + Integer.parseInt(digit2);
        }
        if(operator.equals("-")){
            return Integer.parseInt(digit1) - Integer.parseInt(digit2);
        }
        if(operator.equals("*")){
            return Integer.parseInt(digit1) * Integer.parseInt(digit2);
        }
        if(operator.equals("/")){
            return Integer.parseInt(digit1) / Integer.parseInt(digit2);
        }
        return 0;
    }

    public static String toArabic(String value){
        if(value.equals("I")) return "1";
        if(value.equals("II")) return "2";
        if(value.equals("III")) return "3";
        if(value.equals("IV")) return "4";
        if(value.equals("V")) return "5";
        if(value.equals("VI")) return "6";
        if(value.equals("VII")) return "7";
        if(value.equals("VIII")) return "8";
        if(value.equals("IX")) return "9";
        if(value.equals("X")) return "10";
        return value;
    }
}
