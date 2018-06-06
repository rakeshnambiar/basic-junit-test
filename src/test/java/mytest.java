import org.junit.Assert;
import org.junit.Test;

public class mytest {

    @Test
    public void checkSum() {
        int sum = 5 +6;
        Assert.assertTrue(sum==11);
        System.out.println("Unit Test PASS");
    }

}
