
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DiscountCodeInfoBuilder implements Builder<DiscountCodeInfo> {

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    private com.commercetools.api.models.cart.DiscountCodeState state;

    public DiscountCodeInfoBuilder discountCode(
            Function<com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder, com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder> builder) {
        this.discountCode = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of())
                .build();
        return this;
    }

    public DiscountCodeInfoBuilder discountCode(
            final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    public DiscountCodeInfoBuilder state(final com.commercetools.api.models.cart.DiscountCodeState state) {
        this.state = state;
        return this;
    }

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    public com.commercetools.api.models.cart.DiscountCodeState getState() {
        return this.state;
    }

    public DiscountCodeInfo build() {
        Objects.requireNonNull(discountCode, DiscountCodeInfo.class + ": discountCode is missing");
        Objects.requireNonNull(state, DiscountCodeInfo.class + ": state is missing");
        return new DiscountCodeInfoImpl(discountCode, state);
    }

    /**
     * builds DiscountCodeInfo without checking for non null required values
     */
    public DiscountCodeInfo buildUnchecked() {
        return new DiscountCodeInfoImpl(discountCode, state);
    }

    public static DiscountCodeInfoBuilder of() {
        return new DiscountCodeInfoBuilder();
    }

    public static DiscountCodeInfoBuilder of(final DiscountCodeInfo template) {
        DiscountCodeInfoBuilder builder = new DiscountCodeInfoBuilder();
        builder.discountCode = template.getDiscountCode();
        builder.state = template.getState();
        return builder;
    }

}
