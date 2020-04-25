package com.hbjc.domain;

import java.io.Serializable;
import java.util.Date;

public class UcLinkWxManager implements Serializable {
    private Long id;

    private Long link_wx_id;

    private String weixin;

    private Long weighting;

    private Long uv_num;

    private Long pv_num;

    private Byte is_online;

    private Date gmt_create;

    private Date gmt_modify;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLink_wx_id() {
        return link_wx_id;
    }

    public void setLink_wx_id(Long link_wx_id) {
        this.link_wx_id = link_wx_id;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public Long getWeighting() {
        return weighting;
    }

    public void setWeighting(Long weighting) {
        this.weighting = weighting;
    }

    public Long getUv_num() {
        return uv_num;
    }

    public void setUv_num(Long uv_num) {
        this.uv_num = uv_num;
    }

    public Long getPv_num() {
        return pv_num;
    }

    public void setPv_num(Long pv_num) {
        this.pv_num = pv_num;
    }

    public Byte getIs_online() {
        return is_online;
    }

    public void setIs_online(Byte is_online) {
        this.is_online = is_online;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_modify() {
        return gmt_modify;
    }

    public void setGmt_modify(Date gmt_modify) {
        this.gmt_modify = gmt_modify;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UcLinkWxManager other = (UcLinkWxManager) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLink_wx_id() == null ? other.getLink_wx_id() == null : this.getLink_wx_id().equals(other.getLink_wx_id()))
            && (this.getWeixin() == null ? other.getWeixin() == null : this.getWeixin().equals(other.getWeixin()))
            && (this.getWeighting() == null ? other.getWeighting() == null : this.getWeighting().equals(other.getWeighting()))
            && (this.getUv_num() == null ? other.getUv_num() == null : this.getUv_num().equals(other.getUv_num()))
            && (this.getPv_num() == null ? other.getPv_num() == null : this.getPv_num().equals(other.getPv_num()))
            && (this.getIs_online() == null ? other.getIs_online() == null : this.getIs_online().equals(other.getIs_online()))
            && (this.getGmt_create() == null ? other.getGmt_create() == null : this.getGmt_create().equals(other.getGmt_create()))
            && (this.getGmt_modify() == null ? other.getGmt_modify() == null : this.getGmt_modify().equals(other.getGmt_modify()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLink_wx_id() == null) ? 0 : getLink_wx_id().hashCode());
        result = prime * result + ((getWeixin() == null) ? 0 : getWeixin().hashCode());
        result = prime * result + ((getWeighting() == null) ? 0 : getWeighting().hashCode());
        result = prime * result + ((getUv_num() == null) ? 0 : getUv_num().hashCode());
        result = prime * result + ((getPv_num() == null) ? 0 : getPv_num().hashCode());
        result = prime * result + ((getIs_online() == null) ? 0 : getIs_online().hashCode());
        result = prime * result + ((getGmt_create() == null) ? 0 : getGmt_create().hashCode());
        result = prime * result + ((getGmt_modify() == null) ? 0 : getGmt_modify().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", link_wx_id=").append(link_wx_id);
        sb.append(", weixin=").append(weixin);
        sb.append(", weighting=").append(weighting);
        sb.append(", uv_num=").append(uv_num);
        sb.append(", pv_num=").append(pv_num);
        sb.append(", is_online=").append(is_online);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modify=").append(gmt_modify);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}