package TestRunner;

public class numberRange {
    public static void main(String[] args) {

        String number = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";

        System.out.println("Input is " + number);

        methods method = new methods();

        String output = method.formatNumberRange(number);

        System.out.println("Output is " + output);



    }

}
