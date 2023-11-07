import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test1 {
    @Test
    public void testAdd() {
        int result = MathOperations.add(5, 3);
        assertEquals(8, result);
    }
}
