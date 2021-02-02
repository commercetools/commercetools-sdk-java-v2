
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantImportBuilder {

    private String key;

    @Nullable
    private String sku;

    private Boolean isMasterVariant;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.Image> images;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.Asset> assets;

    @Nullable
    private Boolean publish;

    private com.commercetools.importapi.models.common.ProductKeyReference product;

    public ProductVariantImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public ProductVariantImportBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductVariantImportBuilder isMasterVariant(final Boolean isMasterVariant) {
        this.isMasterVariant = isMasterVariant;
        return this;
    }

    public ProductVariantImportBuilder attributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    public ProductVariantImportBuilder attributes(
            @Nullable final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    public ProductVariantImportBuilder images(
            @Nullable final com.commercetools.importapi.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    public ProductVariantImportBuilder images(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Image> images) {
        this.images = images;
        return this;
    }

    public ProductVariantImportBuilder assets(
            @Nullable final com.commercetools.importapi.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    public ProductVariantImportBuilder assets(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    public ProductVariantImportBuilder publish(@Nullable final Boolean publish) {
        this.publish = publish;
        return this;
    }

    public ProductVariantImportBuilder product(
            final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    public Boolean getIsMasterVariant() {
        return this.isMasterVariant;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Image> getImages() {
        return this.images;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Asset> getAssets() {
        return this.assets;
    }

    @Nullable
    public Boolean getPublish() {
        return this.publish;
    }

    public com.commercetools.importapi.models.common.ProductKeyReference getProduct() {
        return this.product;
    }

    public ProductVariantImport build() {
        return new ProductVariantImportImpl(key, sku, isMasterVariant, attributes, images, assets, publish, product);
    }

    public static ProductVariantImportBuilder of() {
        return new ProductVariantImportBuilder();
    }

    public static ProductVariantImportBuilder of(final ProductVariantImport template) {
        ProductVariantImportBuilder builder = new ProductVariantImportBuilder();
        builder.key = template.getKey();
        builder.sku = template.getSku();
        builder.isMasterVariant = template.getIsMasterVariant();
        builder.attributes = template.getAttributes();
        builder.images = template.getImages();
        builder.assets = template.getAssets();
        builder.publish = template.getPublish();
        builder.product = template.getProduct();
        return builder;
    }

}
