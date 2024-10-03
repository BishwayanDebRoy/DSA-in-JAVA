package Accenture;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumberConverter {
    public static void main(String[] args) {
        String input1 = "two one nine six eight one six four six zero";
        String input2 = "five one zero two four eight zero double three two";
        String input3 = "five one zero six triple eight nine six four";
        String input4 = "five eight double two double two four eight five six";

        System.out.println(convertToDigits(input1)); // Output: 2196816460
        System.out.println(convertToDigits(input2)); // Output: 5102480332
        System.out.println(convertToDigits(input3)); // Output: 5106888964
        System.out.println(convertToDigits(input4)); // Output: 5822224856
    }

    public static String convertToDigits(String words) {
        Map<String, String> numberMap = new HashMap<>();
        numberMap.put("zero", "0");
        numberMap.put("one", "1");
        numberMap.put("two", "2");
        numberMap.put("three", "3");
        numberMap.put("four", "4");
        numberMap.put("five", "5");
        numberMap.put("six", "6");
        numberMap.put("seven", "7");
        numberMap.put("eight", "8");
        numberMap.put("nine", "9");

        StringBuilder result = new StringBuilder();
        String[] tokens = words.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("double")) {
                String digit = numberMap.get(tokens[++i]);
                result.append(digit).append(digit);
            } else if (token.equals("triple")) {
                String digit = numberMap.get(tokens[++i]);
                result.append(digit).append(digit).append(digit);
            } else {
                result.append(numberMap.get(token));
            }
        }
        return result.toString();
    }
}
