package com.hbjc.domain;

import java.io.Serializable;
import java.util.Date;

public class UcLink implements Serializable {
    private Long id;

    private String link_name;

    private String link_url;

    private Long link_group_id;

    private String link_group_name;

    private Date gmt_create;

    private Date gmt_modify;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLink_name() {
        return link_name;
    }

    public void setLink_name(String link_name) {
        this.link_name = link_name;
    }

    public String getLink_url() {
        return link_url;
    }

    public void setLink_url(String link_url) {
        this.link_url = link_url;
    }

    public Long getLink_group_id() {
        return link_group_id;
    }

    public void setLink_group_id(Long link_group_id) {
        this.link_group_id = link_group_id;
    }

    public String getLink_group_name() {
        return link_group_name;
    }

    public void setLink_group_name(String link_group_name) {
        this.link_group_name = link_group_name;
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
        UcLink other = (UcLink) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLink_name() == null ? other.getLink_name() == null : this.getLink_name().equals(other.getLink_name()))
            && (this.getLink_url() == null ? other.getLink_url() == null : this.getLink_url().equals(other.getLink_url()))
            && (this.getLink_group_id() == null ? other.getLink_group_id() == null : this.getLink_group_id().equals(other.getLink_group_id()))
            && (this.getLink_group_name() == null ? other.getLink_group_name() == null : this.getLink_group_name().equals(other.getLink_group_name()))
            && (this.getGmt_create() == null ? other.getGmt_create() == null : this.getGmt_create().equals(other.getGmt_create()))
            && (this.getGmt_modify() == null ? other.getGmt_modify() == null : this.getGmt_modify().equals(other.getGmt_modify()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLink_name() == null) ? 0 : getLink_name().hashCode());
        result = prime * result + ((getLink_url() == null) ? 0 : getLink_url().hashCode());
        result = prime * result + ((getLink_group_id() == null) ? 0 : getLink_group_id().hashCode());
        result = prime * result + ((getLink_group_name() == null) ? 0 : getLink_group_name().hashCode());
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
        sb.append(", link_name=").append(link_name);
        sb.append(", link_url=").append(link_url);
        sb.append(", link_group_id=").append(link_group_id);
        sb.append(", link_group_name=").append(link_group_name);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modify=").append(gmt_modify);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}