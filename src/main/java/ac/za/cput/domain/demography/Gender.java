package ac.za.cput.domain.demography;

import java.util.Objects;

public class Gender {
    private String male,female,id;
private Gender(){}

private Gender(Builder builder){
    this.female=builder.female;
    this.id=builder.id;
    this.male=builder.male;
}
    public String getId() {
        return id;
    }
    public String getMale() {
        return male;
    }
    public String getFemale() {
        return female;
    }
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
        public Builder copy (Gender gender){
            this.female=gender.female;
            this.id=gender.id;
            this.male=gender.male;
            return this;
        }
        public Gender build(){return new Gender(this);}
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gender gender = (Gender) o;
        return id.equals(gender.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
