
package com.commercetools.importapi.models.orders;

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
 * ItemShippingDetailsDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ItemShippingDetailsDraftImpl implements ItemShippingDetailsDraft, ModelBase {

    private java.util.List<com.commercetools.importapi.models.orders.ItemShippingTarget> targets;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ItemShippingDetailsDraftImpl(
            @JsonProperty("targets") final java.util.List<com.commercetools.importapi.models.orders.ItemShippingTarget> targets) {
        this.targets = targets;
    }

    /**
     * create empty instance
     */
    public ItemShippingDetailsDraftImpl() {
    }

    /**
     *  <p>Maps to <code>ItemShippingDetailsDraft.targets</code>.</p>
     */

    public java.util.List<com.commercetools.importapi.models.orders.ItemShippingTarget> getTargets() {
        return this.targets;
    }

    public void setTargets(final com.commercetools.importapi.models.orders.ItemShippingTarget... targets) {
        this.targets = new ArrayList<>(Arrays.asList(targets));
    }

    public void setTargets(final java.util.List<com.commercetools.importapi.models.orders.ItemShippingTarget> targets) {
        this.targets = targets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ItemShippingDetailsDraftImpl that = (ItemShippingDetailsDraftImpl) o;

        return new EqualsBuilder().append(targets, that.targets).append(targets, that.targets).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(targets).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("targets", targets).build();
    }

    @Override
    public ItemShippingDetailsDraft copyDeep() {
        return ItemShippingDetailsDraft.deepCopy(this);
    }
}
