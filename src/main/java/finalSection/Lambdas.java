package finalSection;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        Integer number = null;
        int counter = 0;



        String upperCasedName = upperCaseName.apply("Alex", 20);
        System.out.println(upperCasedName);
    }
    static BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
        //logic
        if (name.isBlank()) throw new IllegalArgumentException("");
        System.out.println(age);
        return name.toUpperCase();
    };

    //        Function <String, String> upperCaseName = name -> name.toUpperCase();

//        Function <String, String> upperCaseName = name -> {
//            //logic
//            if (name.isBlank()) throw new IllegalArgumentException("");
//            return name.toUpperCase();
//        };

}
