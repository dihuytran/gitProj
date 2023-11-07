import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test2 {
    @Test
    public void testAdd() {
        int result = MathOperations.add(10, 20);
        assertEquals(30, result);
    }
}