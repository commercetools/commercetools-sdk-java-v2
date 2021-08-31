
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductRemoveAssetActionBuilder implements Builder<ProductRemoveAssetAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    @Nullable
    private Boolean staged;

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    public ProductRemoveAssetActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public ProductRemoveAssetActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductRemoveAssetActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public ProductRemoveAssetActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    public ProductRemoveAssetActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
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

    @Nullable
    public String getAssetId() {
        return this.assetId;
    }

    @Nullable
    public String getAssetKey() {
        return this.assetKey;
    }

    public ProductRemoveAssetAction build() {
        return new ProductRemoveAssetActionImpl(variantId, sku, staged, assetId, assetKey);
    }

    /**
     * builds ProductRemoveAssetAction without checking for non null required values
     */
    public ProductRemoveAssetAction buildUnchecked() {
        return new ProductRemoveAssetActionImpl(variantId, sku, staged, assetId, assetKey);
    }

    public static ProductRemoveAssetActionBuilder of() {
        return new ProductRemoveAssetActionBuilder();
    }

    public static ProductRemoveAssetActionBuilder of(final ProductRemoveAssetAction template) {
        ProductRemoveAssetActionBuilder builder = new ProductRemoveAssetActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        return builder;
    }

}
