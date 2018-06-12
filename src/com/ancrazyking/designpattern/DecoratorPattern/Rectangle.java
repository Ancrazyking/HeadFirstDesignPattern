package com.ancrazyking.designpattern.DecoratorPattern;

/**Rectangle类实现Shape接口
 * @author Ancrazyking
 * @date 2018/6/12 22:34
 **/
public class Rectangle implements  Shape
{
    @Override
    public void draw()
    {
        System.out.println("Shape:Rectangle");
    }
}
