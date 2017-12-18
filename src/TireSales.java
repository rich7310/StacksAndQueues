
public class TireSales {

    
    public static void main(String[] args) {
        ArrayStack pole = new ArrayStack();
        System.out.println("Adding 10 tire to the stack: ");
        Tire t;
        for (int i = 0; i < 10; i++) {
            t = new Tire("Goodyear");
            pole.push(t);
        }
        System.out.println("Sell 4 tires to a customer");
        for (int i = 0; i < 4; i++) {
            t = (Tire)pole.pop();
            System.out.println(t);
        }
    }
    
}
