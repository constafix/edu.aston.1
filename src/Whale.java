public class Whale extends Mammal implements livingInWater {
    String name = "Кит";
    Mammal mammal = new Mammal();
    String description = name + " есть " + Animal.name + ", " + mammal.name + ", " + livingInWater.livesInWater();
}
