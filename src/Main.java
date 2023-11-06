// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Home home = new Home("Bishkek", "Lenina 3");
        Brother brother = new Brother(home, ColorEnum.WHITE, 78, 187, 20, "Akul");
        System.out.println(brother.getInfo());
        brother.makeVoice();
        brother.makeVoice2("Моя мама самая лучшая");
        System.out.println();

        Sister sister = new Sister(home, ColorEnum.WHITE, 56, 170, 17, "Alya");
        System.out.println(sister.getInfo());
        sister.makeVoice();
        sister.makeVoice2("Мой папа самый лучший");

}
}