package canteendemo;

public class Canteen {
    private String canteenName;
    private Food noodles = new Food("重庆小面", 3);
    private Food rice = new Food("米饭", 1);
    //这里也增加其他的菜
    public String getCanteenName() {
        return canteenName;
    }

    public void setCanteenName(String canteenName) {
        this.canteenName = canteenName;
    }

    public void showMenu() {
        System.out.println("这里是" + canteenName + ",我们有");
        System.out.println(noodles.getName());
        System.out.println(rice.getName());
    }

    public void makeFood(Food food) {
        System.out.println(food.getName() + "已经做好了");
    }

}
