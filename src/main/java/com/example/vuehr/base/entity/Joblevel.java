package com.example.vuehr.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
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
@ApiModel(value = "Joblevel对象", description = "")
public class Joblevel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("职称名称")
    private String name;

    private String titleLevel;

    private LocalDateTime createDate;

    private Boolean enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getTitleLevel() {
        return titleLevel;
    }

    public void setTitleLevel(String titleLevel) {
        this.titleLevel = titleLevel;
    }
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "Joblevel{" +
            "id=" + id +
            ", name=" + name +
            ", titleLevel=" + titleLevel +
            ", createDate=" + createDate +
            ", enabled=" + enabled +
        "}";
    }
}
