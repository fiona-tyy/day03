package src.myapp;

import java.util.LinkedList;
import java.util.List;


public class GameMain {

    public static void main(String[] args) {

        List<Hittable> enemies = new LinkedList<>();
        for (int i = 0; i < 3; i++){
            enemies.add(new Troll());
        }

        enemies.add(new Tree());
        enemies.add(new Gnome());

        Hittable h = new Tree();

        if (h instanceof Tree){
            Tree t = (Tree)h;
        }

        for (Hittable h: enemies){
            System.out.printf(">>> %s\n", h);
        }


        Link link = new Link();
        for (Hittable h: enemies){
            link.hit(h);
            System.out.printf(">> %s\n", h);
        }
    }
    
}
