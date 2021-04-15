
package com.commercetools.api.models.shipping_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartClassificationTierBuilder {

    private String value;

    private com.commercetools.api.models.common.Money price;

    @Nullable
    private Boolean isMatching;

    public CartClassificationTierBuilder value(final String value) {
        this.value = value;
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
