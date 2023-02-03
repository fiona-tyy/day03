package src.myapp;

public class Troll extends Monster implements Hittable {
    
    public Troll(){
        setName("troll");
        setHealth(5);
    }

    @Override
    public String toString(){
        return "Troll{name=%s, health=%s}".formatted(name, health);
    }
}
