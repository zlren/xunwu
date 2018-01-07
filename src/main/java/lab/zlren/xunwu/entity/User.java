package lab.zlren.xunwu.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户基本信息表
 *
 * @author zlren
 * @since 2018-01-07
 */
@Data
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户唯一id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 电话号码
     */
    @TableField("phone_number")
    private String phoneNumber;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户状态 0-正常 1-封禁
     */
    private Integer status;
    /**
     * 用户账号创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 上次登录时间
     */
    @TableField("last_login_time")
    private Date lastLoginTime;
    /**
     * 上次更新记录时间
     */
    @TableField("last_update_time")
    private Date lastUpdateTime;
    /**
     * 头像
     */
    private String avatar;
}
