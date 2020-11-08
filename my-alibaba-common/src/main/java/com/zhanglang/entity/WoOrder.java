package com.zhanglang.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 工单
 * </p>
 *
 * @author zhanglang
 * @since 2020-11-02
 */
@TableName("wo_order")
public class WoOrder extends Model<WoOrder> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 主体ID
     */
    @TableField("tenant_id")
    private Long tenantId;

    /**
     * 工单编号
     */
    @TableField("order_no")
    private String orderNo;

    /**
     * 工单类型	1自查公区	2自查房间 3自查设施设备4客户公区5客户房间 6客户设施设备	7设施设备巡检 8设施设备维保 9品质巡查 10品质维护 11巡逻巡更	12设施设备告警 13监控告警	
     */
    @TableField("order_type")
    private Integer orderType;

    /**
     * 项目编码
     */
    @TableField("project_code")
    private String projectCode;

    /**
     * 所在项目
     */
    @TableField("project_name")
    private String projectName;

    /**
     * 位置ID
     */
    @TableField("address_id")
    private String addressId;

    /**
     * 所在位置
     */
    @TableField("address")
    private String address;

    /**
     * 原因大类
     */
    @TableField("big_category_name")
    private String bigCategoryName;

    /**
     * 原因大类Code
     */
    @TableField("big_category_code")
    private String bigCategoryCode;

    /**
     * 原因细类
     */
    @TableField("small_category_name")
    private String smallCategoryName;

    /**
     * 原因细类Code
     */
    @TableField("small_category_code")
    private String smallCategoryCode;

    /**
     * 问题标签
     */
    @TableField("problem_tags")
    private String problemTags;

    /**
     * 处理人
     */
    @TableField("handler_name")
    private String handlerName;

    /**
     * 处理人ID
     */
    @TableField("handler_id")
    private Long handlerId;

    /**
     * 工单描述
     */
    @TableField("remark")
    private String remark;

    /**
     * 工单状态 node_id
     */
    @TableField("order_status")
    private Long orderStatus;

    /**
     * 创建人
     */
    @TableField("create_name")
    private String createName;

    /**
     * 创建人ID
     */
    @TableField("create_by")
    private Long createBy;

    /**
     * 创建人电话
     */
    @TableField("create_phone")
    private String createPhone;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 工单性质	            0-常规	            1-投诉	            2-差评	            3-快速
     */
    @TableField("order_nature")
    private Integer orderNature;

    /**
     * 数据来源
     */
    @TableField("data_source")
    private String dataSource;

    /**
     * 是否返修
     */
    @TableField("isrepair")
    private Integer isrepair;

    /**
     * 关闭类型
     */
    @TableField("close_type")
    private String closeType;

    /**
     * 非正常关闭原因
     */
    @TableField("close_reason")
    private String closeReason;

    /**
     * 分派人
     */
    @TableField("assign_name")
    private String assignName;

    /**
     * 分派人ID
     */
    @TableField("assign_id")
    private Long assignId;

    /**
     * 标准分配时限(分钟)
     */
    @TableField("assign_limit")
    private Integer assignLimit;

    /**
     * 标准接单时限(分钟)
     */
    @TableField("order_limit")
    private Integer orderLimit;

    /**
     * 标准处理时限(分钟)
     */
    @TableField("process_limit")
    private Integer processLimit;

    /**
     * 分派时间
     */
    @TableField("assign_time")
    private LocalDateTime assignTime;

    /**
     * 抢单时间
     */
    @TableField("order_time")
    private LocalDateTime orderTime;

    /**
     * 处理时间
     */
    @TableField("process_time")
    private LocalDateTime processTime;

    /**
     * 完成时间
     */
    @TableField("completion_time")
    private LocalDateTime completionTime;

    /**
     * 评价时间
     */
    @TableField("evaluation_time")
    private LocalDateTime evaluationTime;

    /**
     * 评价结果
     */
    @TableField("evaluation_results")
    private String evaluationResults;

    /**
     * 评价内容
     */
    @TableField("evaluation_content")
    private String evaluationContent;

    /**
     * 最后更新人
     */
    @TableField("last_update_by")
    private Long lastUpdateBy;

    /**
     * 最后更新时间
     */
    @TableField("last_update_time")
    private LocalDateTime lastUpdateTime;

    /**
     * 是否删除
     */
    @TableField("deleted")
    private Integer deleted;

    /**
     * 流转配置ID
     */
    @TableField("template_id")
    private Long templateId;

    /**
     * 0-不抢单1-抢单
     */
    @TableField("isgrab")
    private Integer isgrab;

    /**
     * 模板节点编码
     */
    @TableField("template_node_code")
    private String templateNodeCode;

    /**
     * 关联工单编号
     */
    @TableField("relation_order_no")
    private String relationOrderNo;

    /**
     * 扣分
     */
    @TableField("deduct_point")
    private Long deductPoint;

    /**
     * 计划开始时间
     */
    @TableField("plan_start")
    private LocalDateTime planStart;

    /**
     * 计划结束时间
     */
    @TableField("plan_end")
    private LocalDateTime planEnd;

    /**
     * 实际开始时间
     */
    @TableField("actual_start")
    private LocalDateTime actualStart;

    /**
     * 实际结束时间
     */
    @TableField("actual_end")
    private LocalDateTime actualEnd;

    /**
     * 处理方式
     */
    @TableField("hander_type")
    private String handerType;

    /**
     * 是否顺序执行	1是0否
     */
    @TableField("in_order")
    private Integer inOrder;

    /**
     * 工单任务ID
     */
    @TableField("item_id")
    private Long itemId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }
    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getBigCategoryName() {
        return bigCategoryName;
    }

    public void setBigCategoryName(String bigCategoryName) {
        this.bigCategoryName = bigCategoryName;
    }
    public String getBigCategoryCode() {
        return bigCategoryCode;
    }

    public void setBigCategoryCode(String bigCategoryCode) {
        this.bigCategoryCode = bigCategoryCode;
    }
    public String getSmallCategoryName() {
        return smallCategoryName;
    }

    public void setSmallCategoryName(String smallCategoryName) {
        this.smallCategoryName = smallCategoryName;
    }
    public String getSmallCategoryCode() {
        return smallCategoryCode;
    }

    public void setSmallCategoryCode(String smallCategoryCode) {
        this.smallCategoryCode = smallCategoryCode;
    }
    public String getProblemTags() {
        return problemTags;
    }

    public void setProblemTags(String problemTags) {
        this.problemTags = problemTags;
    }
    public String getHandlerName() {
        return handlerName;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }
    public Long getHandlerId() {
        return handlerId;
    }

    public void setHandlerId(Long handlerId) {
        this.handlerId = handlerId;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Long getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Long orderStatus) {
        this.orderStatus = orderStatus;
    }
    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }
    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }
    public String getCreatePhone() {
        return createPhone;
    }

    public void setCreatePhone(String createPhone) {
        this.createPhone = createPhone;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public Integer getOrderNature() {
        return orderNature;
    }

    public void setOrderNature(Integer orderNature) {
        this.orderNature = orderNature;
    }
    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }
    public Integer getIsrepair() {
        return isrepair;
    }

    public void setIsrepair(Integer isrepair) {
        this.isrepair = isrepair;
    }
    public String getCloseType() {
        return closeType;
    }

    public void setCloseType(String closeType) {
        this.closeType = closeType;
    }
    public String getCloseReason() {
        return closeReason;
    }

    public void setCloseReason(String closeReason) {
        this.closeReason = closeReason;
    }
    public String getAssignName() {
        return assignName;
    }

    public void setAssignName(String assignName) {
        this.assignName = assignName;
    }
    public Long getAssignId() {
        return assignId;
    }

    public void setAssignId(Long assignId) {
        this.assignId = assignId;
    }
    public Integer getAssignLimit() {
        return assignLimit;
    }

    public void setAssignLimit(Integer assignLimit) {
        this.assignLimit = assignLimit;
    }
    public Integer getOrderLimit() {
        return orderLimit;
    }

    public void setOrderLimit(Integer orderLimit) {
        this.orderLimit = orderLimit;
    }
    public Integer getProcessLimit() {
        return processLimit;
    }

    public void setProcessLimit(Integer processLimit) {
        this.processLimit = processLimit;
    }
    public LocalDateTime getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(LocalDateTime assignTime) {
        this.assignTime = assignTime;
    }
    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }
    public LocalDateTime getProcessTime() {
        return processTime;
    }

    public void setProcessTime(LocalDateTime processTime) {
        this.processTime = processTime;
    }
    public LocalDateTime getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(LocalDateTime completionTime) {
        this.completionTime = completionTime;
    }
    public LocalDateTime getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(LocalDateTime evaluationTime) {
        this.evaluationTime = evaluationTime;
    }
    public String getEvaluationResults() {
        return evaluationResults;
    }

    public void setEvaluationResults(String evaluationResults) {
        this.evaluationResults = evaluationResults;
    }
    public String getEvaluationContent() {
        return evaluationContent;
    }

    public void setEvaluationContent(String evaluationContent) {
        this.evaluationContent = evaluationContent;
    }
    public Long getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(Long lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }
    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }
    public Integer getIsgrab() {
        return isgrab;
    }

    public void setIsgrab(Integer isgrab) {
        this.isgrab = isgrab;
    }
    public String getTemplateNodeCode() {
        return templateNodeCode;
    }

    public void setTemplateNodeCode(String templateNodeCode) {
        this.templateNodeCode = templateNodeCode;
    }
    public String getRelationOrderNo() {
        return relationOrderNo;
    }

    public void setRelationOrderNo(String relationOrderNo) {
        this.relationOrderNo = relationOrderNo;
    }
    public Long getDeductPoint() {
        return deductPoint;
    }

    public void setDeductPoint(Long deductPoint) {
        this.deductPoint = deductPoint;
    }
    public LocalDateTime getPlanStart() {
        return planStart;
    }

    public void setPlanStart(LocalDateTime planStart) {
        this.planStart = planStart;
    }
    public LocalDateTime getPlanEnd() {
        return planEnd;
    }

    public void setPlanEnd(LocalDateTime planEnd) {
        this.planEnd = planEnd;
    }
    public LocalDateTime getActualStart() {
        return actualStart;
    }

    public void setActualStart(LocalDateTime actualStart) {
        this.actualStart = actualStart;
    }
    public LocalDateTime getActualEnd() {
        return actualEnd;
    }

    public void setActualEnd(LocalDateTime actualEnd) {
        this.actualEnd = actualEnd;
    }
    public String getHanderType() {
        return handerType;
    }

    public void setHanderType(String handerType) {
        this.handerType = handerType;
    }
    public Integer getInOrder() {
        return inOrder;
    }

    public void setInOrder(Integer inOrder) {
        this.inOrder = inOrder;
    }
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "WoOrder{" +
            "id=" + id +
            ", tenantId=" + tenantId +
            ", orderNo=" + orderNo +
            ", orderType=" + orderType +
            ", projectCode=" + projectCode +
            ", projectName=" + projectName +
            ", addressId=" + addressId +
            ", address=" + address +
            ", bigCategoryName=" + bigCategoryName +
            ", bigCategoryCode=" + bigCategoryCode +
            ", smallCategoryName=" + smallCategoryName +
            ", smallCategoryCode=" + smallCategoryCode +
            ", problemTags=" + problemTags +
            ", handlerName=" + handlerName +
            ", handlerId=" + handlerId +
            ", remark=" + remark +
            ", orderStatus=" + orderStatus +
            ", createName=" + createName +
            ", createBy=" + createBy +
            ", createPhone=" + createPhone +
            ", createTime=" + createTime +
            ", orderNature=" + orderNature +
            ", dataSource=" + dataSource +
            ", isrepair=" + isrepair +
            ", closeType=" + closeType +
            ", closeReason=" + closeReason +
            ", assignName=" + assignName +
            ", assignId=" + assignId +
            ", assignLimit=" + assignLimit +
            ", orderLimit=" + orderLimit +
            ", processLimit=" + processLimit +
            ", assignTime=" + assignTime +
            ", orderTime=" + orderTime +
            ", processTime=" + processTime +
            ", completionTime=" + completionTime +
            ", evaluationTime=" + evaluationTime +
            ", evaluationResults=" + evaluationResults +
            ", evaluationContent=" + evaluationContent +
            ", lastUpdateBy=" + lastUpdateBy +
            ", lastUpdateTime=" + lastUpdateTime +
            ", deleted=" + deleted +
            ", templateId=" + templateId +
            ", isgrab=" + isgrab +
            ", templateNodeCode=" + templateNodeCode +
            ", relationOrderNo=" + relationOrderNo +
            ", deductPoint=" + deductPoint +
            ", planStart=" + planStart +
            ", planEnd=" + planEnd +
            ", actualStart=" + actualStart +
            ", actualEnd=" + actualEnd +
            ", handerType=" + handerType +
            ", inOrder=" + inOrder +
            ", itemId=" + itemId +
        "}";
    }
}
