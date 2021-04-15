
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductLegacySetSkuActionBuilder {

    @Nullable
    private String sku;

    private Integer variantId;

    public ProductLegacySetSkuActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductLegacySetSkuActionBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    public Integer getVariantId() {
        return this.variantId;
    }

    public ProductLegacySetSkuAction build() {
        return new ProductLegacySetSkuActionImpl(sku, variantId);
    }

    public static ProductLegacySetSkuActionBuilder of() {
        return new ProductLegacySetSkuActionBuilder();
    }

    public static ProductLegacySetSkuActionBuilder of(final ProductLegacySetSkuAction template) {
        ProductLegacySetSkuActionBuilder builder = new ProductLegacySetSkuActionBuilder();
        builder.sku = template.getSku();
        builder.variantId = template.getVariantId();
        return builder;
    }

}
