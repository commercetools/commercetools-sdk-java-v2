
package com.commercetools.api.models.order;

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
public class OrderImportCustomLineItemStateActionImpl implements OrderImportCustomLineItemStateAction, ModelBase {

    private String action;

    private String customLineItemId;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    @JsonCreator
    OrderImportCustomLineItemStateActionImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("state") final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.customLineItemId = customLineItemId;
        this.state = state;
        this.action = IMPORT_CUSTOM_LINE_ITEM_STATE;
    }

    public OrderImportCustomLineItemStateActionImpl() {
        this.action = IMPORT_CUSTOM_LINE_ITEM_STATE;
    }

    public String getAction() {
        return this.action;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setState(final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
    }

    public void setState(final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderImportCustomLineItemStateActionImpl that = (OrderImportCustomLineItemStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(state, that.state)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customLineItemId).append(state).toHashCode();
    }

}
