package com.xuyang.mapper;

import com.xuyang.model.Tquotient;
import com.xuyang.model.TquotientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TquotientMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quotient
     *
     * @mbg.generated
     */
    long countByExample(TquotientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quotient
     *
     * @mbg.generated
     */
    int deleteByExample(TquotientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quotient
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer quotientId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quotient
     *
     * @mbg.generated
     */
    int insert(Tquotient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quotient
     *
     * @mbg.generated
     */
    int insertSelective(Tquotient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quotient
     *
     * @mbg.generated
     */
    List<Tquotient> selectByExampleWithBLOBs(TquotientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quotient
     *
     * @mbg.generated
     */
    List<Tquotient> selectByExample(TquotientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quotient
     *
     * @mbg.generated
     */
    Tquotient selectByPrimaryKey(Integer quotientId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quotient
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Tquotient record, @Param("example") TquotientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quotient
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") Tquotient record, @Param("example") TquotientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quotient
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Tquotient record, @Param("example") TquotientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quotient
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Tquotient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quotient
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Tquotient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quotient
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Tquotient record);
}