package fun.imcoder.cloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.imcoder.cloud.mapper.UserMapper;
import fun.imcoder.cloud.model.User;
import fun.imcoder.cloud.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {

        // 这里查询所有用户，所以参数设置为 null
        return userMapper.selectList(null);
    }

}
