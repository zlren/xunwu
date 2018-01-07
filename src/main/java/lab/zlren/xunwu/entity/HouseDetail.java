package lab.zlren.xunwu.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 房屋详情表
 *
 * @author zlren
 * @since 2018-01-07
 */
@TableName("house_detail")
@Data
@Accessors(chain = true)
public class HouseDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 详细描述
     */
    private String description;
    /**
     * 户型介绍
     */
    @TableField("layout_desc")
    private String layoutDesc;
    /**
     * 交通出行
     */
    private String traffic;
    /**
     * 周边配套
     */
    @TableField("round_service")
    private String roundService;
    /**
     * 租赁方式
     */
    @TableField("rent_way")
    private Integer rentWay;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 附近地铁线id
     */
    @TableField("subway_line_id")
    private Integer subwayLineId;
    /**
     * 附近地铁线名称
     */
    @TableField("subway_line_name")
    private String subwayLineName;
    /**
     * 地铁站id
     */
    @TableField("subway_station_id")
    private Integer subwayStationId;
    /**
     * 地铁站名
     */
    @TableField("subway_station_name")
    private String subwayStationName;
    /**
     * 对应house的id
     */
    @TableField("house_id")
    private Integer houseId;
}
