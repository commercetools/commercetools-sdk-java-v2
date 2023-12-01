
package com.commercetools.ml.models.image_search_config;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ChangeStatusUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeStatusUpdateActionImpl implements ChangeStatusUpdateAction, ModelBase {

    private String action;

    private com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeStatusUpdateActionImpl(
            @JsonProperty("status") final com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status) {
        this.status = status;
        this.action = CHANGE_STATUS;
    }

    /**
     * create empty instance
     */
    public ChangeStatusUpdateActionImpl() {
        this.action = CHANGE_STATUS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *
     */

    public com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus getStatus() {
        return this.status;
    }

    public void setStatus(final com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeStatusUpdateActionImpl that = (ChangeStatusUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(status, that.status)
                .append(action, that.action)
                .append(status, that.status)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(status).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("status", status)
                .build();
    }

}
