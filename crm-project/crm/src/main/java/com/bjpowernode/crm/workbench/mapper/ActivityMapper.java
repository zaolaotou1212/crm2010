package com.bjpowernode.crm.workbench.mapper;

import com.bjpowernode.crm.workbench.domain.Activity;

import java.util.List;
import java.util.Map;

public interface ActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Thu Sep 22 14:43:03 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Thu Sep 22 14:43:03 CST 2022
     */
    int insert(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Thu Sep 22 14:43:03 CST 2022
     */
    int insertSelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Thu Sep 22 14:43:03 CST 2022
     */
    Activity selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Thu Sep 22 14:43:03 CST 2022
     */
    int updateByPrimaryKeySelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Thu Sep 22 14:43:03 CST 2022
     */
    int updateByPrimaryKey(Activity record);
    int insertActivity(Activity activity);
    List<Activity> selectActivityByConditionForPage(Map<String,Object> map);
    int selectCountOfActivityByCondition(Map<String,Object > map);
    int deleteActivityByIds(String[] ids);
    Activity selectActivityById(String id);
    int updateActivity(Activity activity);
    List<Activity> selectAllActivity();
    int insertActivityByList(List<Activity> activityList);
}