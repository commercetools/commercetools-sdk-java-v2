
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeInfoBuilder {

    private com.commercetools.history.models.common.Reference discountCode;

    private com.commercetools.history.models.common.DiscountCodeState state;

    public DiscountCodeInfoBuilder discountCode(final com.commercetools.history.models.common.Reference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    public DiscountCodeInfoBuilder state(final com.commercetools.history.models.common.DiscountCodeState state) {
        this.state = state;
        return this;
    }

    public com.commercetools.history.models.common.Reference getDiscountCode() {
        return this.discountCode;
    }

    public com.commercetools.history.models.common.DiscountCodeState getState() {
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
