package FirstPack;

public class Microwave extends Appliance implements Cookable {
    @Override
    public void describe() {
        System.out.println("전자레인지입니다.");
    }

    @Override
    public void cook(String food) {
        System.out.println(food + "를 전자레인지로 데우는 중...");
    }
}
