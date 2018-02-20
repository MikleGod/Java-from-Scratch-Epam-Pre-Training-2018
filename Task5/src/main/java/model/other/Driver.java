package model.other;

public class Driver {

    public final static String CATEGORY_A = "A";
    public final static String CATEGORY_B = "B";
    public final static String CATEGORY_C = "C";
    public final static String CATEGORY_D = "D";

    private String fullName;
    private int age;
    private String category;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Driver(String fullName, int age, String category) {

        this.fullName = fullName;
        this.age = age;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        if (age != driver.age) return false;
        if (fullName != null ? !fullName.equals(driver.fullName) : driver.fullName != null) return false;
        return category != null ? category.equals(driver.category) : driver.category == null;
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", category='" + category + '\'' +
                '}';
    }
}
