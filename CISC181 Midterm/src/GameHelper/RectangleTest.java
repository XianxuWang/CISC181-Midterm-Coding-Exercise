package GameHelper;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgGame.Rectangle;

public class RectangleTest {

	@Test
	public void Rec_constructortest1() {
		
		Rectangle L = new Rectangle(1, 3);
		int width = 3;
		L.setWidth(3);
		int iwidth = L.getWidth();
		assertEquals(width,iwidth);
	}
	
	@Test
	public void Rectangle_test(){
		Rectangle R = new Rectangle(7,16);
		assertTrue((7 == R.getWidth()&&(16 == R.getLength())));
	}
	
	@Test
	public void getWidth_test(){
		Rectangle R = new Rectangle(10,7);
		assertTrue(10 == R.getWidth());
	}
	
	@Test
	public void iLength_test() {
		Rectangle L = new Rectangle(1,8);
		int width1 = 8;
		
		L.setLength(8);
		
		int width2 = L.getLength();
		assertEquals(width1,width2);
		
	}
	
	
	@Test
	public void perimeter_test() {
		Rectangle L = new Rectangle(7,3);
		
		double perimeter1 = L.perimeter();
		int width2 = L.getLength();
		
		int width1 = L.getWidth();
		int perimeter2 = 2*(width2+width1);
		
		assertTrue(perimeter1 == perimeter2);
	
	}
	
	@Test
	public void area_test(){
		Rectangle R = new Rectangle(4,5);
		assertTrue(20 == R.area());
	}
	
	
	@Test
	public void compareTo_test1() {
		Rectangle rec1 = new Rectangle(6,10);
		
		Rectangle rec2 = new Rectangle(6,10);
		
		assertEquals(0, rec2.compareTo(rec1));
	}
	
	@Test
	public void compareTo_test2() {
		Rectangle pare1 = new Rectangle(3,4);
		Rectangle pare2 = new Rectangle(10,11);
		assertEquals(1, pare2.compareTo(pare1));
	
	}
	
	@Test 
	public void compareTo_test3() {
		Rectangle A = new Rectangle(6,9);
		Rectangle B = new Rectangle(4,5);
		assertEquals(-1, B.compareTo(A));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Throwexception_test1() {
		Rectangle G = new Rectangle(50,500);
		G.setWidth(-10);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Throwexception_test2() {
		Rectangle R = new Rectangle(60,400);
		R.setLength(-60);
	}
	@Test(expected = IllegalArgumentException.class)
	public void Throwexception_test3() {
		Rectangle Y = new Rectangle(-70,50);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void Throwexception_test4() {
		Rectangle H = new Rectangle(70,-50);
	}
}



	