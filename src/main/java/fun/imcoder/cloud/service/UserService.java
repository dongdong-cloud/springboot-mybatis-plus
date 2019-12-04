package fun.imcoder.cloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import fun.imcoder.cloud.model.User;

import java.util.List;

public interface UserService extends IService<User> {

    List<User> findAll();

}
