
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderDiscountCodeAddedMessagePayloadBuilder
        implements Builder<OrderDiscountCodeAddedMessagePayload> {

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    public OrderDiscountCodeAddedMessagePayloadBuilder discountCode(
            final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    public OrderDiscountCodeAddedMessagePayload build() {
        Objects.requireNonNull(discountCode);
        return new OrderDiscountCodeAddedMessagePayloadImpl(discountCode);
    }

    /**
     * builds OrderDiscountCodeAddedMessagePayload without checking for non null required values
     */
    public OrderDiscountCodeAddedMessagePayload buildUnchecked() {
        return new OrderDiscountCodeAddedMessagePayloadImpl(discountCode);
    }

    public static OrderDiscountCodeAddedMessagePayloadBuilder of() {
        return new OrderDiscountCodeAddedMessagePayloadBuilder();
    }

    public static OrderDiscountCodeAddedMessagePayloadBuilder of(final OrderDiscountCodeAddedMessagePayload template) {
        OrderDiscountCodeAddedMessagePayloadBuilder builder = new OrderDiscountCodeAddedMessagePayloadBuilder();
        builder.discountCode = template.getDiscountCode();
        return builder;
    }

}
