package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AutoGumaTest {

	private AutoGuma ag;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClasss() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ag = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		ag = null;
	}

	@Test
	public void testSetMarkaModel() {
		ag.setMarkaModel("Tigar1");
		assertEquals("Tigar1", ag.getMarkaModel());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		ag.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelPrazanString() {
		ag.setMarkaModel("");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelKratakString() {
		ag.setMarkaModel("md");
	}

	@Test
	public void testSetPrecnik() {
		ag.setPrecnik(20);
		assertEquals(20, ag.getPrecnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikIspodOpsega() {
		ag.setPrecnik(1);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikIznadOpsega() {
		ag.setPrecnik(150);
	}

	@Test
	public void testSetSirina() {
		ag.setSirina(150);
		assertEquals(150, ag.getSirina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaIspodOpsega() {
		ag.setSirina(10);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaIznadOpsega() {
		ag.setSirina(500);
	}

	@Test
	public void testSetVisina() {
		ag.setVisina(52);
		assertEquals(52, ag.getVisina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaIspodOpsega() {
		ag.setVisina(10);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaIznadOpsega() {
		ag.setVisina(500);
	}
	
	@Test
	public void testToString() {
		ag.setMarkaModel("Tigar1");
		ag.setPrecnik(20);
		ag.setVisina(52);
		ag.setSirina(150);
		
		assertEquals("AutoGuma [markaModel=Tigar1, precnik=20, sirina=150, visina=52]", ag.toString());
	}

	@Test
	public void testEqualsObject() {
		ag.setMarkaModel("Tigar1");
		ag.setPrecnik(20);
		ag.setVisina(52);
		ag.setSirina(150);
		
		AutoGuma ag1 = new AutoGuma();
		ag1.setMarkaModel("Tigar1");
		ag1.setPrecnik(20);
		ag1.setVisina(52);
		ag1.setSirina(150);
		assertTrue( ag.equals(ag1));
	}
	
	@Test
	public void testEqualsObjectFalse() {
		ag.setMarkaModel("Tigar1");
		ag.setPrecnik(20);
		ag.setVisina(52);
		ag.setSirina(150);
		
		AutoGuma ag1 = new AutoGuma();
		ag1.setMarkaModel("Tigar2");
		ag1.setPrecnik(20);
		ag1.setVisina(52);
		ag1.setSirina(150);
		assertFalse( ag.equals(ag1));
	}
}
