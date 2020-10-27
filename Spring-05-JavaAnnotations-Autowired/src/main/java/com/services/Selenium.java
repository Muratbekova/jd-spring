package com.services;

import com.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    @Override
    public void getTeachingHourse() {
        System.out.println("Weekly teaching hourse : 23");
    }
}
