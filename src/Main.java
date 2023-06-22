public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.printAllEmployees();

        System.out.println(storage.calculateAllSalaries());

        System.out.println("Самый бедный: " + storage.findPoorEmployee());

        System.out.println("Самый богатый: " + storage.findRichEmployee());

        System.out.println(storage.calculateAverageSalary());

        storage.printFullName();

        storage.indexSalary(50);

        storage.printAllEmployees();

        System.out.println();
        System.out.println(storage.findPoorEmployeeByDepartment(4));
        System.out.println();
        System.out.println(storage.findRichEmployeeByDepartment(4));
        System.out.println();
        System.out.println(storage.findSalariesSumByDepartment(4));
        System.out.println();
        System.out.println(storage.calculateAverageSalaryByDepartment(4));

        System.out.println();

        storage.indexSalaryByDepartment(4, 50);

        storage.printAllEmployees();

        System.out.println();
        storage.printAllEmployeesByDepartment(4);

        System.out.println();
        storage.printEmployeesWithSalaryLessThen(100000);
        System.out.println();
        storage.printEmployeesWithSalaryMoreThen(100000);



    }
}