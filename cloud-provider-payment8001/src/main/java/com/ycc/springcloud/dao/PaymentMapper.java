package com.ycc.springcloud.dao;

import com.ycc.springcloud.bo.Payment;

import java.util.List;

public interface PaymentMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(Payment record);

    /**
     *
     * @mbggenerated
     */
    Payment selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    List<Payment> selectAll();

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Payment record);
}