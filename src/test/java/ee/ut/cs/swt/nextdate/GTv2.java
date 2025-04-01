

package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv2 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1857, 1857, 1857);
	    String string0 = nextDate0.run(10, 31, 2000);
	    assertEquals("11/1/2000", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1942, 1942, 1942);
	    String string0 = nextDate0.run(2, 1942, 1942);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(1857, 1857, 1857);
	    String string0 = nextDate0.run(9, 31, 2002);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1969, 1969, 1969);
	    String string0 = nextDate0.run(3, 30, 1969);
	    assertEquals("3/31/1969", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(1974, 12, 12);
	    String string0 = nextDate0.run(12, 12, 1974);
	    assertEquals("12/13/1974", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(1888, 1888, 1888);
	    String string0 = nextDate0.run(11, 30, 1888);
	    assertEquals("12/1/1888", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1112), (-1112), (-1112));
	    String string0 = nextDate0.run((-1112), (-1112), (-1112));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(19, 19, 19);
	    String string0 = nextDate0.run(1, 19, 1879);
	    assertEquals("1/20/1879", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(1867, 1867, 1867);
	    String string0 = nextDate0.run(2, 29, 1867);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(1869, 1869, 1869);
	    String string0 = nextDate0.run(8, 29, 1869);
	    assertEquals("8/30/1869", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(1876, 1876, 1876);
	    String string0 = nextDate0.run(5, 30, 1876);
	    assertEquals("5/31/1876", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate18() throws Throwable {
	    NextDate nextDate0 = new NextDate(1925, 1526, 1526);
	    String string0 = nextDate0.run(6, 30, 1925);
	    assertEquals("7/1/1925", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate(1903, 1903, 1903);
	    String string0 = nextDate0.run(4, 8, 1903);
	    assertEquals("4/9/1903", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate((-2388), 12, (-2388));
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate((-2388), 12, (-2388));
	    String string0 = nextDate0.run(12, 31, 2004);
	    assertEquals("1/1/2005", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(1967, 1967, 1967);
	    String string0 = nextDate0.run(2, 2, 1967);
	    assertEquals("2/3/1967", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate((-2622), (-2622), (-2622));
	    String string0 = nextDate0.run(7, 7, 2000);
	    assertEquals("7/7/2000", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(1970, 1970, 1970);
	    String string0 = nextDate0.run(2, 28, 1970);
	    assertEquals("3/1/1970", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(1869, 1869, 1869);
	    String string0 = nextDate0.run(2, 31, 1869);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(1976, 1976, 1976);
	    String string0 = nextDate0.run(2, 28, 1976);
	    assertEquals("2/29/1976", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(1869, 1869, 1869);
	    String string0 = nextDate0.run(2, 29, 2000);
	    assertEquals("3/1/2000", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-17), (-17), (-17));
	    String string0 = nextDate0.run((-17), 100, (-17));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate((-2388), 12, (-2388));
	    String string0 = nextDate0.run(2004, 2004, 100);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 2698);
	    assertEquals("invalid Input Date", string0);
	}

}