
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductChangeAssetNameActionBuilder implements Builder<ProductChangeAssetNameAction> {

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

    private com.commercetools.api.models.common.LocalizedString name;

    public ProductChangeAssetNameActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public ProductChangeAssetNameActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductChangeAssetNameActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public ProductChangeAssetNameActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    public ProductChangeAssetNameActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    public ProductChangeAssetNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductChangeAssetNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
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

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public ProductChangeAssetNameAction build() {
        Objects.requireNonNull(name, ProductChangeAssetNameAction.class + ": name is missing");
        return new ProductChangeAssetNameActionImpl(variantId, sku, staged, assetId, assetKey, name);
    }

    /**
     * builds ProductChangeAssetNameAction without checking for non null required values
     */
    public ProductChangeAssetNameAction buildUnchecked() {
        return new ProductChangeAssetNameActionImpl(variantId, sku, staged, assetId, assetKey, name);
    }

    public static ProductChangeAssetNameActionBuilder of() {
        return new ProductChangeAssetNameActionBuilder();
    }

    public static ProductChangeAssetNameActionBuilder of(final ProductChangeAssetNameAction template) {
        ProductChangeAssetNameActionBuilder builder = new ProductChangeAssetNameActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.name = template.getName();
        return builder;
    }

}
