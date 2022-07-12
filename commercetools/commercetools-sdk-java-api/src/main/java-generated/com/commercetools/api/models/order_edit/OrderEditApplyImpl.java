
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * OrderEditApply
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditApplyImpl implements OrderEditApply, ModelBase {

    private Long editVersion;

    private Long resourceVersion;

    @JsonCreator
    OrderEditApplyImpl(@JsonProperty("editVersion") final Long editVersion,
            @JsonProperty("resourceVersion") final Long resourceVersion) {
        this.editVersion = editVersion;
        this.resourceVersion = resourceVersion;
    }

    public OrderEditApplyImpl() {
    }

    /**
     *
     */

    public Long getEditVersion() {
        return this.editVersion;
    }

    /**
     *
     */

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    public void setEditVersion(final Long editVersion) {
        this.editVersion = editVersion;
    }

    public void setResourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderEditApplyImpl that = (OrderEditApplyImpl) o;

        return new EqualsBuilder().append(editVersion, that.editVersion)
                .append(resourceVersion, that.resourceVersion)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(editVersion).append(resourceVersion).toHashCode();
    }

}
