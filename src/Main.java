public class Main {
    public static void main(String[] args) {
        Human human  = new Human();
        human.setAtHome(true);
        human.setWishToHug(true);
        System.out.println("Поговорим про котика.");
        Cat cat = new Cat();
        cat.setName("Арсик");
        cat.setHungry(true);
        cat.setSleep(false);
        cat.setWishToHug(true);
        human.feedCat(cat.getName(), human.atHome,cat.hungry,cat.sleep);
        cat.feed();
        human.hugCat(cat.getName(),human.atHome,cat.wishToHug,human.wishToHug,cat.sleep);
        cat.play();
        System.out.println("Теперь поговорим про волка.");
        Wolf wolf = new Wolf();
        wolf.setName("Вован");
        wolf.hide();
        wolf.bite();


    }
}