
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ProjectChangeProductSearchStatusAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeProductSearchStatusActionImpl implements ProjectChangeProductSearchStatusAction, ModelBase {

    private String action;

    private com.commercetools.api.models.project.ProductSearchStatus status;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectChangeProductSearchStatusActionImpl(
            @JsonProperty("status") final com.commercetools.api.models.project.ProductSearchStatus status) {
        this.status = status;
        this.action = CHANGE_PRODUCT_SEARCH_STATUS;
    }

    /**
     * create empty instance
     */
    public ProjectChangeProductSearchStatusActionImpl() {
        this.action = CHANGE_PRODUCT_SEARCH_STATUS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Activates or deactivates the Product Search feature. Activation will trigger building a search index for the Products in the Project.</p>
     */

    public com.commercetools.api.models.project.ProductSearchStatus getStatus() {
        return this.status;
    }

    public void setStatus(final com.commercetools.api.models.project.ProductSearchStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectChangeProductSearchStatusActionImpl that = (ProjectChangeProductSearchStatusActionImpl) o;

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
