package ac.za.cput.domain.user;

import javafx.util.Builder;

import java.util.Objects;
import java.util.Set;

public class EmployeeGender {

    private String male,female,id;

    private Set<Employee> employees;

    private EmployeeGender(){}

    private EmployeeGender(Builder builder){
        this.female=builder.female;
        this.id=builder.id;
        this.male=builder.male;
    }

    public String getMale() {
        return male;
    }

    public String getFemale() {
        return female;
    }

    public String getId() {
        return id;
    }

   // public Set<Employee> getEmployees() {
       // return employees;
   // }
    public static class Builder{
        private String male,female,id;

        public Builder male(String male){
            this.male=male;
            return this;
        }
        public Builder female(String female){
            this.female=female;
            return this;
        }
        public Builder id(String id){
            this.id=id;
            return this;
        }
        public Builder copy (EmployeeGender gender){
            this.female=gender.female;
            this.id=gender.id;
            this.male=gender.male;
            return this;
        }
        public EmployeeGender build(){return new EmployeeGender(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeGender gender = (EmployeeGender) o;
        return gender.equals(gender.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
