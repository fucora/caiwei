package com.caiwei.sunny.mdm.permis.mapper;

import com.caiwei.sunny.mdm.permis.api.domain.PermisRoleDO;
import org.springframework.stereotype.Repository;

@Repository
public interface PermisRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     *
     * @author Administrator
     * @date 2017-11-06 14:52:56
     */
    int deleteByPrimaryKey(Integer trId);

    /**
     * This method was generated by MyBatis Generator.
     *
     * @author Administrator
     * @date 2017-11-06 14:52:56
     */
    int insert(PermisRoleDO record);

    /**
     * This method was generated by MyBatis Generator.
     *
     * @author Administrator
     * @date 2017-11-06 14:52:56
     */
    int insertSelective(PermisRoleDO record);

    /**
     * This method was generated by MyBatis Generator.
     *
     * @author Administrator
     * @date 2017-11-06 14:52:56
     */
    PermisRoleDO selectByPrimaryKey(Integer trId);

    /**
     * This method was generated by MyBatis Generator.
     *
     * @author Administrator
     * @date 2017-11-06 14:52:56
     */
    int updateByPrimaryKeySelective(PermisRoleDO record);

    /**
     * This method was generated by MyBatis Generator.
     *
     * @author Administrator
     * @date 2017-11-06 14:52:56
     */
    int updateByPrimaryKey(PermisRoleDO record);
}