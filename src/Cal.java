import java.time.DayOfWeek;
import java.time.LocalDate;

public class Cal {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now().withDayOfMonth(1);// текущая дата
        int month;
        if (args.length >= 2) {
            month = Integer.parseInt(args[0]);//месяц из аргументов
            int year = Integer.parseInt(args[1]);// год из аргументов
            date = LocalDate.of(year, month, 1);// дата меняется на дату из аргументов
        } else {
            month = date.getMonthValue();// если аргументов нет, то остается текущий месяц текущего года
        }
        System.out.println(date);


        System.out.println(" Sun Mon Tue Wed Thu Fri Sat ");//меняем пн на вскр
        DayOfWeek weekday = date.plusDays(1).getDayOfWeek();// считаем  отступы т.к поменяли пн на вскр
                                                            // +1 день(вскр двигаем в начало)

        int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday
        for (int i = 1; i < value; i++)
            System.out.print("    ");

        while (date.getMonthValue() == month) { //пока нужный месяц
            System.out.printf("%4d", date.getDayOfMonth());//выводим дату
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 7) //перед  вскр переводим на новую строку
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
}
