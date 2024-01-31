package level1;

import java.util.Collections;
import java.util.List;

public class Person {
    private final String firstName;
    private final List<String> middleName;
    private final String lastName;
    private final String email;
    private final String phone;

    public Person(Builder builder) {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public static Builder builder(){
        return new Builder();
    }

    public String getFirstName() {
        return firstName;
    }

    public List<String> getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public static class Builder{
        private String firstName;
        private List<String> middleName = Collections.emptyList();
        private String lastName;
        private String email;
        private String phone;

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder middleName(List<String> middleNames) {
            this.middleName = middleNames;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }


        public Builder email(String email) {
            this.email = email;
            return this;
        }


        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }



}
