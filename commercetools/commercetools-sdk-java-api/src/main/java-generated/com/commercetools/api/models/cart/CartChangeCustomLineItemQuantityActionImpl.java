
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartChangeCustomLineItemQuantityActionImpl implements CartChangeCustomLineItemQuantityAction {

    private String action;

    private String customLineItemId;

    private Long quantity;

    @JsonCreator
    CartChangeCustomLineItemQuantityActionImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("quantity") final Long quantity) {
        this.customLineItemId = customLineItemId;
        this.quantity = quantity;
        this.action = CHANGE_CUSTOM_LINE_ITEM_QUANTITY;
    }

    public CartChangeCustomLineItemQuantityActionImpl() {
        this.action = CHANGE_CUSTOM_LINE_ITEM_QUANTITY;
    }

    public String getAction() {
        return this.action;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartChangeCustomLineItemQuantityActionImpl that = (CartChangeCustomLineItemQuantityActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(customLineItemId, that.customLineItemId).append(
            quantity, that.quantity).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customLineItemId).append(quantity).toHashCode();
    }

}
