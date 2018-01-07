package lab.zlren.xunwu.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 城市表
 *
 * @author zlren
 * @since 2018-01-07
 */
@TableName("support_address")
@Data
@Accessors(chain = true)
public class SupportAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 上一级行政单位名
     */
    @TableField("belong_to")
    private String belongTo;
    /**
     * 行政单位英文名缩写
     */
    @TableField("en_name")
    private String enName;
    /**
     * 行政单位中文名
     */
    @TableField("cn_name")
    private String cnName;
    /**
     * 行政级别 市-city 地区-region
     */
    private String level;
    /**
     * 百度地图经度
     */
    @TableField("baidu_map_lng")
    private Double baiduMapLng;
    /**
     * 百度地图纬度
     */
    @TableField("baidu_map_lat")
    private Double baiduMapLat;
}
