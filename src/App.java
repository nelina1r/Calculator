import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String input = reader.readLine();
            String[] regular = input.split(" ");
            String digit1 = regular[0];
            String operator = regular[1];
            String digit2 = regular[2];
            try{
                if(Checkers.check_lenght(input) && Checkers.check_operator(operator)){
                    if(Checkers.check_equality_digits(input)){
                        if(Checkers.check_arabic_digits_range(SolveArabic.toArabic(digit1)) && Checkers.check_arabic_digits_range(SolveArabic.toArabic(digit2))){
                            if(input.contains("I") | input.contains("V") | input.contains("X")){
                                System.out.println(SolveArabic.toRome(SolveArabic.solve(SolveArabic.toArabic(digit1), operator, SolveArabic.toArabic(digit2))));
                                continue;
                            } else {
                                System.out.println(SolveArabic.solve(SolveArabic.toArabic(digit1), operator, SolveArabic.toArabic(digit2)));
                                continue;
                            }
                        }
                    } 
                } throw new IOException("Error");
            }
            catch(NumberFormatException exception) {
                System.out.print("Error");
            }
        }
    }
}
