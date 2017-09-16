package inheritance;

public class InheritanceCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InheritanceCasting inheritance = new InheritanceCasting();
//		inheritance.objecCast();
//		inheritance.objecCast2();
		inheritance.objectCastArray();
	}
	public void objecCast(){
		ParentCasting parent = new ParentCasting();
		ChildCasting child = new ChildCasting();
		
		ParentCasting parent2 = child;
		ChildCasting child2 = (ChildCasting)parent;
	}

	public void objecCast2(){
		ParentCasting parent = new ParentCasting();
		ChildCasting child = new ChildCasting();
		
		ParentCasting parent2 = child;
		ChildCasting child2 = (ChildCasting)parent2;
	}
	
	public void objectCastArray(){
		ParentCasting[] parentArray = new ParentCasting[3];
		parentArray[0] = new ChildCasting();
		parentArray[1] = new ParentCasting();
		parentArray[2] = new ChildCasting();
		objectTypeCheck(parentArray);
		
	}
	
	private void objectTypeCheck(ParentCasting[] parentArray){
		for(ParentCasting tempParent:parentArray){
			if(tempParent instanceof ChildCasting){
				System.out.println("ChildCasting");
				ChildCasting tempChild = (ChildCasting)tempParent;
				tempChild.printAge();
			} else if(tempParent instanceof ParentCasting){
				System.out.println("ParentCasting");
			}
		}
	}
	

}




















