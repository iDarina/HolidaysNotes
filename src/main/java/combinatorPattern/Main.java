package combinatorPattern;

import java.time.LocalDate;

import static combinatorPattern.CustomerRegistrationValidator.isEmailValid;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+094873598437",
                LocalDate.of(2000, 1,1)
        );

        //System.out.println(new CustomerValidatorService().isValid(customer));

        // If valid we can store customer in db

        // Using combinator pattern

        CustomerRegistrationValidator.ValidationResult result = isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAnAdult())
                .apply(customer);


        System.out.println(result);
        if (result != CustomerRegistrationValidator.ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
