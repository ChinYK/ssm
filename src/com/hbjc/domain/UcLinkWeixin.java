package com.hbjc.domain;

import java.io.Serializable;
import java.util.Date;

public class UcLinkWeixin implements Serializable {
    private Long id;

    private Long user_id;

    private String user_name;

    private Long group_id;

    private String group_name;

    private Long link_id;

    private String link_name;

    private String link_url;

    private Byte is_online;

    private Date online_time;

    private Date offline_time;

    private Long copy_num;

    private Date gmt_create;

    private Date gmt_modify;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Long getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Long group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public Long getLink_id() {
        return link_id;
    }

    public void setLink_id(Long link_id) {
        this.link_id = link_id;
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

    public Byte getIs_online() {
        return is_online;
    }

    public void setIs_online(Byte is_online) {
        this.is_online = is_online;
    }

    public Date getOnline_time() {
        return online_time;
    }

    public void setOnline_time(Date online_time) {
        this.online_time = online_time;
    }

    public Date getOffline_time() {
        return offline_time;
    }

    public void setOffline_time(Date offline_time) {
        this.offline_time = offline_time;
    }

    public Long getCopy_num() {
        return copy_num;
    }

    public void setCopy_num(Long copy_num) {
        this.copy_num = copy_num;
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
        UcLinkWeixin other = (UcLinkWeixin) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getUser_name() == null ? other.getUser_name() == null : this.getUser_name().equals(other.getUser_name()))
            && (this.getGroup_id() == null ? other.getGroup_id() == null : this.getGroup_id().equals(other.getGroup_id()))
            && (this.getGroup_name() == null ? other.getGroup_name() == null : this.getGroup_name().equals(other.getGroup_name()))
            && (this.getLink_id() == null ? other.getLink_id() == null : this.getLink_id().equals(other.getLink_id()))
            && (this.getLink_name() == null ? other.getLink_name() == null : this.getLink_name().equals(other.getLink_name()))
            && (this.getLink_url() == null ? other.getLink_url() == null : this.getLink_url().equals(other.getLink_url()))
            && (this.getIs_online() == null ? other.getIs_online() == null : this.getIs_online().equals(other.getIs_online()))
            && (this.getOnline_time() == null ? other.getOnline_time() == null : this.getOnline_time().equals(other.getOnline_time()))
            && (this.getOffline_time() == null ? other.getOffline_time() == null : this.getOffline_time().equals(other.getOffline_time()))
            && (this.getCopy_num() == null ? other.getCopy_num() == null : this.getCopy_num().equals(other.getCopy_num()))
            && (this.getGmt_create() == null ? other.getGmt_create() == null : this.getGmt_create().equals(other.getGmt_create()))
            && (this.getGmt_modify() == null ? other.getGmt_modify() == null : this.getGmt_modify().equals(other.getGmt_modify()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getUser_name() == null) ? 0 : getUser_name().hashCode());
        result = prime * result + ((getGroup_id() == null) ? 0 : getGroup_id().hashCode());
        result = prime * result + ((getGroup_name() == null) ? 0 : getGroup_name().hashCode());
        result = prime * result + ((getLink_id() == null) ? 0 : getLink_id().hashCode());
        result = prime * result + ((getLink_name() == null) ? 0 : getLink_name().hashCode());
        result = prime * result + ((getLink_url() == null) ? 0 : getLink_url().hashCode());
        result = prime * result + ((getIs_online() == null) ? 0 : getIs_online().hashCode());
        result = prime * result + ((getOnline_time() == null) ? 0 : getOnline_time().hashCode());
        result = prime * result + ((getOffline_time() == null) ? 0 : getOffline_time().hashCode());
        result = prime * result + ((getCopy_num() == null) ? 0 : getCopy_num().hashCode());
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
        sb.append(", user_id=").append(user_id);
        sb.append(", user_name=").append(user_name);
        sb.append(", group_id=").append(group_id);
        sb.append(", group_name=").append(group_name);
        sb.append(", link_id=").append(link_id);
        sb.append(", link_name=").append(link_name);
        sb.append(", link_url=").append(link_url);
        sb.append(", is_online=").append(is_online);
        sb.append(", online_time=").append(online_time);
        sb.append(", offline_time=").append(offline_time);
        sb.append(", copy_num=").append(copy_num);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modify=").append(gmt_modify);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}