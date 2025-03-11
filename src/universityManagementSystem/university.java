package universityManagementSystem;

public class university {
    String name;
    String Rector;

    public university(String name, String rector) {
        this.name = name;
        Rector = rector;
    }

    public static int enroll() {
        return enroll();
    }

    public String getName() {
        return name;
    }

    public String getRector() {
        return Rector;
    }

    public void setRector(String rector) {
        Rector = rector;
    }

    @Override
    public String toString() {
        return "university{" +
                "name='" + name + '\'' +
                ", Rector='" + Rector + '\'' +
                '}';
    }
}
