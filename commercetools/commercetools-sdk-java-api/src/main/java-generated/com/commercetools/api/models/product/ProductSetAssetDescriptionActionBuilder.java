
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetAssetDescriptionActionBuilder implements Builder<ProductSetAssetDescriptionAction> {

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

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    public ProductSetAssetDescriptionActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public ProductSetAssetDescriptionActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductSetAssetDescriptionActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public ProductSetAssetDescriptionActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    public ProductSetAssetDescriptionActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    public ProductSetAssetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductSetAssetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
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

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public ProductSetAssetDescriptionAction build() {
        return new ProductSetAssetDescriptionActionImpl(variantId, sku, staged, assetId, assetKey, description);
    }

    /**
     * builds ProductSetAssetDescriptionAction without checking for non null required values
     */
    public ProductSetAssetDescriptionAction buildUnchecked() {
        return new ProductSetAssetDescriptionActionImpl(variantId, sku, staged, assetId, assetKey, description);
    }

    public static ProductSetAssetDescriptionActionBuilder of() {
        return new ProductSetAssetDescriptionActionBuilder();
    }

    public static ProductSetAssetDescriptionActionBuilder of(final ProductSetAssetDescriptionAction template) {
        ProductSetAssetDescriptionActionBuilder builder = new ProductSetAssetDescriptionActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.description = template.getDescription();
        return builder;
    }

}
