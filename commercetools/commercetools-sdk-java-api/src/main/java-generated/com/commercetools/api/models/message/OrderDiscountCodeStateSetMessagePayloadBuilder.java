
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderDiscountCodeStateSetMessagePayloadBuilder
        implements Builder<OrderDiscountCodeStateSetMessagePayload> {

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    private com.commercetools.api.models.cart.DiscountCodeState state;

    @Nullable
    private com.commercetools.api.models.cart.DiscountCodeState oldState;

    public OrderDiscountCodeStateSetMessagePayloadBuilder discountCode(
            Function<com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder, com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder> builder) {
        this.discountCode = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of())
                .build();
        return this;
    }

    public OrderDiscountCodeStateSetMessagePayloadBuilder discountCode(
            final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    public OrderDiscountCodeStateSetMessagePayloadBuilder state(
            final com.commercetools.api.models.cart.DiscountCodeState state) {
        this.state = state;
        return this;
    }

    public OrderDiscountCodeStateSetMessagePayloadBuilder oldState(
            @Nullable final com.commercetools.api.models.cart.DiscountCodeState oldState) {
        this.oldState = oldState;
        return this;
    }

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    public com.commercetools.api.models.cart.DiscountCodeState getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.api.models.cart.DiscountCodeState getOldState() {
        return this.oldState;
    }

    public OrderDiscountCodeStateSetMessagePayload build() {
        Objects.requireNonNull(discountCode,
            OrderDiscountCodeStateSetMessagePayload.class + ": discountCode is missing");
        Objects.requireNonNull(state, OrderDiscountCodeStateSetMessagePayload.class + ": state is missing");
        return new OrderDiscountCodeStateSetMessagePayloadImpl(discountCode, state, oldState);
    }

    /**
     * builds OrderDiscountCodeStateSetMessagePayload without checking for non null required values
     */
    public OrderDiscountCodeStateSetMessagePayload buildUnchecked() {
        return new OrderDiscountCodeStateSetMessagePayloadImpl(discountCode, state, oldState);
    }

    public static OrderDiscountCodeStateSetMessagePayloadBuilder of() {
        return new OrderDiscountCodeStateSetMessagePayloadBuilder();
    }

    public static OrderDiscountCodeStateSetMessagePayloadBuilder of(
            final OrderDiscountCodeStateSetMessagePayload template) {
        OrderDiscountCodeStateSetMessagePayloadBuilder builder = new OrderDiscountCodeStateSetMessagePayloadBuilder();
        builder.discountCode = template.getDiscountCode();
        builder.state = template.getState();
        builder.oldState = template.getOldState();
        return builder;
    }

}
