public class Admin extends User{
    public Admin(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Employee createEmployee(String firstName, String lastName) {
        return new Employee(firstName, lastName);
    }

    public void removeEmployee(Employee employee) {
        users.remove(employee);
    }
}
