package com.ty.prop.scan.dao;

import org.springframework.stereotype.Repository;

import com.ty.prop.scan.domain.A;
@Repository
public interface AMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table a
     * @mbg.generated  Fri Jan 06 01:07:19 CST 2017
     */
    int insert(A record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table a
     * @mbg.generated  Fri Jan 06 01:07:19 CST 2017
     */
    int insertSelective(A record);
}