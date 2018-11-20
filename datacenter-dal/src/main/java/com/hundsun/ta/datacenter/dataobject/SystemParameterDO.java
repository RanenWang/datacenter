package com.hundsun.ta.datacenter.dataobject;


import java.util.Date;
public class SystemParameterDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_parameter.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_parameter.class_name
     *
     * @mbggenerated
     */
    private String className;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_parameter.item
     *
     * @mbggenerated
     */
    private String item;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_parameter.param_value
     *
     * @mbggenerated
     */
    private String paramValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_parameter.user_modify
     *
     * @mbggenerated
     */
    private String userModify;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_parameter.param_describe
     *
     * @mbggenerated
     */
    private String paramDescribe;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_parameter.type
     *
     * @mbggenerated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_parameter.value_bound
     *
     * @mbggenerated
     */
    private String valueBound;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_parameter.show_class
     *
     * @mbggenerated
     */
    private String showClass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_parameter.show_sub_class
     *
     * @mbggenerated
     */
    private String showSubClass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_parameter.gmt_create
     *
     * @mbggenerated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_parameter.gmt_modified
     *
     * @mbggenerated
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_parameter.id
     *
     * @return the value of system_parameter.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_parameter.id
     *
     * @param id the value for system_parameter.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_parameter.class_name
     *
     * @return the value of system_parameter.class_name
     *
     * @mbggenerated
     */
    public String getClassName() {
        return className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_parameter.class_name
     *
     * @param className the value for system_parameter.class_name
     *
     * @mbggenerated
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_parameter.item
     *
     * @return the value of system_parameter.item
     *
     * @mbggenerated
     */
    public String getItem() {
        return item;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_parameter.item
     *
     * @param item the value for system_parameter.item
     *
     * @mbggenerated
     */
    public void setItem(String item) {
        this.item = item == null ? null : item.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_parameter.param_value
     *
     * @return the value of system_parameter.param_value
     *
     * @mbggenerated
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_parameter.param_value
     *
     * @param paramValue the value for system_parameter.param_value
     *
     * @mbggenerated
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_parameter.user_modify
     *
     * @return the value of system_parameter.user_modify
     *
     * @mbggenerated
     */
    public String getUserModify() {
        return userModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_parameter.user_modify
     *
     * @param userModify the value for system_parameter.user_modify
     *
     * @mbggenerated
     */
    public void setUserModify(String userModify) {
        this.userModify = userModify == null ? null : userModify.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_parameter.param_describe
     *
     * @return the value of system_parameter.param_describe
     *
     * @mbggenerated
     */
    public String getParamDescribe() {
        return paramDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_parameter.param_describe
     *
     * @param paramDescribe the value for system_parameter.param_describe
     *
     * @mbggenerated
     */
    public void setParamDescribe(String paramDescribe) {
        this.paramDescribe = paramDescribe == null ? null : paramDescribe.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_parameter.type
     *
     * @return the value of system_parameter.type
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_parameter.type
     *
     * @param type the value for system_parameter.type
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_parameter.value_bound
     *
     * @return the value of system_parameter.value_bound
     *
     * @mbggenerated
     */
    public String getValueBound() {
        return valueBound;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_parameter.value_bound
     *
     * @param valueBound the value for system_parameter.value_bound
     *
     * @mbggenerated
     */
    public void setValueBound(String valueBound) {
        this.valueBound = valueBound == null ? null : valueBound.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_parameter.show_class
     *
     * @return the value of system_parameter.show_class
     *
     * @mbggenerated
     */
    public String getShowClass() {
        return showClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_parameter.show_class
     *
     * @param showClass the value for system_parameter.show_class
     *
     * @mbggenerated
     */
    public void setShowClass(String showClass) {
        this.showClass = showClass == null ? null : showClass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_parameter.show_sub_class
     *
     * @return the value of system_parameter.show_sub_class
     *
     * @mbggenerated
     */
    public String getShowSubClass() {
        return showSubClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_parameter.show_sub_class
     *
     * @param showSubClass the value for system_parameter.show_sub_class
     *
     * @mbggenerated
     */
    public void setShowSubClass(String showSubClass) {
        this.showSubClass = showSubClass == null ? null : showSubClass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_parameter.gmt_create
     *
     * @return the value of system_parameter.gmt_create
     *
     * @mbggenerated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_parameter.gmt_create
     *
     * @param gmtCreate the value for system_parameter.gmt_create
     *
     * @mbggenerated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_parameter.gmt_modified
     *
     * @return the value of system_parameter.gmt_modified
     *
     * @mbggenerated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_parameter.gmt_modified
     *
     * @param gmtModified the value for system_parameter.gmt_modified
     *
     * @mbggenerated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}