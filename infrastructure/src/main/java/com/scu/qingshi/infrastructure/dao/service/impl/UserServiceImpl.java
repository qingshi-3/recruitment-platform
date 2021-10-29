package com.scu.qingshi.infrastructure.dao.service.impl;

import com.scu.qingshi.infrastructure.dao.po.User;
import com.scu.qingshi.infrastructure.dao.mapper.UserMapper;
import com.scu.qingshi.infrastructure.dao.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 青时
 * @since 2021-10-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
