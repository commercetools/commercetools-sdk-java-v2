
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartClassificationTierBuilder implements Builder<CartClassificationTier> {

    private String value;

    private com.commercetools.api.models.common.Money price;

    @Nullable
    private Boolean isMatching;

    public CartClassificationTierBuilder value(final String value) {
        this.value = value;
        return this;
    }

    public CartClassificationTierBuilder price(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public CartClassificationTierBuilder price(final com.commercetools.api.models.common.Money price) {
        this.price = price;
        return this;
    }

    public CartClassificationTierBuilder isMatching(@Nullable final Boolean isMatching) {
        this.isMatching = isMatching;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    @Nullable
    public Boolean getIsMatching() {
        return this.isMatching;
    }

    public CartClassificationTier build() {
        Objects.requireNonNull(value, CartClassificationTier.class + ": value is missing");
        Objects.requireNonNull(price, CartClassificationTier.class + ": price is missing");
        return new CartClassificationTierImpl(value, price, isMatching);
    }

    /**
     * builds CartClassificationTier without checking for non null required values
     */
    public CartClassificationTier buildUnchecked() {
        return new CartClassificationTierImpl(value, price, isMatching);
    }

    public static CartClassificationTierBuilder of() {
        return new CartClassificationTierBuilder();
    }

    public static CartClassificationTierBuilder of(final CartClassificationTier template) {
        CartClassificationTierBuilder builder = new CartClassificationTierBuilder();
        builder.value = template.getValue();
        builder.price = template.getPrice();
        builder.isMatching = template.getIsMatching();
        return builder;
    }

}
