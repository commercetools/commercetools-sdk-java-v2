
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetPricesActionBuilder implements Builder<ProductSetPricesAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    private java.util.List<com.commercetools.api.models.common.PriceDraft> prices;

    @Nullable
    private Boolean staged;

    public ProductSetPricesActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public ProductSetPricesActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductSetPricesActionBuilder prices(final com.commercetools.api.models.common.PriceDraft... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }

    public ProductSetPricesActionBuilder withPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        this.prices = new ArrayList<>();
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build());
        return this;
    }

    public ProductSetPricesActionBuilder plusPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build());
        return this;
    }

    public ProductSetPricesActionBuilder prices(
            final java.util.List<com.commercetools.api.models.common.PriceDraft> prices) {
        this.prices = prices;
        return this;
    }

    public ProductSetPricesActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    public java.util.List<com.commercetools.api.models.common.PriceDraft> getPrices() {
        return this.prices;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductSetPricesAction build() {
        Objects.requireNonNull(prices, ProductSetPricesAction.class + ": prices is missing");
        return new ProductSetPricesActionImpl(variantId, sku, prices, staged);
    }

    /**
     * builds ProductSetPricesAction without checking for non null required values
     */
    public ProductSetPricesAction buildUnchecked() {
        return new ProductSetPricesActionImpl(variantId, sku, prices, staged);
    }

    public static ProductSetPricesActionBuilder of() {
        return new ProductSetPricesActionBuilder();
    }

    public static ProductSetPricesActionBuilder of(final ProductSetPricesAction template) {
        ProductSetPricesActionBuilder builder = new ProductSetPricesActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.prices = template.getPrices();
        builder.staged = template.getStaged();
        return builder;
    }

}
