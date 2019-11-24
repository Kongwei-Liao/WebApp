import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class JunitTest {
    @Test
    public void testAdd(){
        assertEquals(6, new JunitDemo().add(2,4));
    }
    @Test
    public void testSubtract(){
        assertEquals(20, new JunitDemo().subtract(30, 10));
    }
}
