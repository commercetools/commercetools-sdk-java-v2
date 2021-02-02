
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountedPriceBuilder {

    private com.commercetools.importapi.models.common.TypedMoney value;

    private com.commercetools.importapi.models.common.ProductDiscountKeyReference discount;

    public DiscountedPriceBuilder value(final com.commercetools.importapi.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    public DiscountedPriceBuilder discount(
            final com.commercetools.importapi.models.common.ProductDiscountKeyReference discount) {
        this.discount = discount;
        return this;
    }

    public com.commercetools.importapi.models.common.TypedMoney getValue() {
        return this.value;
    }

    public com.commercetools.importapi.models.common.ProductDiscountKeyReference getDiscount() {
        return this.discount;
    }

    public DiscountedPrice build() {
        return new DiscountedPriceImpl(value, discount);
    }

    public static DiscountedPriceBuilder of() {
        return new DiscountedPriceBuilder();
    }

    public static DiscountedPriceBuilder of(final DiscountedPrice template) {
        DiscountedPriceBuilder builder = new DiscountedPriceBuilder();
        builder.value = template.getValue();
        builder.discount = template.getDiscount();
        return builder;
    }

}
