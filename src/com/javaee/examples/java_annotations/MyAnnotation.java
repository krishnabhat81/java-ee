package com.javaee.examples.java_annotations;

import java.lang.annotation.*;

/**
 * Created by krishna1bhat on 6/26/17.
 */
//Custome annotation example..

@Documented                         //indicates that elements using this annotation should be documented by javadoc and similar tools.
@Target(ElementType.METHOD)         //indicates the kinds of program element to which an annotation type is applicable.
@Inherited                          //indicates that an annotation type is automatically inherited.
@Retention(RetentionPolicy.RUNTIME) //indicates how long annotations with the annotated type are to be retained.
public @interface MyAnnotation {
    int revision() default 1;
    String author() default "Krishna";
    String date();
    String comments();
}
