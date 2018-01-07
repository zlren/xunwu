package lab.zlren.xunwu.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 房屋标签映射关系表
 *
 * @author zlren
 * @since 2018-01-07
 */
@TableName("house_tag")
@Data
@Accessors(chain = true)
public class HouseTag implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 房屋id
     */
    @TableField("house_id")
    private Integer houseId;
    /**
     * 标签id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
}
