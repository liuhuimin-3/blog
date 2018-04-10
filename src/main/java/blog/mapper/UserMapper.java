package blog.mapper;

import blog.dao.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


public interface UserMapper {
    void insert(User user);
}
