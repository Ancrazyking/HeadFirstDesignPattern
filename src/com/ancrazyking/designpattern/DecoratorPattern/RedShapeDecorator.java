package com.ancrazyking.designpattern.DecoratorPattern;

/**
 * 扩展ShapeDecoratorl类的实体装饰类
 *
 * @author Ancrazyking
 * @date 2018/6/12 22:39
 **/
public class RedShapeDecorator extends ShapeDecorator
{
    public RedShapeDecorator(Shape decoratedShape)
    {
        super(decoratedShape);
    }

    @Override
    public void draw()
    {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color:Red");
    }

}
