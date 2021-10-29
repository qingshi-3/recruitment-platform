package com.scu.qingshi.infrastructure.dao.service.impl;

import com.scu.qingshi.infrastructure.dao.po.Email;
import com.scu.qingshi.infrastructure.dao.mapper.EmailMapper;
import com.scu.qingshi.infrastructure.dao.service.EmailService;
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
public class EmailServiceImpl extends ServiceImpl<EmailMapper, Email> implements EmailService {

}
