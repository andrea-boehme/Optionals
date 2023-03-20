public class RAM {

    private String name;

    public RAM(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                '}';
    }
}
