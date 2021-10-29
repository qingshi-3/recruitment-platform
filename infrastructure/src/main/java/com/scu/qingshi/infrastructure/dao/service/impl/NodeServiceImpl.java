package com.scu.qingshi.infrastructure.dao.service.impl;

import com.scu.qingshi.infrastructure.dao.po.Node;
import com.scu.qingshi.infrastructure.dao.mapper.NodeMapper;
import com.scu.qingshi.infrastructure.dao.service.NodeService;
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
public class NodeServiceImpl extends ServiceImpl<NodeMapper, Node> implements NodeService {

}
