public class Wolf extends Animal implements Wild{

    Wolf (){}

    @Override
    public void hide() {
            System.out.println(name + " прячется");
    }

    @Override
    public void bite() {
        System.out.println(name + " кусается");
    }
}
