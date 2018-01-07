package lab.zlren.xunwu.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 地铁
 *
 * @author zlren
 * @since 2018-01-07
 */
@Data
@Accessors(chain = true)
public class Subway implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 线路名
     */
    private String name;
    /**
     * 所属城市英文名缩写
     */
    @TableField("city_en_name")
    private String cityEnName;
}
