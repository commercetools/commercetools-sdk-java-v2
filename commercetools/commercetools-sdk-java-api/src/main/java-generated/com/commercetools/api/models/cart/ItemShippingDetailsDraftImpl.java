
package com.commercetools.api.models.cart;

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
public class ItemShippingDetailsDraftImpl implements ItemShippingDetailsDraft, ModelBase {

    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets;

    @JsonCreator
    ItemShippingDetailsDraftImpl(
            @JsonProperty("targets") final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets) {
        this.targets = targets;
    }

    public ItemShippingDetailsDraftImpl() {
    }

    /**
    *  <p>Used to capture one or more (custom) line item specific shipping addresses.
    *  By specifying sub-quantities, it is possible to set multiple shipping addresses for one line item.
    *  A cart can have <code>shippingDetails</code> where the <code>targets</code> sum does not match the quantity of the line item or custom line item.
    *  For the order creation and order updates the <code>targets</code> sum must match the quantity.</p>
    */
    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargets() {
        return this.targets;
    }

    public void setTargets(final com.commercetools.api.models.cart.ItemShippingTarget... targets) {
        this.targets = new ArrayList<>(Arrays.asList(targets));
    }

    public void setTargets(final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets) {
        this.targets = targets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ItemShippingDetailsDraftImpl that = (ItemShippingDetailsDraftImpl) o;

        return new EqualsBuilder().append(targets, that.targets).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(targets).toHashCode();
    }

}
