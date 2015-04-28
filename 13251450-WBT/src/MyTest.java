import java.lang.annotation.*;
/**
 * Customised automated test annotation
 * @author <your name>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyTest {
   String testType = "sut";
   int tid = 1454;
} 