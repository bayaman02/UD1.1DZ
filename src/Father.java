public class Father {
    private Home home;
    private ColorEnum colorEnum;
    private double weight;
    private double rost;
    private int age;
    private String name;

    public Father(Home home, ColorEnum colorEnum, double weight, double rost, int age, String name) {
        this.home = home;
        this.colorEnum = colorEnum;
        this.weight = weight;
        this.rost = rost;
        this.age = age;
        this.name = name;
    }

    public Home getHome() {
        return home;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public String getInfo() {
        return "Age: " + age +
                "\nName: " + name +
                "\nRost: " + rost +
                "\nWeight: " + weight +
                "\nHome Address: " + home.getAddress() +
                "\nHome Gorod: " + home.getGorod() +
                "\nColorEnum: " + colorEnum;
    }


}
