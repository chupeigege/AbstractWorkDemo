package vip.aquan.abstractworkdemo.service.base;

import org.springframework.stereotype.Component;
import vip.aquan.abstractworkdemo.constants.AnimalType;

import java.util.Map;

/**
 * @author Chupei Wang
 * @since 2021/11/19
 */
@Component
public class AnimalFactory {
    private static Map<String, AbstractAnimalService> animalServiceMap;

    public AnimalFactory(Map<String, AbstractAnimalService> animalServiceMap) {
        AnimalFactory.animalServiceMap = animalServiceMap;
    }

    public static AbstractAnimalService getInstance(AnimalType animalType){
        if (animalServiceMap.containsKey(animalType.getDesc())) {
            return animalServiceMap.get(animalType.getDesc());
        } else {
            throw new RuntimeException("service not found");
        }
    };


}
