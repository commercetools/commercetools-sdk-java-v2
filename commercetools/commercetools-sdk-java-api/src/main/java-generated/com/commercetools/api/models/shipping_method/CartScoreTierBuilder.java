
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartScoreTierBuilder implements Builder<CartScoreTier> {

    private Double score;

    @Nullable
    private com.commercetools.api.models.common.Money price;

    @Nullable
    private com.commercetools.api.models.shipping_method.PriceFunction priceFunction;

    @Nullable
    private Boolean isMatching;

    public CartScoreTierBuilder score(final Double score) {
        this.score = score;
        return this;
    }

    public CartScoreTierBuilder price(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public CartScoreTierBuilder price(@Nullable final com.commercetools.api.models.common.Money price) {
        this.price = price;
        return this;
    }

    public CartScoreTierBuilder priceFunction(
            Function<com.commercetools.api.models.shipping_method.PriceFunctionBuilder, com.commercetools.api.models.shipping_method.PriceFunctionBuilder> builder) {
        this.priceFunction = builder.apply(com.commercetools.api.models.shipping_method.PriceFunctionBuilder.of())
                .build();
        return this;
    }

    public CartScoreTierBuilder priceFunction(
            @Nullable final com.commercetools.api.models.shipping_method.PriceFunction priceFunction) {
        this.priceFunction = priceFunction;
        return this;
    }

    public CartScoreTierBuilder isMatching(@Nullable final Boolean isMatching) {
        this.isMatching = isMatching;
        return this;
    }

    public Double getScore() {
        return this.score;
    }

    @Nullable
    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    @Nullable
    public com.commercetools.api.models.shipping_method.PriceFunction getPriceFunction() {
        return this.priceFunction;
    }

    @Nullable
    public Boolean getIsMatching() {
        return this.isMatching;
    }

    public CartScoreTier build() {
        Objects.requireNonNull(score, CartScoreTier.class + ": score is missing");
        return new CartScoreTierImpl(score, price, priceFunction, isMatching);
    }

    /**
     * builds CartScoreTier without checking for non null required values
     */
    public CartScoreTier buildUnchecked() {
        return new CartScoreTierImpl(score, price, priceFunction, isMatching);
    }

    public static CartScoreTierBuilder of() {
        return new CartScoreTierBuilder();
    }

    public static CartScoreTierBuilder of(final CartScoreTier template) {
        CartScoreTierBuilder builder = new CartScoreTierBuilder();
        builder.score = template.getScore();
        builder.price = template.getPrice();
        builder.priceFunction = template.getPriceFunction();
        builder.isMatching = template.getIsMatching();
        return builder;
    }

}
