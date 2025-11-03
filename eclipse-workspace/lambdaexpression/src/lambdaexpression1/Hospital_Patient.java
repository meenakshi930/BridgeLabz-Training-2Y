//○ Scenario: Need to print all patient IDs from a list for admin verification.
//○ Task: Use method references instead of lambdas.


package lambdaexpression1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
public class Hospital_Patient{

public static void main(String[] args) {
    List<String> patientIds = Arrays.asList("P1001", "P1002", "P1003", "P1004");

    System.out.println("Using a lambda to print IDs:");
    
    List<String> patientIds1 = Arrays.asList("P1001", "P1002", "P1003", "P1004");

    System.out.println("Using a lambda to print IDs:");
   
    patientIds.forEach(System.out::println);
}
}


