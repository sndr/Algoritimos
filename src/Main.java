package src;

public class Main {

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("III"));
        System.out.println(romanToInteger.romanToInt("IX"));
        System.out.println(romanToInteger.romanToInt("XC"));
    }
}
