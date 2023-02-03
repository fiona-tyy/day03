package src.myapp;

public class Gnome extends Monster implements Hittable{
    
    public Gnome(){
        setName("gnome");
        setHealth(10);
    }

    @Override
    public String toString(){
        return "Gnome{name=%s, health=%s}".formatted(name, health);
    }
}
