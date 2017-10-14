/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopics;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author pep
 *
 */
public class ITVManagerImplTest {

	ITVManagerImpl manager;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		manager = new ITVManagerImpl("itv");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		manager = null;
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.fourthassignmenttopics.ITVManagerImpl#getNext()}.
	 * 
	 * TODO This method output might changes over time
	 * 
	 * 5333244,3444gff,16/10/2017 11:15:00,terrassa
	 */
	@Test
	public final void testGetNext() throws Exception {
		assertEquals(new ITV(5333244, "3444gff", LocalDateTime.parse("16/10/2017 11:15:00", DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss")), "terrassa"),
				manager.getNext());
		assertEquals(5333244, manager.getNext().getId());
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.fourthassignmenttopics.ITVManagerImpl#sort(java.util.Comparator)}.
	 */
	@Test
	public final void testSort() throws Exception {
		List<ITV> sortedByWhere = manager.sort((itv1, itv2) -> itv1.getWhere().compareTo(itv2.getWhere()));
		assertTrue(sortedByWhere.get(0).getWhere().equals("badalona"));
		assertTrue(sortedByWhere.get(sortedByWhere.size() - 1).getWhere().equals("terrassa"));
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.fourthassignmenttopics.ITVManagerImpl#from(java.lang.String)}.
	 */
	@Test
	public final void testFrom() throws Exception {
		assertEquals(2, manager.from("terrassa").size());
		assertEquals(1, manager.from("barcelona").size());
		assertEquals(0, manager.from("tarragona").size());
	}

}
