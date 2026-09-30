package patterns.creational.prototype;

public class Character implements Cloneable {

     String name;
     int health;
     int attackPower;
     int level;
     boolean specialSkill;

    public Character(String name,int health,int attackPower,int level,boolean specialSkill)
    {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.level = level;
        this.specialSkill = specialSkill;
    }

    @Override
    public Character clone() throws CloneNotSupportedException
    {
        return (Character) super.clone();
        //shallow copy -> but should do deep copy to avoid references getting copied
    }

    public void showCharacterInfo()
    {
        System.out.println("Character [Name="+name+", Health="+ health+", AttackPower="+attackPower+
                ", Level="+level+", SpecialSkill="+specialSkill);
    }
}
