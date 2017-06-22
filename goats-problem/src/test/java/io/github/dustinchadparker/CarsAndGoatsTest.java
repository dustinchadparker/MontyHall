package io.github.dustinchadparker;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarsAndGoatsTest {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void testCarsAndGoats() {
    assertNotNull("Got one with 3", new CarsAndGoats());
  }

  @Test
  public void testCarsAndGoatsInteger() {
    assertNotNull("Got one with 1 (makes no sense)", new CarsAndGoats(1));
  }

  @Test(expected = NullPointerException.class)
  public void testCarsAndGoatsWithANull() {
    assertNotNull("Got one", new CarsAndGoats(null));
  }

  @Test
  public void testRun() {
    CarsAndGoats g = new CarsAndGoats();
    g.run();
  }

}
