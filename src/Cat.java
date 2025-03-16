public class Cat extends Mammal {
    String name = "Кошка";
    Wool wool = new Wool();
    String description = name + " " + "есть " + Animal.name + ", " + Mammal.name + " и " + wool.name;
}
