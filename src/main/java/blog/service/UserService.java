package blog.service;

import blog.dao.User;
import org.springframework.stereotype.Service;


public interface UserService {
    void insertSelective(User user);

}
