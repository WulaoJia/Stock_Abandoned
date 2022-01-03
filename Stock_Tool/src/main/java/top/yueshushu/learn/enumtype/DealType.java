package top.yueshushu.learn.enumtype;

import org.springframework.util.Assert;

/**
 * 交易的类型
 * @author 两个蝴蝶飞
 */
public enum DealType {
    BUY(1,"B"),
    SELL(2,"S");

    private Integer code;

    private String desc;

    private DealType(Integer code, String desc){
        this.code=code;
        this.desc=desc;
    }

    /**
     * 获取交易的方法
     * @param code
     * @return
     */
    public static DealType getDealType(Integer code){
        Assert.notNull(code,"code编号不能为空");
        for(DealType configCodeType: DealType.values()){
            if(configCodeType.code.equals(code)){
                return configCodeType;
            }
        }
        return null;
    }
    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
