package jm.cms.mapper;

import java.util.List;
import jm.cms.model.CMS_MENUINFO;
import jm.cms.model.CMS_MENUINFOExample;
import org.apache.ibatis.annotations.Param;

public interface CMS_MENUINFOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    long countByExample(CMS_MENUINFOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    int deleteByExample(CMS_MENUINFOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    int insert(CMS_MENUINFO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    int insertSelective(CMS_MENUINFO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    List<CMS_MENUINFO> selectByExample(CMS_MENUINFOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    int updateByExampleSelective(@Param("record") CMS_MENUINFO record, @Param("example") CMS_MENUINFOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     * @mbg.generated Fri Jun 05 23:25:09 KST 2020
     */
    int updateByExample(@Param("record") CMS_MENUINFO record, @Param("example") CMS_MENUINFOExample example);
}