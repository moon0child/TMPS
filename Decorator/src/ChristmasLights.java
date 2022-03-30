public class ChristmasLights extends  TreeDecorator{
    public ChristmasLights(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithChristmasLights();
    }

    private String decorateWithChristmasLights() {
        return " with Christmas  Lights";
    }
}
