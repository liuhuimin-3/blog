package blog.controller;

import blog.dao.User;
import blog.dto.Result;
import blog.service.UserService;
import common.entity.ResultCode;
import common.exception.MyException;
import common.utils.MD5Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    private static Logger logger= LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value="/hello",method = RequestMethod.POST)
    public String getByController(){return "hello";}


    @ResponseBody
    @RequestMapping(value="/login",method = RequestMethod.POST)
    public Result loginByName(@RequestBody User user){
        if(user.getName()==null||user.getPassword()==null){
            return new Result(ResultCode.ParamException.getCode(),ResultCode.ParamException.getMessage(),null);
            //throw new MyException("密码不能为空");
        }
        user.setPassword(MD5Util.getMD5(user.getPassword().getBytes()));
        userService.insertSelective(user);
        return new Result();
    }
}
