package com.javaee.examples.shadowing;

/**
 * Created by krishna1bhat on 7/28/17.
 */
public class ShadowTestInnerClass {
    public int x = 0;

    class FirstLevelInnerClass {//Inner Class

        public int x = 1;

        void methodInFirstLevelInnerClass(int x) {
            //three variables named x;
            //1. member variable of the class ShadowTestInnerClass
            //2. member variable of the inner class FirstLevelInnerClass
            //3. parameter in the method methodInFirstLevelInnerClass

            System.out.println("x = " + x);//shadows the variable of the inner class
            System.out.println("this.x = " + this.x);//using member variable of the inner class
            System.out.println("ShadowTest.this.x = " + ShadowTestInnerClass.this.x);//using member variable of the outer class using fully qualified name
        }
    }

    public static void main(String... args) {
        ShadowTestInnerClass st = new ShadowTestInnerClass();

        ShadowTestInnerClass.FirstLevelInnerClass fl = st.new FirstLevelInnerClass();

        fl.methodInFirstLevelInnerClass(2);
    }
}
