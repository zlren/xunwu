package lab.zlren.xunwu.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import lab.zlren.xunwu.entity.User;
import lab.zlren.xunwu.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zlren
 * @date 2018-01-07
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService extends ServiceImpl<UserMapper, User> {

    public void testTx() {
        insert(new User().setPhoneNumber("111").setStatus(1));
        insert(new User());
    }
}
