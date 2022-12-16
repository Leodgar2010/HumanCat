public class Interaction {
    public void feedCat (Boolean atHome, Boolean hungry, Boolean sleep){
        if (atHome && hungry && !sleep) {
        System.out.println("Котика покормили");
    }else {
            System.out.println("Котика не покормили");}
    }

    public void hugCat (Boolean atHome, Boolean catwishYoHug, Boolean humanWishtoHug, Boolean sleep)
    {
        if (atHome && catwishYoHug && humanWishtoHug&& !sleep) {
            System.out.println("Котика обняли");
        }else {
            System.out.println("Котика не обняли");}
    }
}
