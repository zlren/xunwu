package lab.zlren.xunwu.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 房屋图片信息
 *
 * @author zlren
 * @since 2018-01-07
 */
@TableName("house_picture")
@Data
@Accessors(chain = true)
public class HousePicture implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 所属房屋id
     */
    @TableField("house_id")
    private Integer houseId;
    /**
     * 图片路径
     */
    @TableField("cdn_prefix")
    private String cdnPrefix;
    /**
     * 宽
     */
    private Integer width;
    /**
     * 高
     */
    private Integer height;
    /**
     * 所属房屋位置
     */
    private String location;
    /**
     * 文件名
     */
    private String path;
}
