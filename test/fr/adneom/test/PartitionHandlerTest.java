package fr.adneom.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import fr.adneom.exception.InvalidTaille;
import fr.adneom.interfaces.IPartitionHandler;
import junit.framework.TestCase;

/**
 * 
 * @author achelly
 *
 */
public class PartitionHandlerTest extends TestCase {
	@Test
	public void testListShouldBePartionedToSublitsOfGivenSize() {

		Integer a[] = new Integer[] { 10, 20, 30, 40, 50 };
		List<List<Object>> expectedResult = new ArrayList<>();
		expectedResult.add(Arrays.asList(10, 20));
		expectedResult.add(Arrays.asList(30, 40));
		expectedResult.add(Arrays.asList(50));
		try {
			assertEquals(expectedResult, IPartitionHandler.partition(Arrays.asList(a), 2));
		} catch (InvalidTaille e) {
			e.printStackTrace();
		}

	}
}
