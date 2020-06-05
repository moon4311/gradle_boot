package jm.cms.mapper;

import java.util.List;
import jm.cms.model.CMS_MENUTYPE;
import jm.cms.model.CMS_MENUTYPEExample;
import org.apache.ibatis.annotations.Param;

public interface CMS_MENUTYPEMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSADMENUTYPE
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    long countByExample(CMS_MENUTYPEExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSADMENUTYPE
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    int deleteByExample(CMS_MENUTYPEExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSADMENUTYPE
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    int insert(CMS_MENUTYPE record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSADMENUTYPE
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    int insertSelective(CMS_MENUTYPE record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSADMENUTYPE
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    List<CMS_MENUTYPE> selectByExample(CMS_MENUTYPEExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSADMENUTYPE
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    int updateByExampleSelective(@Param("record") CMS_MENUTYPE record, @Param("example") CMS_MENUTYPEExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSADMENUTYPE
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    int updateByExample(@Param("record") CMS_MENUTYPE record, @Param("example") CMS_MENUTYPEExample example);
}