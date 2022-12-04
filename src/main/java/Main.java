import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Employee employee01 = new Employee("Adam","Boski",2000);
        Employee employee02 = new Employee("Ewa","Rajska",2200);
        Employee employee03 = new Employee("Robert","Lewandowski",2400);
        Employee employee04 = new Employee("Wojciech","Nieszczęsny",2600);
        Employee employee05 = new Employee("Beata","Krawiec",2800);

        Company company = new Company(new ArrayList<>());
        company.addEmployee(employee01);
        company.addEmployee(employee02);
        company.addEmployee(employee03);
        company.addEmployee(employee04);
        company.addEmployee(employee05);

        company.printEmployees();
        System.out.println("Total salary: "+company.getSum());
        System.out.println("Average salary: "+company.getAvr());
    }

}
