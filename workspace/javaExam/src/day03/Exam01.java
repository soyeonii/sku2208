package day03;

public class Exam01 {
	Parent p1 = new Child();
	Child c1 = (Child) p1; // 명시적 형 변환

	Child c2 = new Child();
	Parent p2 = c2; // 묵시적 형 변환
	Object ob1 = c2;
	Object ob2 = p1;
}
