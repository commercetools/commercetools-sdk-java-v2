
package com.commercetools.api.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountedPriceBuilder {

    private com.commercetools.api.models.common.Money value;

    private com.commercetools.api.models.product_discount.ProductDiscountReference discount;

    public DiscountedPriceBuilder value(final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    public DiscountedPriceBuilder discount(
            final com.commercetools.api.models.product_discount.ProductDiscountReference discount) {
        this.discount = discount;
        return this;
    }

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    public com.commercetools.api.models.product_discount.ProductDiscountReference getDiscount() {
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
