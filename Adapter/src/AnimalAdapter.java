public class AnimalAdapter implements Mammal{
    // You need to implement the interface your
    // client expects to use.
    Bird bird;
    public AnimalAdapter(Bird bird)
    {
        // we need reference to the object we
        // are adapting
        this.bird = bird;
    }

    public void makeSound()
    {

        bird.makeSound();
    }
}
