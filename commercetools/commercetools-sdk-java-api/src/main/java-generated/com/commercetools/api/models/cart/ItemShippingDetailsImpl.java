
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
public class ItemShippingDetailsImpl implements ItemShippingDetails, ModelBase {

    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets;

    private Boolean valid;

    @JsonCreator
    ItemShippingDetailsImpl(
            @JsonProperty("targets") final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets,
            @JsonProperty("valid") final Boolean valid) {
        this.targets = targets;
        this.valid = valid;
    }

    public ItemShippingDetailsImpl() {
    }

    /**
    *  <p>Used to map what sub-quantity should be shipped to which address.
    *  Duplicate address keys are not allowed.</p>
    */
    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargets() {
        return this.targets;
    }

    /**
    *  <p><code>true</code> if the quantity of the (custom) line item is equal to the sum of the sub-quantities in <code>targets</code>, <code>false</code> otherwise.
    *  A cart cannot be ordered when the value is <code>false</code>.
    *  The error InvalidItemShippingDetails will be triggered.</p>
    */
    public Boolean getValid() {
        return this.valid;
    }

    public void setTargets(final com.commercetools.api.models.cart.ItemShippingTarget... targets) {
        this.targets = new ArrayList<>(Arrays.asList(targets));
    }

    public void setTargets(final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets) {
        this.targets = targets;
    }

    public void setValid(final Boolean valid) {
        this.valid = valid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ItemShippingDetailsImpl that = (ItemShippingDetailsImpl) o;

        return new EqualsBuilder().append(targets, that.targets).append(valid, that.valid).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(targets).append(valid).toHashCode();
    }

}
