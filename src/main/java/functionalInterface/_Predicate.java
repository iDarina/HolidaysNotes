package functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("090003400000"));
        System.out.println(isPhoneNumberValid("090003400000456"));
        System.out.println("----------------------------------------------------------");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("090003400000"));
        System.out.println(isPhoneNumberValidPredicate.test("090003400000456"));
        System.out.println("___________________________________________________________");
        System.out.println(
                "Is phone number valid and contains number 3? " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("07000000000")
        );
        System.out.println(
                "Is phone number valid and contains number 3? " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("090003400000")
        );
        System.out.println(
                "Is phone number valid and contains number 3? " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("090003400000456")
        );


    }

    static boolean isPhoneNumberValid (String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
