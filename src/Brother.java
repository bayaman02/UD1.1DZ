public class Brother extends Father {


    public Brother(Home home, ColorEnum colorEnum, double weight, double rost, int age, String name) {
        super(home, colorEnum, weight, rost, age, name);
        getInfo();
    }

    public void makeVoice(){
        System.out.println("Нет ничего важнее кроме семьи");
    }
    public void makeVoice2(String voice){
        System.out.println(voice);
    }


}
