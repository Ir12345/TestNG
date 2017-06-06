package core;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
  @Test
  public void test() {
	  Assert.assertEquals("abc","abc", "Error message");
  }
}
