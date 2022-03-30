public class Main {
    public static void main(String args[])
    {
        //воробей
        Sparrow sparrow = new Sparrow();
        //пластиковй утёнок
        Mammal lion = new Lion();

        // создаём уточку через адаптер, и передаём туда воробья, чтобы утёнок стал чирикать
        // behaves like toy duck
        Mammal adapter = new AnimalAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("Lion...");
        lion.makeSound();

        // toy duck behaving like a bird
        System.out.println("After Adapter...");
        adapter.makeSound();
    }
}
