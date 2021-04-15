
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductAddAssetActionBuilder {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    @Nullable
    private Boolean staged;

    private com.commercetools.api.models.common.AssetDraft asset;

    @Nullable
    private Integer position;

    public ProductAddAssetActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public ProductAddAssetActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductAddAssetActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public ProductAddAssetActionBuilder asset(final com.commercetools.api.models.common.AssetDraft asset) {
        this.asset = asset;
        return this;
    }

    public ProductAddAssetActionBuilder position(@Nullable final Integer position) {
        this.position = position;
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

    public com.commercetools.api.models.common.AssetDraft getAsset() {
        return this.asset;
    }

    @Nullable
    public Integer getPosition() {
        return this.position;
    }

    public ProductAddAssetAction build() {
        return new ProductAddAssetActionImpl(variantId, sku, staged, asset, position);
    }

    public static ProductAddAssetActionBuilder of() {
        return new ProductAddAssetActionBuilder();
    }

    public static ProductAddAssetActionBuilder of(final ProductAddAssetAction template) {
        ProductAddAssetActionBuilder builder = new ProductAddAssetActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.asset = template.getAsset();
        builder.position = template.getPosition();
        return builder;
    }

}
