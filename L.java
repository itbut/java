package Basic;

public class L {

    private int id;

    public L(int id) throws InvalidValueException {
        if (id < 0) {
            throw new InvalidValueException (1, "Invalid Id");
        }
    }

    public static void main(String[] args) {
        try {
            L tmp = new L(-123);//меняет вывод
            System.out.println("OK");
        } catch (InvalidValueException ex) {

            ex.printInfo();
        }
    
    }
}
