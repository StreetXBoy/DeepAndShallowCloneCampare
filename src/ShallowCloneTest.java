/**
 * @author 重新做人idea基础学习
 * @date 2020-8-27
 */
public class ShallowCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Major m=new Major("CS",12345);
        Student s1=new Student("chen",99,m);
        //浅拷贝值复制，引用类型仅仅拷贝引用地址
        Student s2=(Student)s1.clone();
        System.out.println(s1==s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("--------------------------------------------");
        s1.setAge(35);
        m.setMajorid(9999);
        m.setMajorname("EE");
        System.out.println(s1);
        System.out.println(s2);
        //引用类一变全变！！！！值类型的字段会复制
    }
}
