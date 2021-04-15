
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductAddPriceActionBuilder {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    private com.commercetools.api.models.common.PriceDraft price;

    @Nullable
    private Boolean staged;

    public ProductAddPriceActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public ProductAddPriceActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductAddPriceActionBuilder price(final com.commercetools.api.models.common.PriceDraft price) {
        this.price = price;
        return this;
    }

    public ProductAddPriceActionBuilder staged(@Nullable final Boolean staged) {
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

    public com.commercetools.api.models.common.PriceDraft getPrice() {
        return this.price;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductAddPriceAction build() {
        return new ProductAddPriceActionImpl(variantId, sku, price, staged);
    }

    public static ProductAddPriceActionBuilder of() {
        return new ProductAddPriceActionBuilder();
    }

    public static ProductAddPriceActionBuilder of(final ProductAddPriceAction template) {
        ProductAddPriceActionBuilder builder = new ProductAddPriceActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.price = template.getPrice();
        builder.staged = template.getStaged();
        return builder;
    }

}
