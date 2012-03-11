import static org.junit.Assert.*;
import org.junit.Test;


public class GreedTesting {

	@Test
	public void testComputeChangeNorm1() {
		final int[] expectedArray = {4,0,0,0};
		final changeByGreed input = new changeByGreed();
		assertArrayEquals("Result: ", expectedArray, input.computeChange(1.00));
	}
	
	@Test
	public void testComputeChangeNorm2() {
		final int[] expectedArray = {3,2,0,4};
		final changeByGreed input = new changeByGreed();
		assertArrayEquals("Result: ", expectedArray, input.computeChange(.99));
	}
	
	@Test
	public void testComputeChangeNorm3() {
		final int[] expectedArray = {3,2,0,0};
		final changeByGreed input = new changeByGreed();
		assertArrayEquals("Results: ", expectedArray, input.computeChange(.95));
	}
	
	@Test
	public void testComputeChangeNorm4() {
		final int[] expectedArray = {2,0,0,1};
		final changeByGreed input = new changeByGreed();
		assertArrayEquals("Result: ", expectedArray, input.computeChange(.51));
	}
	
	@Test
	public void testComputeChangeNorm5() {
		final int[] expectedArray = {1,2,0,4};
		final changeByGreed input = new changeByGreed();
		assertArrayEquals("Result: ", expectedArray, input.computeChange(.49));
	}
	
	@Test
	public void testComputeChangeNorm6() {
		final int[] expectedArray = {0,0,1,1};
		final changeByGreed input = new changeByGreed();
		assertArrayEquals("Result: ", expectedArray, input.computeChange(.06));
	}
	
	@Test
	public void testComputeChangeNorm7() {
		final int[] expectedArray = {0,1,1,1};
		final changeByGreed input = new changeByGreed();
		assertArrayEquals("Result: ", expectedArray, input.computeChange(.16));
	}
	
	@Test
	public void testComputeChangeZero() {
		final int[] expectedArray = {0,0,0,0};
		final changeByGreed input = new changeByGreed();
		assertArrayEquals("Result: ", expectedArray, input.computeChange(0));
	}
	
	@Test
	public void testComputeChangeNeg1() {
		final int[] expectedArray = {0,0,0,0};
		final changeByGreed input = new changeByGreed();
		assertArrayEquals("Result: ", expectedArray, input.computeChange(-.01));
	}
	
	@Test
	public void testComputeChangeNeg2() {
		final int[] expectedArray = {0,0,0,0};
		final changeByGreed input = new changeByGreed();
		assertArrayEquals("Result: ", expectedArray, input.computeChange(-.69));
	}
	
	@Test
	public void testComputeChangeNeg3() {
		final int[] expectedArray = {0,0,0,0};
		final changeByGreed input = new changeByGreed();
		assertArrayEquals("Result: ", expectedArray, input.computeChange(-.99));
	}


}
