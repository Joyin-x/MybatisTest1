package com.dx.innotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class testInnotation {
    @MyAnnotation(name="大雄",age=18)
    public void test(){

    }
}

@Target(value= {ElementType.METHOD,ElementType.TYPE})
@Retention(value= RetentionPolicy.RUNTIME)
@interface  MyAnnotation{
    //注解的参数：参数类型+参数名
    String name();
    int age();
    String address() default "";

    String[] schools() default {"西部开源","清华大学"};
}
