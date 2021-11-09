package com.ayerlans.akaablog.service.impl;

import com.ayerlans.akaablog.entity.Blog;
import com.ayerlans.akaablog.mapper.BlogMapper;
import com.ayerlans.akaablog.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
