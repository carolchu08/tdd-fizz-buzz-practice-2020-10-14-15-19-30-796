package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ_WHIZZ = "FizzWhizz";
    public static final String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";

    public String countOff(int order) {
        if(isMultipleOf3(order) && isMultipleOf5(order) && isMultipleOf7(order)){
            return FIZZ_BUZZ_WHIZZ;

        }else if(isMultipleOf3(order) && isMultipleOf5(order)){
            return FIZZ_BUZZ;
        }
        else if(isMultipleOf3(order) && isMultipleOf7(order)){
            return FIZZ_WHIZZ;
        }
        else if(isMultipleOf3(order)){
            return FIZZ;
        }else if(isMultipleOf5(order)){
            return BUZZ;
        }else if(isMultipleOf7(order)){
            return WHIZZ;
        }
        return String.valueOf(order);
    }
    public Boolean isMultipleOf3(int order){
        if(order %3 == 0) {
            return true;
        }
        return false;
    }
    public Boolean isMultipleOf5(int order){
        if(order %5 == 0) {
            return true;
        }
        return false;
    }
    public Boolean isMultipleOf7(int order){
        if(order %7 == 0) {
            return true;
        }
        return false;
    }
}
