import java.util.Scanner;

public class RunBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BloodData bd = new BloodData();

        System.out.print("Enter blood type of patient: ");
        String input1 = scanner.nextLine().trim().toUpperCase();

        System.out.print("Enter the Rhesus factor (+ or -): ");
        String input2 = scanner.nextLine().trim();

        if ((!input1.equals("O") && !input1.equals("A") && !input1.equals("B") && !input1.equals("AB")) ||
            (!input2.equals("+") && !input2.equals("-"))) {
        } else {
            bd.setBloodType(input1);
            bd.setRhFactor(input2);
        }

        System.out.println( bd.getBloodType() + bd.getRhFactor() +" is added to the blood bank." ) ;

        scanner.close();
    }
}
