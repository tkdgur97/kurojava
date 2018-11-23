package java29;

//인터페이스 2개를 구현한 클래스
//1개 이상의 인터페이스를 구현함으로써 다중상속을 가능하게 함.
public class BCClass implements B, C {

	@Override
	public void c() {
		System.out.println("C인터페이스를 구현한 클래스");
	}

	@Override
	public void b() {
		System.out.println("B인터페이스를 구현한 클래스");

	}

}
