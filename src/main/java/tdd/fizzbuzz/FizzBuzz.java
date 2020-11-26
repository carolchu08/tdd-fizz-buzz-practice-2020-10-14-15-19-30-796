package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public String countOff(int order) {
        if(order%3 == 0 && order%5 == 0){
            return FIZZ_BUZZ;
        }else if(order%3 == 0){
            return FIZZ;
        }else if(order%5 == 0){
            return BUZZ;
        }else if(order%7 == 0){
            return WHIZZ;
        }
        return String.valueOf(order);
    }
}
