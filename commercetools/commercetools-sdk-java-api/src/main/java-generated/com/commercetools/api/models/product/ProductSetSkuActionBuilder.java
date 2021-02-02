
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetSkuActionBuilder {

    private Long variantId;

    @Nullable
    private String sku;

    @Nullable
    private Boolean staged;

    public ProductSetSkuActionBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public ProductSetSkuActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductSetSkuActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductSetSkuAction build() {
        return new ProductSetSkuActionImpl(variantId, sku, staged);
    }

    public static ProductSetSkuActionBuilder of() {
        return new ProductSetSkuActionBuilder();
    }

    public static ProductSetSkuActionBuilder of(final ProductSetSkuAction template) {
        ProductSetSkuActionBuilder builder = new ProductSetSkuActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        return builder;
    }

}
