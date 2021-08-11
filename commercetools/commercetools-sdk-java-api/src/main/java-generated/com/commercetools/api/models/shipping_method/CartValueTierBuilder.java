
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartValueTierBuilder implements Builder<CartValueTier> {

    private Long minimumCentAmount;

    private com.commercetools.api.models.common.Money price;

    @Nullable
    private Boolean isMatching;

    public CartValueTierBuilder minimumCentAmount(final Long minimumCentAmount) {
        this.minimumCentAmount = minimumCentAmount;
        return this;
    }

    public CartValueTierBuilder price(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public CartValueTierBuilder price(final com.commercetools.api.models.common.Money price) {
        this.price = price;
        return this;
    }

    public CartValueTierBuilder isMatching(@Nullable final Boolean isMatching) {
        this.isMatching = isMatching;
        return this;
    }

    public Long getMinimumCentAmount() {
        return this.minimumCentAmount;
    }

    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    @Nullable
    public Boolean getIsMatching() {
        return this.isMatching;
    }

    public CartValueTier build() {
        Objects.requireNonNull(minimumCentAmount, CartValueTier.class + ": minimumCentAmount is missing");
        Objects.requireNonNull(price, CartValueTier.class + ": price is missing");
        return new CartValueTierImpl(minimumCentAmount, price, isMatching);
    }

    /**
     * builds CartValueTier without checking for non null required values
     */
    public CartValueTier buildUnchecked() {
        return new CartValueTierImpl(minimumCentAmount, price, isMatching);
    }

    public static CartValueTierBuilder of() {
        return new CartValueTierBuilder();
    }

    public static CartValueTierBuilder of(final CartValueTier template) {
        CartValueTierBuilder builder = new CartValueTierBuilder();
        builder.minimumCentAmount = template.getMinimumCentAmount();
        builder.price = template.getPrice();
        builder.isMatching = template.getIsMatching();
        return builder;
    }

}
