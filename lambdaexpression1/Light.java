
//○ Scenario: A building has smart lights. Different triggers (motion, time of day, voice
//commands) need to execute different light patterns.
//○ Task: Use lambdas to define these light activation behaviors dynamically without
//creating multiple classes.
package lambdaexpression1;
import java.util.*;

@FunctionalInterface
interface Light_Automation {
    void light();
}

public class Light {
    public static void main(String[] args) {
        Light_Automation motion = () -> System.out.println("Light On");
        motion.light();
        Light_Automation time = () -> System.out.println("Afternoon, Dim Light");
        time.light();
        Light_Automation voice = () -> System.out.println("Voice activation");
        voice.light();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter trigger (motion/afternoon/voice): ");
        String n = input.next();
        
        

        

        input.close();
    }
}
