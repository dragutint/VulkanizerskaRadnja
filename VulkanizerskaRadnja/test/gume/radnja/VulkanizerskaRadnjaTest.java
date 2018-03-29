package gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {

	VulkanizerskaRadnja radnja1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		radnja1 = new VulkanizerskaRadnja();
	}

	@After
	public void tearDown() throws Exception {
		radnja1 = null;
	}

	@Test
	public void testDodajGumu() {
		AutoGuma guma1 = new AutoGuma();
		radnja1.dodajGumu(guma1);
		assertTrue(radnja1.getGume().contains(guma1));
	}
	
	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		radnja1.dodajGumu(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuKojaPostoji() {
		AutoGuma guma1 = new AutoGuma();
		radnja1.dodajGumu(guma1);
		radnja1.dodajGumu(guma1);
	}

	@Test
	public void testPronadjiGumu() {
		AutoGuma g1 = new AutoGuma();
		g1.setMarkaModel("Tigar1");
		radnja1.dodajGumu(g1);
		assertTrue(radnja1.pronadjiGumu("Tigar1").get(0).getMarkaModel().equals("Tigar1"));
	}
	
	@Test
	public void testPronadjiGumuMarkaModelNull() {
		assertEquals(null, radnja1.pronadjiGumu(null));
	}
	
	@Test
	public void testPronadjiGumuKojaNePostoji() {
		AutoGuma g1 = new AutoGuma();
		g1.setMarkaModel("Tigar1");
		radnja1.dodajGumu(g1);
		
		assertEquals(true, radnja1.pronadjiGumu("Neka guma").isEmpty());
	}
	
	@Test
	public void testPronadjiGumuIstaMarkaDrugaDimenzija() {
		AutoGuma ag = new AutoGuma();
		ag.setMarkaModel("Tigar1");
		ag.setPrecnik(20);
		ag.setVisina(52);
		ag.setSirina(150);
		
		AutoGuma ag1 = new AutoGuma();
		ag1.setMarkaModel("Tigar1");
		ag1.setPrecnik(15);
		ag1.setVisina(55);
		ag1.setSirina(220);
		
		radnja1.dodajGumu(ag);
		radnja1.dodajGumu(ag1);
		
		assertTrue(radnja1.pronadjiGumu("Tigar1").contains(ag1) && radnja1.pronadjiGumu("Tigar1").contains(ag));

	}
	
}
