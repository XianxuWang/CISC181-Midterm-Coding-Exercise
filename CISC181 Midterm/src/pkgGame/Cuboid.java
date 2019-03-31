package pkgGame;
import java.util.Comparator;
public class Cuboid extends Rectangle{
    private int iDepth;
    public Cuboid(int iWidth, int iLength, int iDepth) {
        super(iWidth, iLength);
        if(iDepth<0){
            throw new IllegalArgumentException();
        }
        this.iDepth=iDepth;
    }

    public int getDepth() {
        return iDepth;
    }

    public void setDepth(int iDepth){
        if(iDepth<0){
            throw new IllegalArgumentException();
        }
        this.iDepth=iDepth;
    }

    public double volume() {
        double volume = getLength()*getWidth()*getDepth();
        return volume;
    }

    @Override
    public double area() {
        double area = 2*((getLength()*getWidth())+(getLength()*getDepth())+(getDepth()*getWidth()));
        return area;
    }
    @Override
    public double perimeter() {
    	try {
    		if(iDepth<0){
    			throw new IllegalArgumentException();}
    		}finally {
    			this.iDepth=iDepth;
    		}
    	double perimeter=4*(getLength()+getWidth()+getDepth());
    	return perimeter;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
    	if(this.area() > ((Cuboid)o).area()) {
        	return 1;
        }else if (this.area() < ((Cuboid)o).area()) {
        	return -1;
        }else {
        	return 0;
        }
    }

    public class SortByArea implements Comparator<Cuboid>{
        public SortByArea() { }
        @Override
        public int compare(Cuboid o1, Cuboid o2) {
            // TODO Auto-generated method stub
        	if(o1.area() > o2.area()) {
            	return 1;
            }else if  (o1.area() < o2.area()){
            	return -1;
            }else {
            	return 0;
            }
        }

    }
    public class SortByVolume implements Comparator<Cuboid>{
        public SortByVolume(){ }
        @Override
        public int compare(Cuboid o1, Cuboid o2) {
            // TODO Auto-generated method stub
        	if(o1.volume() > o2.volume()) {
            	return 1;
            }else if  (o1.volume() < o2.volume()){
            	return -1;
            }else {
            	return 0;
            }
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
}