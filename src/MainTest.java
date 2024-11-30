import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test00() {
        assertFalse(Main.CanDrive(15));
    }

    @Test
    public void test01() {
        assertTrue(Main.CanDrive(16));
    }

    @Test
    public void test02() {
        assertTrue(Main.CanDrive(17));
    }

    @Test
    public void test03() {
        assertTrue(Main.CanDrive(Integer.MAX_VALUE));
    }

    @Test
    public void test04() {
        assertTrue(Main.CanDrive(Integer.MAX_VALUE - 1));
    }

    @Test
    public void test05() {
        assertFalse(Main.CanDrive(Integer.MIN_VALUE));
//        assertThrows(IllegalArgumentException.class, () -> {
//            Main.CanDrive(Integer.MIN_VALUE);
//        });
    }

    @Test
    public void test06() {
        assertFalse(Main.CanDrive(Integer.MIN_VALUE + 1));
//        assertThrows(IllegalArgumentException.class, () -> {
//            Main.CanDrive(Integer.MIN_VALUE + 1);
//        });
    }

}
