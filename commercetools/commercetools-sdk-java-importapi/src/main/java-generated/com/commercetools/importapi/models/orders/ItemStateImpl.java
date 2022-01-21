
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

/**
*  <p>The item's state.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ItemStateImpl implements ItemState, ModelBase {

    private Double quantity;

    private com.commercetools.importapi.models.common.StateKeyReference state;

    @JsonCreator
    ItemStateImpl(@JsonProperty("quantity") final Double quantity,
            @JsonProperty("state") final com.commercetools.importapi.models.common.StateKeyReference state) {
        this.quantity = quantity;
        this.state = state;
    }

    public ItemStateImpl() {
    }

    public Double getQuantity() {
        return this.quantity;
    }

    /**
    *  <p>Maps to <code>ItemState.state</code>.</p>
    */
    public com.commercetools.importapi.models.common.StateKeyReference getState() {
        return this.state;
    }

    public void setQuantity(final Double quantity) {
        this.quantity = quantity;
    }

    public void setState(final com.commercetools.importapi.models.common.StateKeyReference state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ItemStateImpl that = (ItemStateImpl) o;

        return new EqualsBuilder().append(quantity, that.quantity).append(state, that.state).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(quantity).append(state).toHashCode();
    }

}
