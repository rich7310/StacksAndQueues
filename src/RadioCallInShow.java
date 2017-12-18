
public class RadioCallInShow {

    
    public static void main(String[] args) {
        LinkedQueue phoneline = new LinkedQueue();
        System.out.println("Our phone lines open");
        System.out.println("We Currently have "+phoneline.size()+" callers.");
        phoneline.enqueue(new Caller("Nick"));
        phoneline.enqueue(new Caller("Scott"));
        phoneline.enqueue(new Caller("Alice"));
        System.out.println("The next caller will be "+phoneline.peekFront());
    }
    
}
