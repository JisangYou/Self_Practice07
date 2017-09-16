package inheritance;

public class ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToString thisObject = new ToString();
		thisObject.toStringMethod(thisObject);
	}

	public void toStringMethod(Object obj) {
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println("plus" + obj);
	}
	
	public void toStringMethod2() {
		System.out.println(this);
		System.out.println(toString());
		System.out.println("plus" + this);
	}
	
	public String toString(){
		return "ToString class";
	}

}
