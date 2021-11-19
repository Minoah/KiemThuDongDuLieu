import org.junit.Assert;
import org.junit.Test;

public class AllCUsesSomePUses {
    @Test
    public void Test1() {
        CalculateSale a = new CalculateSale();
        Assert.assertEquals("Invalid", a.CheckSale(-1, 45, 30));
    }

    @Test
    public void Test2() {
        CalculateSale a = new CalculateSale();
        Assert.assertEquals("Invalid", a.CheckSale(0, 81, 30));
    }
    @Test
    public void Test3() {
        CalculateSale a = new CalculateSale();
        Assert.assertEquals("Invalid", a.CheckSale(0, 2, -3));
    }
    @Test
    public void Test4() {
        CalculateSale a = new CalculateSale();
        Assert.assertEquals("No", a.CheckSale(1, 1, 1));
    }
}
