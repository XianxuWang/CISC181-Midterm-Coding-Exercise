package pkgGame;

public class Rectangle extends Shape implements Comparable<Object> {
    private int iWidth;
    private int iLength;
    public  Rectangle(int iWidth, int iLength) {
        if(iWidth<0||iLength<0){
            throw new IllegalArgumentException();
        }
        this.iWidth=iWidth;
        this.iLength=iLength;
    }
    public int getWidth() {
        return iWidth;
    }
    public void setWidth(int iWidth){
        if(iWidth<0){
            throw new IllegalArgumentException();
        }
        this.iWidth=iWidth;
    }
    public int getLength() {
        return iLength;
    }
    public void setLength(int iLength){
    	try {
    		if(iLength<0){
    			throw new IllegalArgumentException();
    			}
    		}
    	finally {
    			this.iLength=iLength;
    		}
    }

    @Override
    public double area() {
        return getLength()*getWidth();
    }

    @Override
    public double perimeter() {
        return 2*(getLength()+getWidth());
    }
    
    @Override
    public int compareTo(Object i) {
        if(this.area() > ((Rectangle)i).area()) {
        	return 1;
        }else if (this.area() < ((Rectangle)i).area()) {
        	return -1;
        }else {
        	return 0;
        }
    }

    public static void main(String[] args) {

   }

}
