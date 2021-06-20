import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Car car = new Car();
        System.out.println("Расход на км= "+car.rash);
        System.out.println("Введите начальный уровень топлива: ");
        car.addFuel(in.nextDouble());
        car.move();
        car.move();
    }

    public void addFuel(double dFuel) {
        fuel = fuel+dFuel;
    }


    public double x;
    public double fuel;
    private final double rash =1;
    Scanner inp = new Scanner(System.in);


    public void move (double dx){
        double fuelNeeded = dx * rash;

        if (fuelNeeded > fuel) {
            System.out.println("Недостаточно топлива! Текущий уровень= "+fuel+". Дозаправить на:");
            addFuel(inp.nextDouble());

            move(dx);
        } else {
            x = x+dx;
            fuel = fuel - fuelNeeded;
            System.out.println("Текущее расстояние= "+x+", текущий уровень топлива: "+fuel);
        }
    }

    public void move() {
        System.out.println("Переместиться на: ");
        double dx = inp.nextDouble();
        move(dx);
    }
}
