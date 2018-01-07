package lab.zlren.xunwu.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 地铁站
 *
 * @author zlren
 * @since 2018-01-07
 */
@TableName("subway_station")
@Data
@Accessors(chain = true)
public class SubwayStation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 所属地铁线id
     */
    @TableField("subway_id")
    private Integer subwayId;
    /**
     * 站点名称
     */
    private String name;
}
