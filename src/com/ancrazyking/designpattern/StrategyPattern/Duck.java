package com.ancrazyking.designpattern.StrategyPattern;

/**
 * 策略模式
 * 将会变化的内容取出来封装起来,以便以后可以轻易的改动或扩充部分,而不影响不需要变化的其他部分
 * @author Ancrazyking
 * @date 2018/6/11 21:54
 * 策略模式的设计原则:多用组合,少用继承
 * 多用类的组合,少用类的继承
 * 类中使用组合,加入两个引用字段
 * FlyBehavior flyBehavioor
 * QuackBehavior quackBehavior;
 * 通过对,对象引用的方式.
 *
 **/
public  abstract class Duck
{
    /**
     * 鸭子叫
     * 和游泳
     */
    public void quark(){
        System.out.println("Quack,呱呱");
    }

    public void swim(){
        System.out.println("Swiming");
    }

    /**
     * 因为不同鸭子的外观是不同的
     * 所有该方法是抽象的,有子类自己完成
     */
    public abstract void display();

    /**
     * 如果想让鸭子飞起来了
     * 但并不是所有鸭子都会飞的
     * 可以提出来作为单独的接口
     */
  /*  public void fly(){
        System.out.println("I am flying");
    }
*/

}
