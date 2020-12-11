package se.demo;

/**
 * @author WangChen
 * @filename normal
 * @date 2020/12/11 14:00
 * @description 普通内部类
 */

class Circle {
    private double radius = 0;
    public static int count = 1;

    public Circle(double radius) {
        this.radius = radius;
    }

    class Draw {     //内部类
        private double radius = 0;

        public void drawShape() {
            System.out.println(radius);  //外部类的private成员
            System.out.println(count);   //外部类的静态成员
            System.out.println("外部：" + Circle.this.radius);
        }
    }
}

