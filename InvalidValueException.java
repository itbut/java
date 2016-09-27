package Basic;

public class InvalidValueException //��� ����� �� ����������
        extends Exception {

    private int id;

    public InvalidValueException() {
        this(-1, null);
    }

    public InvalidValueException(int id, String msg) {
        super(msg);
        this.id = id;
    }

    public int getId() {
        return id;

    }

    public void printInfo() {
        System.out.println("Field id: " + id + ", description: " + getMessage());
    }
}
