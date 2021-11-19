package vip.aquan.abstractworkdemo.service.base;

/**
 * @author Chupei Wang
 * @since 2021/11/19
 */
public abstract class AbstractAnimalService {

    public void run() {
        System.out.println("动物开始运动");
        runType();
        System.out.println("动物结束运动");

    }

    public void eat() {
        System.out.println("动物开始吃");
        eatType();
        System.out.println("动物结束吃");
    }

    /**
     * 不同的动物有不同的运动方式，由子类实现
     */
    protected abstract void runType();

    /**
     * 不同的动物喜欢的食物不同，由子类实现
     */
    protected abstract void eatType();
}
