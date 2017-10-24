// import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test1 {
  private static final org.apache.log4j.Logger Logger = org.apache.log4j.Logger.getLogger(Test1.class);
  @Test
  public void evaluatesExpression() {
    Logger.error("zzzzzzzz", "xxxxxxxxxxxyyyyyyyyy");
    org.junit.Assert.assertEquals("1","1");
  }
}
