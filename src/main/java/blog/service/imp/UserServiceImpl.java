package blog.service.imp;

import blog.dao.User;
import blog.mapper.UserMapper;
import blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertSelective(User user) {
         userMapper.insert(user);
    }
}
