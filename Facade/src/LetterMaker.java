//Facade class
public class LetterMaker {
    private Letter big;
    private Letter small;
    private Letter cursive;

    public LetterMaker() {
        big = new Big();
        small = new Small();
        cursive = new Cursive();
    }

    public void drawBig(){
        big.draw();
    }
    public void drawSmall(){
        small.draw();
    }
    public void drawCursive(){
        cursive.draw();
    }
}
