package cn.ant_nest.www;

public class JunitDemo {
    public static Boolean isNull1(String str){
        if(str==null|| str.equals(""))
            return true;
        else
            return false;
    }
    public static Boolean isNull2(String str){
        return true;
    }
    public static Boolean isNull3(String str){
        return (str==null|| str.equals(""))?true:false;
    }
}
