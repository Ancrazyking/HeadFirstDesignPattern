package com.ancrazyking.designpattern.StrategyPattern;

/**橡皮鸭:叫声为吱吱,所有重写父类quark()方法
 * @author Ancrazyking
 * @date 2018/6/11 22:01
 **/
public class RubberDuck extends Duck
{
    @Override
    public void quark()
    {
        System.out.println("吱吱");
    }

    @Override
    public void display()
    {
        System.out.println("黄色");
    }
}
