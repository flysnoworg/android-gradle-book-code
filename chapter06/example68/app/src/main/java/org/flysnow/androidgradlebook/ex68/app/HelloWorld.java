package org.flysnow.androidgradlebook.ex68.app;

import org.flysnow.androidgradlebook.ex68.base.Person;

/**
 * Created by 飞雪无情 on 16-1-24.
 */
public class HelloWorld {
    public static void main(String[] args){
        Person person =new Person();
        person.setName("张三");
        person.setAge(18);
        System.out.println(person.toString());
    }
}
