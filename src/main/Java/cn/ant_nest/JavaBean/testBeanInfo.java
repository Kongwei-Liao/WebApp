package cn.ant_nest.JavaBean;

import javafx.beans.property.Property;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class testBeanInfo {
    @Test
    public void testBean() throws IntrospectionException {
        //获取一个BeanInfo，就是一个JavaBean的描述器，从Student开始（含），到Object结束（不含）
        BeanInfo beanInfo= Introspector.getBeanInfo(JavaBeanDemo.class,Object.class);
        //拿到这个JavaBean的属性描述器
        PropertyDescriptor[] pds=beanInfo.getPropertyDescriptors();
        for(PropertyDescriptor pd:pds){
            //获取JavaBean的字段名
            System.out.println(pd.getName());
            //得到可读写方法
            System.out.println(pd.getReadMethod());
            System.out.println(pd.getWriteMethod());
        }
    }
    @Test
    public void testBeanUtils() throws InvocationTargetException, IllegalAccessException {
        JavaBeanDemo1 CPjdm=new JavaBeanDemo1();
        Map m=new HashMap();
        m.put("name","Kongwei_Liao");
        m.put("age",18);
        m.put("id",123);

        BeanUtils.copyProperties(CPjdm,m);
        System.out.println(CPjdm.getName());
        System.out.println(CPjdm.getId());
    }
}
