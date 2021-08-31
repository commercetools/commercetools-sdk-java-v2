
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeInfoBuilder implements Builder<DiscountCodeInfo> {

    private com.commercetools.importapi.models.common.DiscountCodeKeyReference discountCode;

    @Nullable
    private com.commercetools.importapi.models.orders.DiscountCodeState state;

    public DiscountCodeInfoBuilder discountCode(
            Function<com.commercetools.importapi.models.common.DiscountCodeKeyReferenceBuilder, com.commercetools.importapi.models.common.DiscountCodeKeyReferenceBuilder> builder) {
        this.discountCode = builder
                .apply(com.commercetools.importapi.models.common.DiscountCodeKeyReferenceBuilder.of())
                .build();
        return this;
    }

    public DiscountCodeInfoBuilder discountCode(
            final com.commercetools.importapi.models.common.DiscountCodeKeyReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    public DiscountCodeInfoBuilder state(
            @Nullable final com.commercetools.importapi.models.orders.DiscountCodeState state) {
        this.state = state;
        return this;
    }

    public com.commercetools.importapi.models.common.DiscountCodeKeyReference getDiscountCode() {
        return this.discountCode;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.DiscountCodeState getState() {
        return this.state;
    }

    public DiscountCodeInfo build() {
        Objects.requireNonNull(discountCode, DiscountCodeInfo.class + ": discountCode is missing");
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
