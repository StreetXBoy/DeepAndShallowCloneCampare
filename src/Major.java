/**
 * @author 重新做人idea基础学习
 * @date 2020-8-27
 */
public class Major implements  Cloneable{

    private  String majorname;
    private  long majorid;

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname;
    }

    public long getMajorid() {
        return majorid;
    }

    public void setMajorid(long majorid) {
        this.majorid = majorid;
    }

    public Major(String majorname, long majorid) {
        this.majorname = majorname;
        this.majorid = majorid;
    }
    //顶层调用类中还用重写！！！！！！
    @Override
    public  Object clone() throws CloneNotSupportedException {
        return  super.clone();
    }
}
