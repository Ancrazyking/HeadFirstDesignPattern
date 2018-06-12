package com.ancrazyking.designpattern.DecoratorPattern;

/**使用RedShapeDecorator来装饰对象
 * @author Ancrazyking
 * @date 2018/6/12 22:43
 **/
public class Main
{
    public static void main(String[] args){
        Shape circle=new Circle();
        Shape redCircle=new RedShapeDecorator(new Circle());
        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("Circle with red border");
        redCircle.draw();


    }


}
