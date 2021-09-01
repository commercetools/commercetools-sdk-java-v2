
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductChangePriceActionBuilder implements Builder<ProductChangePriceAction> {

    private String priceId;

    private com.commercetools.api.models.common.PriceDraft price;

    @Nullable
    private Boolean staged;

    public ProductChangePriceActionBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    public ProductChangePriceActionBuilder price(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build();
        return this;
    }

    public ProductChangePriceActionBuilder price(final com.commercetools.api.models.common.PriceDraft price) {
        this.price = price;
        return this;
    }

    public ProductChangePriceActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public String getPriceId() {
        return this.priceId;
    }

    public com.commercetools.api.models.common.PriceDraft getPrice() {
        return this.price;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductChangePriceAction build() {
        Objects.requireNonNull(priceId, ProductChangePriceAction.class + ": priceId is missing");
        Objects.requireNonNull(price, ProductChangePriceAction.class + ": price is missing");
        return new ProductChangePriceActionImpl(priceId, price, staged);
    }

    /**
     * builds ProductChangePriceAction without checking for non null required values
     */
    public ProductChangePriceAction buildUnchecked() {
        return new ProductChangePriceActionImpl(priceId, price, staged);
    }

    public static ProductChangePriceActionBuilder of() {
        return new ProductChangePriceActionBuilder();
    }

    public static ProductChangePriceActionBuilder of(final ProductChangePriceAction template) {
        ProductChangePriceActionBuilder builder = new ProductChangePriceActionBuilder();
        builder.priceId = template.getPriceId();
        builder.price = template.getPrice();
        builder.staged = template.getStaged();
        return builder;
    }

}
