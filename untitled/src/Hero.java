public class Hero extends Actor {
    public void fight(){
        System.out.println("fight");
    }

    public static void main(String[] args) {
        Hero h=new Hero();
        h.act();
        h.fight();

    }
}

