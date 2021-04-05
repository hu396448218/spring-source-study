package com.zhuguang.jack.myProxy;
import java.lang.reflect.Method;
public class $Proxy0 implements com.zhuguang.jack.myProxy.People{
MyInvocationHandler h;
public $Proxy0(MyInvocationHandler h) {
this.h=h;
}public void zhaoduixiang() throws Throwable {
Method md = com.zhuguang.jack.myProxy.People.class.getMethod("zhaoduixiang",new Class[]{});
this.h.invoke(this,md,null);
}

}