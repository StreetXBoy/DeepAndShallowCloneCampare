/**
 * @author 重新做人idea基础学习
 * @date 2020-8-27
 */
public class Student implements Cloneable{
    private String name;
    private  int age;
    private  Major major;

    public Student(String name, int age, Major major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }
    //clone 默认浅拷贝!!!
    @Override
    public Object clone() throws CloneNotSupportedException {
        return  super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", major=" + major.getMajorname() +"   "+major.getMajorid()+
                '}';
    }
}
