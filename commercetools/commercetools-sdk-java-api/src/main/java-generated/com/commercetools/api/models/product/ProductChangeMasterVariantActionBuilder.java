
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductChangeMasterVariantActionBuilder {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    @Nullable
    private Boolean staged;

    public ProductChangeMasterVariantActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public ProductChangeMasterVariantActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductChangeMasterVariantActionBuilder staged(@Nullable final Boolean staged) {
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

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductChangeMasterVariantAction build() {
        return new ProductChangeMasterVariantActionImpl(variantId, sku, staged);
    }

    public static ProductChangeMasterVariantActionBuilder of() {
        return new ProductChangeMasterVariantActionBuilder();
    }

    public static ProductChangeMasterVariantActionBuilder of(final ProductChangeMasterVariantAction template) {
        ProductChangeMasterVariantActionBuilder builder = new ProductChangeMasterVariantActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        return builder;
    }

}
