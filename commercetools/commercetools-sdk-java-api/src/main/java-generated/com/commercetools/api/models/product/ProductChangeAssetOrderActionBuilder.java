
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductChangeAssetOrderActionBuilder {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    @Nullable
    private Boolean staged;

    private java.util.List<String> assetOrder;

    public ProductChangeAssetOrderActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public ProductChangeAssetOrderActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductChangeAssetOrderActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public ProductChangeAssetOrderActionBuilder assetOrder(final String... assetOrder) {
        this.assetOrder = new ArrayList<>(Arrays.asList(assetOrder));
        return this;
    }

    public ProductChangeAssetOrderActionBuilder assetOrder(final java.util.List<String> assetOrder) {
        this.assetOrder = assetOrder;
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

    public java.util.List<String> getAssetOrder() {
        return this.assetOrder;
    }

    public ProductChangeAssetOrderAction build() {
        return new ProductChangeAssetOrderActionImpl(variantId, sku, staged, assetOrder);
    }

    public static ProductChangeAssetOrderActionBuilder of() {
        return new ProductChangeAssetOrderActionBuilder();
    }

    public static ProductChangeAssetOrderActionBuilder of(final ProductChangeAssetOrderAction template) {
        ProductChangeAssetOrderActionBuilder builder = new ProductChangeAssetOrderActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetOrder = template.getAssetOrder();
        return builder;
    }

}
