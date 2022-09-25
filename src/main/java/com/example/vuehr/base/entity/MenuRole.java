package com.example.vuehr.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;

/**
 * <p>
 * 
 * </p>
 *
 * @author wildfire
 * @since 2022-09-25
 */
@TableName("menu_role")
@ApiModel(value = "MenuRole对象", description = "")
public class MenuRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer mid;

    private Integer rid;

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
    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "MenuRole{" +
            "id=" + id +
            ", mid=" + mid +
            ", rid=" + rid +
        "}";
    }
}
