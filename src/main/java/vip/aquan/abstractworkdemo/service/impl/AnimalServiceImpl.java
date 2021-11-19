package vip.aquan.abstractworkdemo.service.impl;

import org.springframework.stereotype.Service;
import vip.aquan.abstractworkdemo.constants.AnimalType;
import vip.aquan.abstractworkdemo.service.base.AnimalFactory;
import vip.aquan.abstractworkdemo.service.AnimalService;

/**
 * @author Chupei Wang
 * @since 2021/11/19
 */
@Service
public class AnimalServiceImpl implements AnimalService {

    public AnimalServiceImpl() {
    }

    @Override
    public void run(Integer type) {
        AnimalFactory.getInstance(getAnimalType(type)).run();
    }

    @Override
    public void eat(Integer type) {
        AnimalFactory.getInstance(getAnimalType(type)).eat();
    }

    private AnimalType getAnimalType(Integer type) {
        AnimalType animalType = null;
        if(type == 1){
            animalType = AnimalType.HORSE;
        }
        if(type == 2){
            animalType = AnimalType.MONKEY;
        }
        return animalType;
    }
}
