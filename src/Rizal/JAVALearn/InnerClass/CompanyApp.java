package Rizal.JAVALearn.InnerClass;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Agrizal Persero");

        Company.Employee employee = company.new Employee();
        employee.setName("Ijal");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company1 = new Company();
        company.setName("Xrizal");

        Company.Employee employee1= company1.new Employee();
        employee1.setName("Saprik");

        System.out.println(employee1.getName());
        System.out.println(employee1.getCompany());



    }
}
