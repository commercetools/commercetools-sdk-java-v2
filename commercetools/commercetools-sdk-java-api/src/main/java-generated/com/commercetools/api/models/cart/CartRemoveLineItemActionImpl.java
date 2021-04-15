
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
public final class CartRemoveLineItemActionImpl implements CartRemoveLineItemAction {

    private String action;

    private String lineItemId;

    private Long quantity;

    private com.commercetools.api.models.common.Money externalPrice;

    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove;

    @JsonCreator
    CartRemoveLineItemActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("externalPrice") final com.commercetools.api.models.common.Money externalPrice,
            @JsonProperty("externalTotalPrice") final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice,
            @JsonProperty("shippingDetailsToRemove") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove) {
        this.lineItemId = lineItemId;
        this.quantity = quantity;
        this.externalPrice = externalPrice;
        this.externalTotalPrice = externalTotalPrice;
        this.shippingDetailsToRemove = shippingDetailsToRemove;
        this.action = REMOVE_LINE_ITEM;
    }

    public CartRemoveLineItemActionImpl() {
        this.action = REMOVE_LINE_ITEM;
    }

    public String getAction() {
        return this.action;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public com.commercetools.api.models.common.Money getExternalPrice() {
        return this.externalPrice;
    }

    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice() {
        return this.externalTotalPrice;
    }

    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetailsToRemove() {
        return this.shippingDetailsToRemove;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setExternalPrice(final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
    }

    public void setExternalTotalPrice(
            final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.externalTotalPrice = externalTotalPrice;
    }

    public void setShippingDetailsToRemove(
            final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove) {
        this.shippingDetailsToRemove = shippingDetailsToRemove;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartRemoveLineItemActionImpl that = (CartRemoveLineItemActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(quantity, that.quantity)
                .append(externalPrice, that.externalPrice)
                .append(externalTotalPrice, that.externalTotalPrice)
                .append(shippingDetailsToRemove, that.shippingDetailsToRemove)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(lineItemId)
                .append(quantity)
                .append(externalPrice)
                .append(externalTotalPrice)
                .append(shippingDetailsToRemove)
                .toHashCode();
    }

}
