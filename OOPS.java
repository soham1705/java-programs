class pen {
    String colour;
    String type;

    public void write() {
        System.out.println("write something");

    }

    public void Printcolour() {
        System.out.println(this.colour);
    }

}

public class OOPS {
    public static void main(String args[]) {
        pen pen1 = new pen();
        pen1.colour = "blue";
        pen1.type = "gel";
        pen1.write();

        pen pen2 = new pen();
        pen2.colour = "red";
        pen2.type = "ballpoint";

        pen1.Printcolour();
        pen2.Printcolour();

    }
}