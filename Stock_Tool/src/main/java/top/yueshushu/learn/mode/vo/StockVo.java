package top.yueshushu.learn.mode.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @ClassName:StockVo
 * @Description TODO
 * @Author 岳建立
 * @Date 2022/1/3 9:52
 * @Version 1.0
 **/
@Data
@ApiModel("股票展示信息")
public class StockVo implements Serializable {
    @ApiModelProperty("id编号自增")
    private Integer id;
    @ApiModelProperty("股票编号")
    private String code;
    @ApiModelProperty("股票的名称")
    private String name;
    @ApiModelProperty("股票的标识 0为深圳 1为上海 2为北京")
    private Integer exchange;
    @ApiModelProperty("股票代码的全称")
    private String fullCode;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("创建人")
    private String createUser;
    @ApiModelProperty("是否删除 1为正常 2为删除")
    private Boolean flag;
}
