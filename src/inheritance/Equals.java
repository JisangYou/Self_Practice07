package inheritance;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equals thisObject = new Equals();
//		thisObject.equalMethod();
		thisObject.equalMethod2();

	}

	public void equalMethod() {// ���� Ŭ�������� �����Ͽ�����, ��ü�� �ٸ���, �� �ּҿ��� �ٸ��⶧���� �ٸ� ������ �ν�
		MemberDTO obj1 = new MemberDTO("Sangmin");
		MemberDTO obj2 = new MemberDTO("Sangmin");
		if (obj1 == obj2) {
			System.out.println("obj1 and obj2 is name");
		} else {
			System.out.println("obj1 and obj2 is different");
		}
	}

	public void equalMethod2() {// ���� Ŭ�������� �����Ͽ�����, ��ü�� �ٸ���, �� �ּҿ��� �ٸ��⶧���� �ٸ� ������ �ν�, �������̵� �ʿ���.
		MemberDTO obj1 = new MemberDTO("Sangmin");
		MemberDTO obj2 = new MemberDTO("Sangmin");
		if (obj1.equals(obj2)) {
			System.out.println("obj1 and obj2 is name");
		} else {
			System.out.println("obj1 and obj2 is different");
		}
	}

}
