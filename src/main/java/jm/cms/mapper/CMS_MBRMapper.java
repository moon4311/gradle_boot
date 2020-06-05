package jm.cms.mapper;

import java.util.List;
import jm.cms.model.CMS_MBR;
import jm.cms.model.CMS_MBRExample;
import org.apache.ibatis.annotations.Param;

public interface CMS_MBRMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSMBR
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    long countByExample(CMS_MBRExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSMBR
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    int deleteByExample(CMS_MBRExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSMBR
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    int insert(CMS_MBR record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSMBR
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    int insertSelective(CMS_MBR record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSMBR
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    List<CMS_MBR> selectByExample(CMS_MBRExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSMBR
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    int updateByExampleSelective(@Param("record") CMS_MBR record, @Param("example") CMS_MBRExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSMBR
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    int updateByExample(@Param("record") CMS_MBR record, @Param("example") CMS_MBRExample example);
}