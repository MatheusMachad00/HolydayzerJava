import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "Digite uma data no formato  DD/MM/YYYY para saber se ela é um feriado\nou digite 1 para aparecer a lista de todos os feriados: ");
        String userDate = input.nextLine();

        Holidays holiday = new Holidays();

        if (holiday.getHoliday(userDate) != null) {
            System.out.println("O feriado é: " + holiday.getHoliday(userDate));
        } else if (userDate.equals("1")) {
            System.out.println(holiday.getAllHolidays());
        } else if (holiday.getHoliday(userDate) == null) {
            System.out.println("Essa data não é um feriado.");
        }

        input.close();
    }
}
