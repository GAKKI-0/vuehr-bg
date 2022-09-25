package com.example.vuehr.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
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
@ApiModel(value = "Sysmsg对象", description = "")
public class Sysmsg implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("消息id")
    private Integer mid;

    @ApiModelProperty("0表示群发消息")
    private Integer type;

    @ApiModelProperty("这条消息是给谁的")
    private Integer hrid;

    @ApiModelProperty("0 未读 1 已读")
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
    public Integer getHrid() {
        return hrid;
    }

    public void setHrid(Integer hrid) {
        this.hrid = hrid;
    }
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Sysmsg{" +
            "id=" + id +
            ", mid=" + mid +
            ", type=" + type +
            ", hrid=" + hrid +
            ", state=" + state +
        "}";
    }
}
