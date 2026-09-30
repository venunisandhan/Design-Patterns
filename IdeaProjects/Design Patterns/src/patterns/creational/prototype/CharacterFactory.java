package patterns.creational.prototype;

public class CharacterFactory {

    private Character prototypeCharacter;

    public CharacterFactory()
    {
        prototypeCharacter = new Character("Default",100,50,1,false);
    }

    public Character createCharacterWithNewName(String name) throws CloneNotSupportedException
    {
        Character clonedCharacter = prototypeCharacter.clone();
        clonedCharacter = new Character(name,clonedCharacter.health
                ,clonedCharacter.attackPower,clonedCharacter.level,clonedCharacter.specialSkill
        );
        return clonedCharacter;
    }

    public Character createCharacterWithNewLevel(int level) throws CloneNotSupportedException
    {
        Character clonedCharacter = prototypeCharacter.clone();
        clonedCharacter = new Character(clonedCharacter.name,clonedCharacter.health
                ,clonedCharacter.attackPower,level,clonedCharacter.specialSkill
        );
        return clonedCharacter;
    }
}
