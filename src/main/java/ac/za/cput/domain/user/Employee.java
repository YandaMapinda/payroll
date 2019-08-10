package ac.za.cput.domain.user;

import java.util.Objects;

public class Employee {
    private String empNum, name,surname;

    private Employee(){}

    private Employee(Builder builder){
        this.empNum = builder.empNum;
        this.name = builder.name;
        this.surname = builder.surname;
    }
    public String getEmpNum() {
        return empNum;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static class Builder{
        private String empNum, name,surname;

        public Builder empNum(String empNum) {
            this.empNum=empNum;
            return this;
        }
        public Builder name(String name){
            this.name=name;
            return this;
        }
        public Builder surname(String surname){
            this.surname=surname;
            return this;
        }
        public Builder copy(Employee employee){
            this.empNum = employee.empNum;
            this.name = employee.name;
            this.surname = employee.surname;
            return  this;
        }

        public Employee build(){return new Employee(this);}

        @Override
        public boolean equals(Object o){
            if (this == o)return true;
            if (o == null || getClass() != o.getClass())return false;
            Employee employee =(Employee) o;
            return  employee.equals(employee.empNum);
        }
        @Override
        public int hashCode(){return Objects.hash(empNum);}

    }
}


