import java.util.List;

public class Company {

    private List<Employee> employeeList;

    public Company(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void printEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
//            employee.printInfo();
        }
    }

    public int getSum() {
        int inTotal = 0;
        for (Employee employee : employeeList) {
            inTotal += employee.getSalary();
        }
        return inTotal;
    }

    public int getAvr() {
        return getSum()/employeeList.size();
    }

}
