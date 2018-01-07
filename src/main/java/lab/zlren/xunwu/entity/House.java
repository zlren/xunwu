package lab.zlren.xunwu.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 房屋信息表
 *
 * @author zlren
 * @since 2018-01-07
 */
@Data
@Accessors(chain = true)
public class House implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * house唯一标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String title;
    /**
     * 价格
     */
    private Integer price;
    /**
     * 面积
     */
    private Integer area;
    /**
     * 卧室数量
     */
    private Integer room;
    /**
     * 楼层
     */
    private Integer floor;
    /**
     * 总楼层
     */
    @TableField("total_floor")
    private Integer totalFloor;
    /**
     * 被看次数
     */
    @TableField("watch_times")
    private Integer watchTimes;
    /**
     * 建立年限
     */
    @TableField("build_year")
    private Integer buildYear;
    /**
     * 房屋状态 0-未审核 1-审核通过 2-已出租 3-逻辑删除
     */
    private Integer status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 最近数据更新时间
     */
    @TableField("last_update_time")
    private Date lastUpdateTime;
    /**
     * 城市标记缩写 如 北京bj
     */
    @TableField("city_en_name")
    private String cityEnName;
    /**
     * 地区英文简写 如昌平区 cpq
     */
    @TableField("region_en_name")
    private String regionEnName;
    /**
     * 封面
     */
    private String cover;
    /**
     * 房屋朝向
     */
    private Integer direction;
    /**
     * 距地铁距离 默认-1 附近无地铁
     */
    @TableField("distance_to_subway")
    private Integer distanceToSubway;
    /**
     * 客厅数量
     */
    private Integer parlour;
    /**
     * 所在小区
     */
    private String district;
    /**
     * 所属管理员id
     */
    @TableField("admin_id")
    private Integer adminId;
    private Integer bathroom;
    /**
     * 街道
     */
    private String street;
}
