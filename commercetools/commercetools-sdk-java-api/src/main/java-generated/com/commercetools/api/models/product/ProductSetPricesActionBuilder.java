
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetPricesActionBuilder {

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
