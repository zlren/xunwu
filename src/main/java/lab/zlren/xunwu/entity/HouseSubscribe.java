package lab.zlren.xunwu.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 预约看房信息表
 *
 * @author zlren
 * @since 2018-01-07
 */
@TableName("house_subscribe")
@Data
@Accessors(chain = true)
public class HouseSubscribe implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 房源id
     */
    @TableField("house_id")
    private Integer houseId;
    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 用户描述
     */
    private String desc;
    /**
     * 预约状态 1-加入待看清单 2-已预约看房时间 3-看房完成
     */
    private Integer status;
    /**
     * 数据创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 记录更新时间
     */
    @TableField("last_update_time")
    private Date lastUpdateTime;
    /**
     * 预约时间
     */
    @TableField("order_time")
    private Date orderTime;
    /**
     * 联系电话
     */
    private String telephone;
    /**
     * 房源发布者id
     */
    @TableField("admin_id")
    private Integer adminId;
}
