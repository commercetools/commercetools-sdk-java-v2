
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>If the <code>editVersion</code> and/or <code>resourceVersion</code> do not match the actual version, a ConcurrentModification error will be returned.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditApplyImpl implements OrderEditApply, ModelBase {

    private Long editVersion;

    private Long resourceVersion;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderEditApplyImpl(@JsonProperty("editVersion") final Long editVersion,
            @JsonProperty("resourceVersion") final Long resourceVersion) {
        this.editVersion = editVersion;
        this.resourceVersion = resourceVersion;
    }

    /**
     * create empty instance
     */
    public OrderEditApplyImpl() {
    }

    /**
     *  <p>Current <code>version</code> of the OrderEdit to be applied.</p>
     */

    public Long getEditVersion() {
        return this.editVersion;
    }

    /**
     *  <p>Current <code>version</code> of the Order to which the OrderEdit is applied.</p>
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
                .append(editVersion, that.editVersion)
                .append(resourceVersion, that.resourceVersion)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(editVersion).append(resourceVersion).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("editVersion", editVersion)
                .append("resourceVersion", resourceVersion)
                .build();
    }

}
