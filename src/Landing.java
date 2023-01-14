public class Landing extends Location{
    final public Home home;
    public Landing(String name, Home home) {
        super(name);
        this.home = home;
    }

    public Home getHome() {
        return home;
    }

}
