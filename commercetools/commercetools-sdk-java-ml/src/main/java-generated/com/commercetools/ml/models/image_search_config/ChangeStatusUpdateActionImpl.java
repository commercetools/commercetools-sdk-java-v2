
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ChangeStatusUpdateActionImpl implements ChangeStatusUpdateAction, ModelBase {

    private String action;

    private com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status;

    @JsonCreator
    ChangeStatusUpdateActionImpl(
            @JsonProperty("status") final com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status) {
        this.status = status;
        this.action = CHANGE_STATUS;
    }

    public ChangeStatusUpdateActionImpl() {
        this.action = CHANGE_STATUS;
    }

    public String getAction() {
        return this.action;
    }

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

        return new EqualsBuilder().append(action, that.action).append(status, that.status).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(status).toHashCode();
    }

}
