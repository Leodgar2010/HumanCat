public class Human {
    String name;
    int age;
    boolean wishToHug;
    boolean atHome;

    Human (){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWishToHug() {
        return wishToHug;
    }

    public void setWishToHug(boolean wishToHug) {
        this.wishToHug = wishToHug;
    }

    public boolean isAtHome() {
        return atHome;
    }

    public void setAtHome(boolean atHome) {
        this.atHome = atHome;
    }
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

