package GameHelper;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import pkgGame.Cuboid;
import pkgGame.Cuboid.SortByArea;
import pkgGame.Cuboid.SortByVolume;
import pkgGame.Rectangle;

public class CuboidTest {

	@Test
	public void Cuboid_constructor_test() {
		Cuboid A = new Cuboid(1,2,3);
		int idepth = 3;
		A.setDepth(3);
		int depth = A.getDepth();
		assertEquals(idepth,depth);
	}
	
	@Test
	public void Cuboid_volume_test() {
		Cuboid A = new Cuboid(1,2,3); 
		double volume1 = A.volume();
		int length1 = A.getLength();
		int width1 = A.getWidth();
		int depth1 = A.getDepth();
		assertTrue(volume1 == length1*width1*depth1);
	}
	
	@Test
	public void Cuboid_perimeter_test() {
		Cuboid A = new Cuboid(1,2,3);
		double perimeter1 = A.perimeter();
		int perimeter2 = 4*(A.getLength() + A.getDepth() + A.getWidth());
		assertTrue(perimeter1 == perimeter2);
		
	}
	
	@Test
	public void Cuboid_area_test() {
		Cuboid A = new Cuboid(1,2,3);
		double perimeter1 = A.area();
		int width3 = 2*(A.getWidth()* A.getDepth());
		int depth4 = 2*(A.getDepth()* A.getLength());
		int length4 = 2*(A.getLength()* A.getWidth());
		int perimeter2 = (length4+width3+depth4);
		assertTrue(perimeter2 == perimeter1);}
	
	@Test
	public void compareTo_test1() {
		Cuboid C = new Cuboid(1,2,3);
		Cuboid B = new Cuboid(1,2,3);
		assertEquals(0, B.compareTo(C));
	}
	
	@Test
	public void compareTo_test2() {
		Cuboid C = new Cuboid(4,4,5);
		Cuboid B = new Cuboid(2,2,2);
		assertEquals(-1, B.compareTo(C));
	}
	
	@Test
	public void compareTo_test3() {
		Cuboid C = new Cuboid(1,1,1);
		Cuboid B = new Cuboid(2,2,2);
		assertEquals(1, B.compareTo(C));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Throwexception_test1() {
		Cuboid L = new Cuboid(40, 400, -400);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Throwexception_test2() {
		Cuboid L = new Cuboid(40, 400, 400);
		L.setDepth(-10);
	}
	
	@Test
	public void SortByArea_test1() {
		Cuboid D = new Cuboid(5,6,7);
		Cuboid d = new Cuboid(5,6,7);
		SortByArea area = d.new SortByArea();
		assertTrue(area.compare(D,d)==0);
	}
	
	@Test
	public void SortByArea_test2() {
		Cuboid D = new Cuboid(15,15,25);
		Cuboid d = new Cuboid(36,36,36);
		SortByArea area = d.new SortByArea();
		assertTrue(area.compare(D,d)==-1);
	}
	@Test
	public void SortByArea_test3() {
		Cuboid D = new Cuboid(43,53,73);
		Cuboid d = new Cuboid(1,1,2);
		SortByArea area1 = d.new SortByArea();
		assertTrue(area1.compare(D,d)==1);
	}
	
	@Test
	public void SortByVolume_test1() {
		Cuboid D = new Cuboid(11,22,33);
		Cuboid d = new Cuboid(22,33,44);
		SortByVolume vol = d.new SortByVolume(); 
		assertTrue(vol.compare(d,D)== 1);
		
	}
	@Test
	public void SortByVolume_test2() {
		Cuboid D = new Cuboid(2,3,4);
		Cuboid d = new Cuboid(2,3,4);
		SortByVolume vol = d.new SortByVolume();
		assertTrue(vol.compare(D,d)== 0);
	}
	@Test
	public void SortByVolume_test3() {
		Cuboid D = new Cuboid(2,3,4);
		Cuboid d = new Cuboid(44,34,46);
		SortByVolume vol = d.new SortByVolume();
		
		assertTrue(vol.compare(D,d)== -1);
	}
}
	
	
	
	
	

	

