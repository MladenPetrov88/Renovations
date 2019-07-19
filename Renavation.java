import java.util.Scanner;

public class Renavation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double height = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();


        double space = Math.ceil(height*width*4*((100-percent)/100));


        while(!input.equals("Tired!")) {
            double a = Double.parseDouble(input);
            if(a<space){
                space-=a;
            } else if (a==space) {
                System.out.println("All walls are painted! Great job, Pesho!");
                break;
            } else if (a>space) {
                System.out.printf("All walls are painted and you have %.0f l paint left!",Math.abs(a-space));
                break;
            }

            input=scanner.nextLine();

        }

        if (input.equals("Tired!")) {
            System.out.printf("%.0f quadratic m left.",space);
        }
    }
}

