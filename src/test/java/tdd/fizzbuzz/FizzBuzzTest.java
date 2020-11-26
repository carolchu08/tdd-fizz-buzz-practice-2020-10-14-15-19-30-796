package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_count_off_given_order_number_1() throws Exception {
        //given
        int order = 1;
        FizzBuzz result = new FizzBuzz();

        //when
        String actual = result.countOff(order);

        //then
        assertEquals("1", actual);
    }
    @Test
    public void should_return_fizz_when_count_off_given_order_number_multiple_of_3() throws Exception {
        //given
        int order = 3;
        FizzBuzz result = new FizzBuzz();

        //when
        String actual = result.countOff(order);

        //then
        assertEquals("Fizz", actual);
    }
    @Test
    public void should_return_buzz_when_count_off_given_order_number_multiple_of_5() throws Exception {
        //given
        int order = 5;
        FizzBuzz result = new FizzBuzz();

        //when
        String actual = result.countOff(order);

        //then
        assertEquals("Buzz", actual);
    }
    @Test
    public void should_return_whixzz_when_count_off_given_order_number_multiple_of_7() throws Exception {
        //given
        int order = 7;
        FizzBuzz result = new FizzBuzz();

        //when
        String actual = result.countOff(order);

        //then
        assertEquals("Whizz", actual);
    }
    @Test
    public void should_return_fizzbuzz_when_count_off_given_order_number_multiple_of_3_and_5() throws Exception {
        //given
        int order = 15;
        FizzBuzz result = new FizzBuzz();

        //when
        String actual = result.countOff(order);

        //then
        assertEquals("FizzBuzz", actual);
    }



}
