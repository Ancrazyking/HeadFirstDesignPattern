package com.ancrazyking.designpattern.DecoratorPattern;

/**实现Shape接口的抽象装饰类
 * @author Ancrazyking
 * @date 2018/6/12 22:36
 **/
public class ShapeDecorator implements Shape
{
    protected  Shape decoratedShape;

    public  ShapeDecorator(Shape decoratedShape)
    {
        this.decoratedShape=decoratedShape;
    }

    @Override
    public void draw()
    {
        decoratedShape.draw();
    }
}
