package inheritance;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equals thisObject = new Equals();
//		thisObject.equalMethod();
		thisObject.equalMethod2();

	}

	public void equalMethod() {// 같은 클래스에서 생성하였지만, 객체가 다르고, 그 주소역시 다르기때문에 다른 값으로 인식
		MemberDTO obj1 = new MemberDTO("Sangmin");
		MemberDTO obj2 = new MemberDTO("Sangmin");
		if (obj1 == obj2) {
			System.out.println("obj1 and obj2 is name");
		} else {
			System.out.println("obj1 and obj2 is different");
		}
	}

	public void equalMethod2() {// 같은 클래스에서 생성하였지만, 객체가 다르고, 그 주소역시 다르기때문에 다른 값으로 인식, 오버라이딩 필요함.
		MemberDTO obj1 = new MemberDTO("Sangmin");
		MemberDTO obj2 = new MemberDTO("Sangmin");
		if (obj1.equals(obj2)) {
			System.out.println("obj1 and obj2 is name");
		} else {
			System.out.println("obj1 and obj2 is different");
		}
	}

}
