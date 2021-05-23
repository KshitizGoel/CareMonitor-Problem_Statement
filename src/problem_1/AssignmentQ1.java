package problem_1;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class AssignmentQ1 {


    // This part consists of solution of the Problem Solving question.
    // README file consists of answer of other part of the Problem Solving question.

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {

            //Getting the input of String from the user------------------------------------------------------
            System.out.println("enter you input here in SMALL LETTERS : ");
            Scanner sc = new Scanner(System.in);
            String inputString = sc.next().trim();

            //Getting the input of number that is used to increment the alphabets----------------------------
            System.out.println("enter the number from which the letters are supposed to be incremented!");
            int n = sc.nextInt();

            //Initialising the max and min values of ASCII values of small alphabets--------------------------
            int max_number = 122;
            int min_number = 96;


            byte[] ascii = inputString.getBytes(StandardCharsets.US_ASCII);
            StringBuilder req_output = new StringBuilder();


            for (int i = 0; i < inputString.length(); i++) {

                int temp = ascii[i] + n;
                char a;

                if (temp > max_number) {

                    if ((temp - max_number) % 26 != 0) {
                        ascii[i] = (byte) (min_number + (temp - max_number) % 26);
                    } else {
                        ascii[i] = (byte) (min_number + (temp - max_number) % 26 + 1);
                    }
                } else {
                    ascii[i] = (byte) temp;
                }
                a = (char) ascii[i];

                req_output.append(a);
            }


            System.out.println();
            System.out.println("Getting the Required Output Here!!!!");
            System.out.println(req_output);

        } catch (Exception e) {

            System.out.println("Getting the Exception Here!!!!" + e);
        }

    }

}
