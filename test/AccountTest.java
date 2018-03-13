import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest{
  @Test
  public  void testingGetPersonName(){
    SavingAccount ac=new SavingAccount("veera",24);
    assertEquals(ac.getName(),"veera");
  }
}
