// Superclass mim
class mim{
    int x = 4000;    // Variable to store x fees
    int y = 3500;  // Variable to store y fees
}

// Subclass p6 which extends mim
public class p6 extends mim {
    int z = 2000;  // Variable to store private fees

    // Constructor for p6
    public p6() {
        super();  // Call the constructor of the superclass mim
        this.z = 2000;  // Use 'this' keyword to refer to the instance variable z
    }

    public static void main(String[] args) {
        p6 t = new p6();  // Create an instance of the subclass p6

        // Accessing and printing the variables from both the superclass and subclass
        System.out.println("mim's x fees: " + t.x);
        System.out.println("mim's y fees: " + t.y);
        System.out.println("mim's private fees: " + t.z);
    }
}