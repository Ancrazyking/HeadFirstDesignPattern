package com.ancrazyking.designpattern.DecoratorPattern;

/**Circle类实现Shape接口
 * @author Ancrazyking
 * @date 2018/6/12 22:34
 **/
public class Circle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Shape:Circle");
    }
}
