package src.myapp;

public class Monster{

    String name;
    int health;

    public Monster(){

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

     public int getHealth() {
        return health;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isDead(){
        return this.health <= 0;
    }

    // methods
    public void hit(int damage){
        this.health -= damage;
    }

    @Override
    public String toString(){
        return "Monster {name=%s, health=%s}".formatted(name, health);
    }
}