package com.code59.caffemall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.code59.caffemall.bean.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends BaseMapper<Order> {
}
