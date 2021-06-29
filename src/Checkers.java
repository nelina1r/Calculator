public class Checkers {

    public static boolean check_equality_digits(String st){
        if((st.contains("1") | 
            st.contains("2") | 
            st.contains("3") | 
            st.contains("4") | 
            st.contains("5") | 
            st.contains("6") | 
            st.contains("7") | 
            st.contains("8") | 
            st.contains("9") | 
            st.contains("10")) && (st.contains("I") | st.contains("V") | st.contains("X"))){
                return false;
            } else {
                return true;
            }
    }

    public static boolean check_arabic_digits_range(String digit){
        if((Integer.parseInt(digit) > 10 | Integer.parseInt(digit) < 1)){
            return false;
        } else {
            return true;
        }
    }   

    public static boolean check_lenght(String st){
        String[] arr = st.split(" ");
        return !(arr.length > 4);
    }

    public static boolean check_operator(String s) {
        return s.equals("-") | s.equals("*") | s.equals("/") | s.equals("*");
    }
}
