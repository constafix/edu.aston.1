public class Bear extends Mammal {
    String name = "Медведь";
    Mammal mammal = new Mammal();
    Wool wool = new Wool();
    String description = name + " " + "есть " + Animal.name + ", " + mammal.name + " и " + wool.name;
}
