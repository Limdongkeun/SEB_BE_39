package JAVA_PRATICE;

public class CarTest {
    public static void main(String[] args) {
        Car tesla = new Car("Model3","흰색","원해");

        System.out.println("내차 모델은 " + tesla.model + "이고 " + "색은 " + tesla.color + "입니다 " + tesla.want);
        tesla.power();
        tesla.accelerate();
        tesla.stop();
        tesla.shop();
    }
}
class  Car{
    public String model;
    public String color;

    public  String want;

    public Car(String model,String color,String want){
        this.model = model;
        this.color = color;
        this.want = want;
    }

    void  power(){
        System.out.println("시동을 걸었습니다");
    }
    void  accelerate(){
        System.out.println("더 빠르게");
    }
    void  stop(){
        System.out.println("멈춰!");
    }

    void shop(){
        System.out.println("사고싶다!");
    }
}
