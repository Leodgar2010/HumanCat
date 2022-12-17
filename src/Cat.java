public class Cat extends Animal implements Pet {
    Boolean wishToHug;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getWishToHug() {
        return wishToHug;
    }

    public void setWishToHug(Boolean wishToHug) {
        this.wishToHug = wishToHug;
    }

    @Override
    public void feed() {
        System.out.println(name + " кушает");
    }

    @Override
    public void play() {
        System.out.println(name + " играет");
    }

}





