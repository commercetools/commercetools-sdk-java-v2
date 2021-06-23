
package com.commercetools.importapi.models.orders;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeInfoBuilder {

    private com.commercetools.importapi.models.common.DiscountCodeKeyReference discountCode;

    @Nullable
    private com.commercetools.importapi.models.orders.DiscountCodeState state;

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
