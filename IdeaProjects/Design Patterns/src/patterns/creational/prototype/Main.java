package patterns.creational.prototype;

public class Main {

    public static void main(String... args) throws CloneNotSupportedException
    {
        CharacterFactory cf = new CharacterFactory();

        Character c1 = cf.createCharacterWithNewName("Zen");

        c1.showCharacterInfo();

        Character c2 = cf.createCharacterWithNewLevel(10);

        c2.showCharacterInfo();
    }
}
