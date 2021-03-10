package net.shelg.fizzbuzz;

public class FizzBuzz {

    String fizzBuzzString() {
        final var builder = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            builder.append(numberToString(i));
        }

        return builder.toString();
    }

    String numberToString(int number) {
        final String result;

        if (number % 3 == 0) {
            if (number % 5 == 0) {
                result = "FizzBuzz";
            } else {
                result = "Fizz";
            }
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            result = String.valueOf(number);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new FizzBuzz().fizzBuzzString());
    }

}
