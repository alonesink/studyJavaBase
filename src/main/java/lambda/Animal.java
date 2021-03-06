package lambda;

/*
* Created by  WangDi  on 2017/9/5 0005
*/

/*函数式接口代表只包含一个抽象方法的接口。函数式接口可以包含多个默认方法，类方法，但只能声明一个抽象方法。
lambda表达式代替匿名内部类的时候，lambda代码块将会实现代替实现抽象类的方法体。*/

@FunctionalInterface
public interface Animal {

    //使用默认方法实现为什么就不行
    Integer runDistance(Integer speed);

}
