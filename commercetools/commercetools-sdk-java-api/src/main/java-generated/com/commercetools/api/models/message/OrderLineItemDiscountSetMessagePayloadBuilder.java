
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderLineItemDiscountSetMessagePayloadBuilder {

    private String lineItemId;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    private com.commercetools.api.models.common.Money totalPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    public OrderLineItemDiscountSetMessagePayloadBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public OrderLineItemDiscountSetMessagePayloadBuilder discountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    public OrderLineItemDiscountSetMessagePayloadBuilder discountedPricePerQuantity(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        return this;
    }

    public OrderLineItemDiscountSetMessagePayloadBuilder totalPrice(
            final com.commercetools.api.models.common.Money totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public OrderLineItemDiscountSetMessagePayloadBuilder taxedPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    public com.commercetools.api.models.common.Money getTotalPrice() {
        return this.totalPrice;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    public OrderLineItemDiscountSetMessagePayload build() {
        return new OrderLineItemDiscountSetMessagePayloadImpl(lineItemId, discountedPricePerQuantity, totalPrice,
            taxedPrice);
    }

    public static OrderLineItemDiscountSetMessagePayloadBuilder of() {
        return new OrderLineItemDiscountSetMessagePayloadBuilder();
    }

    public static OrderLineItemDiscountSetMessagePayloadBuilder of(
            final OrderLineItemDiscountSetMessagePayload template) {
        OrderLineItemDiscountSetMessagePayloadBuilder builder = new OrderLineItemDiscountSetMessagePayloadBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
        builder.totalPrice = template.getTotalPrice();
        builder.taxedPrice = template.getTaxedPrice();
        return builder;
    }

}
