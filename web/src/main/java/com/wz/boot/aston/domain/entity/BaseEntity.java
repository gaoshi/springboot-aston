package com.wz.boot.aston.domain.entity;


import lombok.Getter;
import lombok.Setter;

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
    @Setter
    @Getter
    protected long id;

    /**
     * created time
     */
    @Setter
    @Getter
    protected long created;
    /**
     * created time
     */
    @Setter
    @Getter
    protected long updated;

    /**
     * logic deleted,0:normal,1:deleted
     */
    @Setter
    @Getter
    protected int isDeleted;


}
