public abstract  class TreeDecorator implements ChristmasTree {
    private ChristmasTree tree;

    // standard constructors
    TreeDecorator(ChristmasTree tree){
        this.tree=tree;
    }
    @Override
    public String decorate() {
        return tree.decorate();
    }
}
