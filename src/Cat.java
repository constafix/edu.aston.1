public class Cat extends Mammal {
    String name = "Кошка";
    Mammal mammal = new Mammal();
    Wool wool = new Wool();
    String description = name + " " + "есть " + Animal.name + ", " + mammal.name + " и " + wool.name;
}
