package com.example.vuehr.base.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author wildfire
 * @since 2022-09-25
 */
@TableName("mail_send_log")
@ApiModel(value = "MailSendLog对象", description = "")
public class MailSendLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private String msgId;

    private Integer empId;

    @ApiModelProperty("0发送中，1发送成功，2发送失败")
    private Integer status;

    private String routeKey;

    private String exchange;

    @ApiModelProperty("重试次数")
    private Integer count;

    @ApiModelProperty("第一次重试时间")
    private LocalDate tryTime;

    private LocalDate createTime;

    private LocalDate updateTime;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }
    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getRouteKey() {
        return routeKey;
    }

    public void setRouteKey(String routeKey) {
        this.routeKey = routeKey;
    }
    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    public LocalDate getTryTime() {
        return tryTime;
    }

    public void setTryTime(LocalDate tryTime) {
        this.tryTime = tryTime;
    }
    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }
    public LocalDate getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDate updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "MailSendLog{" +
            "msgId=" + msgId +
            ", empId=" + empId +
            ", status=" + status +
            ", routeKey=" + routeKey +
            ", exchange=" + exchange +
            ", count=" + count +
            ", tryTime=" + tryTime +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
