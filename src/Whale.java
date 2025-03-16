public class Whale extends Mammal implements livingInWater {
    String name = "Кит";
    String description = name + " есть " + Animal.name + ", " + Mammal.name + ", " + livingInWater.livesInWater();
}
