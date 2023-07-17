package TestRunner;

import java.util.ArrayList;
import java.util.List;

public class methods {
    public static String formatNumberRange(String input) {

        String[] numbers = input.split(",");

        List<Integer> parsedNumbers = new ArrayList<>();

        // Parse the input string into a list of integers
        for (String number : numbers) {
            parsedNumbers.add(Integer.parseInt(number));
        }

        List<String> formattedNumbers = new ArrayList<>();
        int startRange = parsedNumbers.get(0);
        int prevNumber = parsedNumbers.get(0);

        // Iterate through the list of parsed numbers and group consecutive numbers into ranges
        for (int i = 1; i < parsedNumbers.size(); i++) {
            int currentNumber = parsedNumbers.get(i);

            if (currentNumber - prevNumber != 1) {
                if (startRange == prevNumber) {
                    formattedNumbers.add(String.valueOf(startRange));
                } else {
                    formattedNumbers.add(startRange + "-" + prevNumber);
                }

                startRange = currentNumber;
            }

            prevNumber = currentNumber;
        }

        // Add the last range or single number
        if (startRange == prevNumber) {
            formattedNumbers.add(String.valueOf(startRange));
        } else {
            formattedNumbers.add(startRange + "-" + prevNumber);
        }

        // Join the formatted numbers with commas
        return String.join(", ", formattedNumbers);
    }


}
