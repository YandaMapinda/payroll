package ac.za.cput.factory.user;

import ac.za.cput.domain.user.EmployeeGender;

public class EmployeeGenderFactory {
    public static EmployeeGender getEmployeeGender(String male,String female){
        return new EmployeeGender.Builder().female(female).male(male).build();
    }
}
