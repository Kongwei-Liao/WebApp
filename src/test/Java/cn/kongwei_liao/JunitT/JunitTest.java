package cn.kongwei_liao.JunitT;

import cn.ant_nest.www.JunitDemo;
import org.junit.Assert;
import org.junit.Test;

public class JunitTest {
    @Test
    public void testNull3(){
        Assert.assertEquals(true, JunitDemo.isNull3(""));
    }
    @Test
    public void testNull1(){
        Assert.assertEquals(true, JunitDemo.isNull1(""));
    }
}
