
package com.commercetools.api.models.project;

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
public class ProjectChangeOrderSearchStatusActionImpl implements ProjectChangeOrderSearchStatusAction, ModelBase {

    private String action;

    private com.commercetools.api.models.project.OrderSearchStatus status;

    @JsonCreator
    ProjectChangeOrderSearchStatusActionImpl(
            @JsonProperty("status") final com.commercetools.api.models.project.OrderSearchStatus status) {
        this.status = status;
        this.action = CHANGE_ORDER_SEARCH_STATUS;
    }

    public ProjectChangeOrderSearchStatusActionImpl() {
        this.action = CHANGE_ORDER_SEARCH_STATUS;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>Activates or deactivates the <a href="/../api/projects/order-search">Order Search</a> feature. Activation will trigger building a search index for the Orders in the Project.</p>
    */
    public com.commercetools.api.models.project.OrderSearchStatus getStatus() {
        return this.status;
    }

    public void setStatus(final com.commercetools.api.models.project.OrderSearchStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectChangeOrderSearchStatusActionImpl that = (ProjectChangeOrderSearchStatusActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(status, that.status).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(status).toHashCode();
    }

}
