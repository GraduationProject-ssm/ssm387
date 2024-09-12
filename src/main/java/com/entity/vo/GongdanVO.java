package com.entity.vo;

import com.entity.GongdanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 工单
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongdan")
public class GongdanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 申请人
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 工单编号
     */

    @TableField(value = "gongdan_danhao_number")
    private String gongdanDanhaoNumber;


    /**
     * 工单名称
     */

    @TableField(value = "gongdan_name")
    private String gongdanName;


    /**
     * 工单类型
     */

    @TableField(value = "gongdan_types")
    private Integer gongdanTypes;


    /**
     * 工单图片
     */

    @TableField(value = "gongdan_photo")
    private String gongdanPhoto;


    /**
     * 提交时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 工单详情
     */

    @TableField(value = "gongdan_content")
    private String gongdanContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：申请人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：申请人
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：工单编号
	 */
    public String getGongdanDanhaoNumber() {
        return gongdanDanhaoNumber;
    }


    /**
	 * 获取：工单编号
	 */

    public void setGongdanDanhaoNumber(String gongdanDanhaoNumber) {
        this.gongdanDanhaoNumber = gongdanDanhaoNumber;
    }
    /**
	 * 设置：工单名称
	 */
    public String getGongdanName() {
        return gongdanName;
    }


    /**
	 * 获取：工单名称
	 */

    public void setGongdanName(String gongdanName) {
        this.gongdanName = gongdanName;
    }
    /**
	 * 设置：工单类型
	 */
    public Integer getGongdanTypes() {
        return gongdanTypes;
    }


    /**
	 * 获取：工单类型
	 */

    public void setGongdanTypes(Integer gongdanTypes) {
        this.gongdanTypes = gongdanTypes;
    }
    /**
	 * 设置：工单图片
	 */
    public String getGongdanPhoto() {
        return gongdanPhoto;
    }


    /**
	 * 获取：工单图片
	 */

    public void setGongdanPhoto(String gongdanPhoto) {
        this.gongdanPhoto = gongdanPhoto;
    }
    /**
	 * 设置：提交时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：提交时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：工单详情
	 */
    public String getGongdanContent() {
        return gongdanContent;
    }


    /**
	 * 获取：工单详情
	 */

    public void setGongdanContent(String gongdanContent) {
        this.gongdanContent = gongdanContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
