package com.ayerlans.akaablog.service.impl;

import com.ayerlans.akaablog.entity.User;
import com.ayerlans.akaablog.mapper.UserMapper;
import com.ayerlans.akaablog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Ayerlans
 * @since 2021-11-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
