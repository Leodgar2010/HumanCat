public class Main {
    public static void main(String[] args) {
        Human human  = new Human();
        human.setAtHome(true);
        human.setWishToHug(true);
        Cat cat = new Cat();
        cat.setHungry(true);
        cat.setSleep(false);
        cat.setWishToHug(true);

        human.feedCat(human.atHome,cat.hungry,cat.sleep);
        human.hugCat(human.atHome,cat.wishToHug,human.wishToHug,cat.sleep);


    }
}