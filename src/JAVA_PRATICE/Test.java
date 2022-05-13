package JAVA_PRATICE;

public class Test {
    public static void main(String[] args) {
//        Example example = new Example();
//        Example example2 = new Example(5);
        Student s = new Student();
    }
}
//class Example  {
//    public Example() {
//        this(5);
//        System.out.println("Example의 기본 생성자 호출!");
//    }
//
//    public Example(int x) {
//        System.out.println("Example의 두 번째 생성자 호출!");
//    }
//}
class Human {
    Human() {
        System.out.println("휴먼 클래스 생성자");
    }
}

class Student extends Human { // Human 클래스로부터 상속
    Student() {
        super(); // Human 클래스의 생성자 호출
        System.out.println("학생 클래스 생성자");
    }
}