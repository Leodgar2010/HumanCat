public class Main {
    public static void main(String[] args) {
        Human human  = new Human();
        human.setAtHome(false);
        human.setWishToHug(true);
        Cat cat = new Cat();
        cat.setHungry(true);
        cat.setSleep(false);
        cat.setWishToHug(true);
        Interaction interaction = new Interaction();
        interaction.feedCat(human.atHome,cat.hungry,cat.sleep);
        interaction.hugCat(human.atHome,cat.wishToHug,human.wishToHug,cat.sleep);


    }
}