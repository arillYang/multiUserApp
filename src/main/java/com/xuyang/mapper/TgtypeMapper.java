package com.xuyang.mapper;

import com.xuyang.model.Tgtype;
import com.xuyang.model.TgtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TgtypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    long countByExample(TgtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    int deleteByExample(TgtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer gtId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    int insert(Tgtype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    int insertSelective(Tgtype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    List<Tgtype> selectByExample(TgtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    Tgtype selectByPrimaryKey(Integer gtId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Tgtype record, @Param("example") TgtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Tgtype record, @Param("example") TgtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Tgtype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Tgtype record);
}