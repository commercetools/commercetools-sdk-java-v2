
package com.commercetools.api.models.discount_group;

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
 * DiscountGroupUpdate
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupUpdateImpl implements DiscountGroupUpdate, ModelBase {

    private Long version;

    private java.util.List<com.commercetools.api.models.discount_group.DiscountGroupUpdateAction> actions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountGroupUpdateImpl(@JsonProperty("version") final Long version,
            @JsonProperty("actions") final java.util.List<com.commercetools.api.models.discount_group.DiscountGroupUpdateAction> actions) {
        this.version = version;
        this.actions = actions;
    }

    /**
     * create empty instance
     */
    public DiscountGroupUpdateImpl() {
    }

    /**
     *  <p>Expected version of the DiscountGroup on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the DiscountGroup.</p>
     */

    public java.util.List<com.commercetools.api.models.discount_group.DiscountGroupUpdateAction> getActions() {
        return this.actions;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setActions(final com.commercetools.api.models.discount_group.DiscountGroupUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
    }

    public void setActions(
            final java.util.List<com.commercetools.api.models.discount_group.DiscountGroupUpdateAction> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountGroupUpdateImpl that = (DiscountGroupUpdateImpl) o;

        return new EqualsBuilder().append(version, that.version)
                .append(actions, that.actions)
                .append(version, that.version)
                .append(actions, that.actions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(actions).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("version", version)
                .append("actions", actions)
                .build();
    }

    @Override
    public DiscountGroupUpdate copyDeep() {
        return DiscountGroupUpdate.deepCopy(this);
    }
}
