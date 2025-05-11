package FirstPack;

public class Oven extends Appliance implements Cookable {
    @Override
    public void describe() {
        System.out.println("오븐입니다.");
    }

    @Override
    public void cook(String food) {
        System.out.println(food + "를 오븐으로 굽는 중...");
    }
}
