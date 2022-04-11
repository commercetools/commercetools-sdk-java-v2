
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSetAssetTagsActionBuilder implements Builder<ProductSetAssetTagsAction> {

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
    private java.util.List<String> tags;

    public ProductSetAssetTagsActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public ProductSetAssetTagsActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductSetAssetTagsActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public ProductSetAssetTagsActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    public ProductSetAssetTagsActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    public ProductSetAssetTagsActionBuilder tags(@Nullable final String... tags) {
        this.tags = new ArrayList<>(Arrays.asList(tags));
        return this;
    }

    public ProductSetAssetTagsActionBuilder tags(@Nullable final java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ProductSetAssetTagsActionBuilder plusTags(@Nullable final String... tags) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.addAll(Arrays.asList(tags));
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
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public ProductSetAssetTagsAction build() {
        return new ProductSetAssetTagsActionImpl(variantId, sku, staged, assetId, assetKey, tags);
    }

    /**
     * builds ProductSetAssetTagsAction without checking for non null required values
     */
    public ProductSetAssetTagsAction buildUnchecked() {
        return new ProductSetAssetTagsActionImpl(variantId, sku, staged, assetId, assetKey, tags);
    }

    public static ProductSetAssetTagsActionBuilder of() {
        return new ProductSetAssetTagsActionBuilder();
    }

    public static ProductSetAssetTagsActionBuilder of(final ProductSetAssetTagsAction template) {
        ProductSetAssetTagsActionBuilder builder = new ProductSetAssetTagsActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.tags = template.getTags();
        return builder;
    }

}
