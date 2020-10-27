package com.services;

import com.interfaces.Course;
import org.graalvm.compiler.lir.CompositeValue;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Override
    public void getTeachingHourse() {
        System.out.println("Weekly teaching hourse : 30");
    }
}
