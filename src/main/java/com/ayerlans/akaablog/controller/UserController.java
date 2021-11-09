package com.ayerlans.akaablog.controller;


import com.ayerlans.akaablog.common.lang.Result;
import com.ayerlans.akaablog.entity.User;
import com.ayerlans.akaablog.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Ayerlans
 * @since 2021-11-08
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequiresAuthentication
    @GetMapping("/{id}")
    public Object test(@PathVariable("id") Long id) {
        User user=userService.getById(id);
        return Result.succ("获取到user数据",user);
    }
    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user){
        return Result.succ(user);
    }

}
