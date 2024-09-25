import emp.Employee;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Employee[] employees = new Employee[100];
        int id_count = 100000;

        employees[0] = new Employee(id_count, "Вася",
                new int[] {12, 12, 1991}, "верхняя Пышма",
                10000, "женат");
        id_count ++;
        employees[1] = new Employee(id_count, "Маша",
                new int[] {2, 3, 2004}, "Елабуга",
                5000000, "не замужем");
        id_count ++;

        int n;
        System.out.print("Введите чесло сотрудников -> ");
        n = in.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("\nВведите имя сотрудника -> ");
            in.next();
            String name = in.nextLine();
            System.out.print("\nВведите день рождения сотрудника (от 1 до 31) -> ");
            int day = in.nextInt();
            System.out.print("\nВведите месяц рождения сотрудника -> ");
            int manth = in.nextInt();
            System.out.print("\nВведите год рождения сотрудника -> ");
            int yer = in.nextInt();
            System.out.print("\nВведите место рождения сотрудника -> ");
            in.next();
            String place = in.nextLine();
            System.out.print("\nВведите зарплату сотрудника -> ");
            int salary = in.nextInt();
            System.out.print("\nВведите семейное положение сотрудника -> ");
            in.next();
            String marital = in.nextLine();

            employees[id_count % 100000] = new Employee(id_count, name, new int[] {day, manth, yer},
                    place, salary, marital);
            id_count ++;
        }

        System.out.print("Введите id сотрудника (от 100000 до 999999)-> ");
        int id_shuw = in.nextInt();
        System.out.println(employees[id_shuw % 100000]);

        System.out.print("Введите имя сотрудника -> ");
        in.next();
        String name_shuw = in.nextLine();
        for (int i = 100000; i < id_count; i++){
            Employee same_emp = employees[i % 100000];
            if (same_emp.name == name_shuw) {
                System.out.println(same_emp);
            }
        }

        employees[1].name = "Витя";

        int salary_sum = 0;
        for (int i = 100000; i < id_count; i++){
            salary_sum += employees[i % 100000].salary;
        }
        System.out.println(salary_sum);
    }
}