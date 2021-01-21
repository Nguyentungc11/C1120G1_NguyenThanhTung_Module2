package bai11_stack_queue.bai_tap.bai_4_demerging;

public class DeMeringStaff {
    private int id;
    private String name;
    private String birthday;
    private String gender;

    public DeMeringStaff(int id, String name, String birthday, String gender) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public DeMeringStaff() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "DeMeringStaff: " +
                "Id = " + id +
                ", Name = " + name + '\'' +
                ", Birthday = " + birthday + '\'' +
                ", Gender = " + gender;
    }
}
