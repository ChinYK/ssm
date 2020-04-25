package com.hbjc.domain;

import java.io.Serializable;
import java.util.Date;

public class UcUsers implements Serializable {
    private Long id;

    private String user_name;

    private String user_account;

    private String user_password;

    private Byte is_admin;

    private Long parent_user_id;

    private Date gmt_create;

    private Date gmt_modify;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_account() {
        return user_account;
    }

    public void setUser_account(String user_account) {
        this.user_account = user_account;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Byte getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(Byte is_admin) {
        this.is_admin = is_admin;
    }

    public Long getParent_user_id() {
        return parent_user_id;
    }

    public void setParent_user_id(Long parent_user_id) {
        this.parent_user_id = parent_user_id;
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
        UcUsers other = (UcUsers) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_name() == null ? other.getUser_name() == null : this.getUser_name().equals(other.getUser_name()))
            && (this.getUser_account() == null ? other.getUser_account() == null : this.getUser_account().equals(other.getUser_account()))
            && (this.getUser_password() == null ? other.getUser_password() == null : this.getUser_password().equals(other.getUser_password()))
            && (this.getIs_admin() == null ? other.getIs_admin() == null : this.getIs_admin().equals(other.getIs_admin()))
            && (this.getParent_user_id() == null ? other.getParent_user_id() == null : this.getParent_user_id().equals(other.getParent_user_id()))
            && (this.getGmt_create() == null ? other.getGmt_create() == null : this.getGmt_create().equals(other.getGmt_create()))
            && (this.getGmt_modify() == null ? other.getGmt_modify() == null : this.getGmt_modify().equals(other.getGmt_modify()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_name() == null) ? 0 : getUser_name().hashCode());
        result = prime * result + ((getUser_account() == null) ? 0 : getUser_account().hashCode());
        result = prime * result + ((getUser_password() == null) ? 0 : getUser_password().hashCode());
        result = prime * result + ((getIs_admin() == null) ? 0 : getIs_admin().hashCode());
        result = prime * result + ((getParent_user_id() == null) ? 0 : getParent_user_id().hashCode());
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
        sb.append(", user_name=").append(user_name);
        sb.append(", user_account=").append(user_account);
        sb.append(", user_password=").append(user_password);
        sb.append(", is_admin=").append(is_admin);
        sb.append(", parent_user_id=").append(parent_user_id);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modify=").append(gmt_modify);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}