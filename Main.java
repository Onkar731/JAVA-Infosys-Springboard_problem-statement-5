import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inputValues = sc.nextLine();

        // extracting entered vaues
        List<Float> values = Arrays.stream(inputValues.split(",")).map(Float::parseFloat).collect(Collectors.toList());

        // creating complex class object
        Complex C1 = new Complex(values.get(0), values.get(1));
        Complex C2 = new Complex(values.get(2), values.get(3));

        // closing resource
        sc.close();

        // printing sum of complext numbers
        System.out.println(C1.sum(C2));
    }
}
