package ch3;

public class Employee implements Measurable {

    public static void main(String[] args) {
            Measurable[] measurables = { new Employee(12,"Roman"),
                                         new Employee(24,"Gleb") };

            System.out.println("average= "+average(measurables));
            Employee largestEmployee = (Employee) largest(measurables);
            System.out.println("Employee with max salary= "+largestEmployee.name);
    }

    private double salary;

    private String name;

    public static double average(Measurable[] measurables) {
        double sum = 0;

        for (Measurable x : measurables) {
            sum += x.getMeasure();
        }

        double average = sum / measurables.length;

        return  average;
    }

    public static Measurable largest(Measurable[] measurables){
        Measurable result = null;

        for (Measurable x : measurables) {
            if (result == null || x.getMeasure() > result.getMeasure()) {
                result = x;
            }
        }

        return result;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }
}
