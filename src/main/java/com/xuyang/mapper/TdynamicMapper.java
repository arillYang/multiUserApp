package com.xuyang.mapper;

import com.xuyang.model.Tdynamic;
import com.xuyang.model.TdynamicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdynamicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    long countByExample(TdynamicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    int deleteByExample(TdynamicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer dyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    int insert(Tdynamic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    int insertSelective(Tdynamic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    List<Tdynamic> selectByExampleWithBLOBs(TdynamicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    List<Tdynamic> selectByExample(TdynamicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    Tdynamic selectByPrimaryKey(Integer dyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Tdynamic record, @Param("example") TdynamicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") Tdynamic record, @Param("example") TdynamicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Tdynamic record, @Param("example") TdynamicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Tdynamic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Tdynamic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Tdynamic record);
}