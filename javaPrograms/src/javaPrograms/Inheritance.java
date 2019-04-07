package javaPrograms;

abstract class Parent{
	abstract void name();
	void parentmethod(int a){
		System.out.println(a);
	}
}
class Child extends Parent{
	void parentmethod(int x){
		System.out.println("parent method in clid class"+x);
	}
	void childmethod(){
		System.out.println("Child class Executed");
		}
	void name() {
		System.out.println("Sudheer");
		
	}
	
}
public class Inheritance {

	public static void main(String[] args) {
		Parent p=new Child();
		p.parentmethod(5);
		p.parentmethod(10);
		System.out.println("-----------------------------");
		Child c=new Child();
		c.parentmethod(15);
		c.childmethod();
	}

}
