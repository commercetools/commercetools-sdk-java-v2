
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DiscountedPriceBuilder implements Builder<DiscountedPrice> {

    private com.commercetools.api.models.common.TypedMoney value;

    private com.commercetools.api.models.product_discount.ProductDiscountReference discount;

    public DiscountedPriceBuilder value(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    public DiscountedPriceBuilder value(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    public DiscountedPriceBuilder discount(
            Function<com.commercetools.api.models.product_discount.ProductDiscountReferenceBuilder, com.commercetools.api.models.product_discount.ProductDiscountReferenceBuilder> builder) {
        this.discount = builder
                .apply(com.commercetools.api.models.product_discount.ProductDiscountReferenceBuilder.of())
                .build();
        return this;
    }

    public DiscountedPriceBuilder discount(
            final com.commercetools.api.models.product_discount.ProductDiscountReference discount) {
        this.discount = discount;
        return this;
    }

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    public com.commercetools.api.models.product_discount.ProductDiscountReference getDiscount() {
        return this.discount;
    }

    public DiscountedPrice build() {
        Objects.requireNonNull(value, DiscountedPrice.class + ": value is missing");
        Objects.requireNonNull(discount, DiscountedPrice.class + ": discount is missing");
        return new DiscountedPriceImpl(value, discount);
    }

    /**
     * builds DiscountedPrice without checking for non null required values
     */
    public DiscountedPrice buildUnchecked() {
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
