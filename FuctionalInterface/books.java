package FuctionalInterface;

public class books {
    private int id;
    private String name;
    private String writer;

    public books(int id, String name, String writer) {
        this.id = id;
        this.name = name;
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
