
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductAddVariantActionBuilder {

    @Nullable
    private String sku;

    @Nullable
    private String key;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.PriceDraft> prices;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Image> images;

    @Nullable
    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    @Nullable
    private Boolean staged;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Asset> assets;

    public ProductAddVariantActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductAddVariantActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ProductAddVariantActionBuilder prices(
            @Nullable final com.commercetools.api.models.common.PriceDraft... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }

    public ProductAddVariantActionBuilder prices(
            @Nullable final java.util.List<com.commercetools.api.models.common.PriceDraft> prices) {
        this.prices = prices;
        return this;
    }

    public ProductAddVariantActionBuilder images(@Nullable final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    public ProductAddVariantActionBuilder images(
            @Nullable final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    public ProductAddVariantActionBuilder attributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    public ProductAddVariantActionBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    public ProductAddVariantActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public ProductAddVariantActionBuilder assets(@Nullable final com.commercetools.api.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    public ProductAddVariantActionBuilder assets(
            @Nullable final java.util.List<com.commercetools.api.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.PriceDraft> getPrices() {
        return this.prices;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Asset> getAssets() {
        return this.assets;
    }

    public ProductAddVariantAction build() {
        return new ProductAddVariantActionImpl(sku, key, prices, images, attributes, staged, assets);
    }

    public static ProductAddVariantActionBuilder of() {
        return new ProductAddVariantActionBuilder();
    }

    public static ProductAddVariantActionBuilder of(final ProductAddVariantAction template) {
        ProductAddVariantActionBuilder builder = new ProductAddVariantActionBuilder();
        builder.sku = template.getSku();
        builder.key = template.getKey();
        builder.prices = template.getPrices();
        builder.images = template.getImages();
        builder.attributes = template.getAttributes();
        builder.staged = template.getStaged();
        builder.assets = template.getAssets();
        return builder;
    }

}
