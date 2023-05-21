public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        System.out.println("Задача №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.print("ФИО сотрудника - " + fullName);
        System.out.println();
    }
    private static void task2() {
        System.out.println("Задача №2");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
    }
    private static void task3() {
        System.out.println("Задача №3");
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Исходные данные ФИО сотрудника - " + fullName);
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}