class GenericBox<T> {

    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenericBoxDemo {

    public static void main(String[] args) {

        GenericBox<String> box = new GenericBox<>();

        box.setItem("Laptop");

        System.out.println(box.getItem());

    }
}
