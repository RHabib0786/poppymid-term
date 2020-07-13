package design;

public abstract class CostcoEmployee implements Employee {
    protected Employee department;
    protected String location;

    public CostcoEmployee(Employee department, String location){
        this.department= department;
        this.location = location;
    }
    public Employee getDepartment() {
        return department;
    }
    public void setDepartment(Employee department){
        this.department =department;
    }
    public String getLocation(){
        return location;
    }
    @Override
    public void assignDepartment (Employee department){
        this.department =department;
    }
    public void departmentDuties(){
        switch (department){

        }
    }




}
