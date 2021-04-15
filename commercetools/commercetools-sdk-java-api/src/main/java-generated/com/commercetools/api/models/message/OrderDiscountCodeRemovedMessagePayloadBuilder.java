
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderDiscountCodeRemovedMessagePayloadBuilder {

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    public OrderDiscountCodeRemovedMessagePayloadBuilder discountCode(
            final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    public OrderDiscountCodeRemovedMessagePayload build() {
        return new OrderDiscountCodeRemovedMessagePayloadImpl(discountCode);
    }

    public static OrderDiscountCodeRemovedMessagePayloadBuilder of() {
        return new OrderDiscountCodeRemovedMessagePayloadBuilder();
    }

    public static OrderDiscountCodeRemovedMessagePayloadBuilder of(
            final OrderDiscountCodeRemovedMessagePayload template) {
        OrderDiscountCodeRemovedMessagePayloadBuilder builder = new OrderDiscountCodeRemovedMessagePayloadBuilder();
        builder.discountCode = template.getDiscountCode();
        return builder;
    }

}
