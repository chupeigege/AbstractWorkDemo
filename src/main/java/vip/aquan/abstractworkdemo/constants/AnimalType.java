package vip.aquan.abstractworkdemo.constants;

import java.util.Arrays;

/**
 * @author Chupei Wang
 * @since 2021/11/19
 */
public enum AnimalType {
    HORSE(1,"horse"),

    MONKEY(2,"monkey");

    private Integer code ;

    private String desc;


    AnimalType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static AnimalType get(Integer code){
        return Arrays.stream(AnimalType.values()).filter(
                c -> c.getCode().equals(code)).findFirst().get();
    }
}
