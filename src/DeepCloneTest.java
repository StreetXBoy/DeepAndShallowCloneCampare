/**
 * @author 重新做人idea基础学习
 * @date 2020-8-27
 */
public class DeepCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Major m=new Major("CS",12345);
        DeepStudent s1=new DeepStudent("chen",99,m);
        //java引用传递！！！！！
        //深拷贝直接直接创建副本,改变不会对另外一个产生影响！！！！！独立
        DeepStudent s2=(DeepStudent)s1.clone();
        System.out.println(s1==s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("--------------------------------------------");
        s1.setAge(35);
        m.setMajorid(9999);
        m.setMajorname("EE");
        System.out.println(s1);
        System.out.println(s2);

    }
}
