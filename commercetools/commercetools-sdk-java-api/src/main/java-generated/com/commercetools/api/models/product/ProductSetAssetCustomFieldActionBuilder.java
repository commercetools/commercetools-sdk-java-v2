
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetAssetCustomFieldActionBuilder {

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

    private String name;

    @Nullable
    private java.lang.Object value;

    public ProductSetAssetCustomFieldActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public ProductSetAssetCustomFieldActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductSetAssetCustomFieldActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public ProductSetAssetCustomFieldActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    public ProductSetAssetCustomFieldActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    public ProductSetAssetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ProductSetAssetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
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

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public ProductSetAssetCustomFieldAction build() {
        return new ProductSetAssetCustomFieldActionImpl(variantId, sku, staged, assetId, assetKey, name, value);
    }

    public static ProductSetAssetCustomFieldActionBuilder of() {
        return new ProductSetAssetCustomFieldActionBuilder();
    }

    public static ProductSetAssetCustomFieldActionBuilder of(final ProductSetAssetCustomFieldAction template) {
        ProductSetAssetCustomFieldActionBuilder builder = new ProductSetAssetCustomFieldActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
