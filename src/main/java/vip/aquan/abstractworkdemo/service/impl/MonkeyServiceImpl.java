package vip.aquan.abstractworkdemo.service.impl;

import org.springframework.stereotype.Service;
import vip.aquan.abstractworkdemo.service.base.AbstractAnimalService;

/**
 * @author Chupei Wang
 * @since 2021/11/19
 */
@Service("monkey")
public class MonkeyServiceImpl extends AbstractAnimalService {
    @Override
    protected void runType() {
        System.out.println("---猴子爬树---");
    }

    @Override
    protected void eatType() {
        System.out.println("---猴子吃桃---");
    }
}
