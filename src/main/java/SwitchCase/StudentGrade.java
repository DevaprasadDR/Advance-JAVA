/*author:sathiyaPriya
Description: To find out the student grades using switch case statement.
 */
package SwitchCase;

import java.util.Scanner;
    public class StudentGrade {

        public static void main(String[] args) {

            String grade = null;
            System.out.print("Enter a number: ");
            Scanner sc = new Scanner(System.in);
            int score = sc.nextInt();

            switch(score/10)
            {



                case 10:
                case 9:
                    grade = "A";


                    break;

                case 8:
                    grade = "B";

                    break;

                case 7:
                    grade = "C";

                    break;

                case 6:
                    grade = "D";

                    break;

                case 5:
                    grade = "E";

                    break;

                default:
                    grade = "F";
                    break;
            }


            System.out.println("Your Grade is = " + grade);
        }

    }

