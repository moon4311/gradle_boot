package jm.cms.mapper;

import java.util.List;
import jm.cms.model.MbrType;
import jm.cms.model.MbrTypeExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MbrTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    long countByExample(MbrTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    int deleteByExample(MbrTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    int insert(MbrType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    int insertSelective(MbrType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    List<MbrType> selectByExample(MbrTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    int updateByExampleSelective(@Param("record") MbrType record, @Param("example") MbrTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    int updateByExample(@Param("record") MbrType record, @Param("example") MbrTypeExample example);
}