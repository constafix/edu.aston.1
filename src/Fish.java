public class Fish extends Animal implements livingInWater {

    String name = "Рыба";
    String description = name + " есть " + Animal.name + ", " + livingInWater.livesInWater();
}
