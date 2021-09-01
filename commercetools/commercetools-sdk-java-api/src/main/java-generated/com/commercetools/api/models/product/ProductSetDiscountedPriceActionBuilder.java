
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetDiscountedPriceActionBuilder implements Builder<ProductSetDiscountedPriceAction> {

    private String priceId;

    @Nullable
    private Boolean staged;

    @Nullable
    private com.commercetools.api.models.common.DiscountedPrice discounted;

    public ProductSetDiscountedPriceActionBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    public ProductSetDiscountedPriceActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public ProductSetDiscountedPriceActionBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    public ProductSetDiscountedPriceActionBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    public String getPriceId() {
        return this.priceId;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    @Nullable
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    public ProductSetDiscountedPriceAction build() {
        Objects.requireNonNull(priceId, ProductSetDiscountedPriceAction.class + ": priceId is missing");
        return new ProductSetDiscountedPriceActionImpl(priceId, staged, discounted);
    }

    /**
     * builds ProductSetDiscountedPriceAction without checking for non null required values
     */
    public ProductSetDiscountedPriceAction buildUnchecked() {
        return new ProductSetDiscountedPriceActionImpl(priceId, staged, discounted);
    }

    public static ProductSetDiscountedPriceActionBuilder of() {
        return new ProductSetDiscountedPriceActionBuilder();
    }

    public static ProductSetDiscountedPriceActionBuilder of(final ProductSetDiscountedPriceAction template) {
        ProductSetDiscountedPriceActionBuilder builder = new ProductSetDiscountedPriceActionBuilder();
        builder.priceId = template.getPriceId();
        builder.staged = template.getStaged();
        builder.discounted = template.getDiscounted();
        return builder;
    }

}
