package jm.cms.mapper;

import java.util.List;
import jm.cms.model.IpConfigInfo;
import jm.cms.model.IpConfigInfoExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IpConfigInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    long countByExample(IpConfigInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    int deleteByExample(IpConfigInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    int insert(IpConfigInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    int insertSelective(IpConfigInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    List<IpConfigInfo> selectByExample(IpConfigInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    int updateByExampleSelective(@Param("record") IpConfigInfo record, @Param("example") IpConfigInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    int updateByExample(@Param("record") IpConfigInfo record, @Param("example") IpConfigInfoExample example);
}