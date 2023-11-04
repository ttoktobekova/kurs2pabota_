import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите свой возраст: ");
        int userAge = scanner.nextInt();

        System.out.print("Введите температуру на улице: ");
        int userTemperature = scanner.nextInt();

        displayRecommendation(userAge, userTemperature);

        scanner.close();
    }

    public static void displayRecommendation(int age, int temperature) {
        String result = getRecommendation(age, temperature);
        System.out.println("Результат: " + result);
    }

    public static String getRecommendation(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}
