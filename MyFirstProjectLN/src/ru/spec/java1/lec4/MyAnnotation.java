package ru.spec.java1.lec4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	String hello() default "world";
	int[] value() default {1,2};
}
