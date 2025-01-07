import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("::Введите количество пациентов:");
        int amount = Integer.parseInt(input.nextLine());

        Hospital hospital = new Hospital(amount);

        System.out.println(":: Средняя температура по больнрице " + hospital.getAverageTemperature());
        System.out.println(":: Всего здоровых людей: " + hospital.getHealthy());

    }
}