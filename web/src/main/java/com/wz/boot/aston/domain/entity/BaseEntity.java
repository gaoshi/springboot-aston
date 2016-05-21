package com.wz.boot.aston.domain.entity;


import java.io.Serializable;

/**
 * @author wenzeng
 * @since 1.0
 */
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -4301042412467158007L;

    /**
     * row id
     */
    protected Long id;

    /**
     * created time
     */
    protected long created;
    /**
     * created time
     */

    protected long updated;

    /**
     * logic deleted,0:normal,1:deleted
     */
    protected int isDeleted;

    protected String extra;

    public long getId() {
        return id;
    }

    public BaseEntity setId(long id) {
        this.id = id;
        return this;
    }

    public long getCreated() {
        return created;
    }

    public BaseEntity setCreated(long created) {
        this.created = created;
        return this;
    }

    public long getUpdated() {
        return updated;
    }

    public BaseEntity setUpdated(long updated) {
        this.updated = updated;
        return this;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public BaseEntity setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    public String getExtra() {
        return extra;
    }

    public BaseEntity setExtra(String extra) {
        this.extra = extra;
        return this;
    }
}
