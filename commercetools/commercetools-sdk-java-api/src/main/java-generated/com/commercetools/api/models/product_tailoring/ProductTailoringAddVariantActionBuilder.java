
package com.commercetools.api.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringAddVariantActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringAddVariantAction productTailoringAddVariantAction = ProductTailoringAddVariantAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringAddVariantActionBuilder implements Builder<ProductTailoringAddVariantAction> {

    @Nullable
    private Long id;

    @Nullable
    private String sku;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Image> images;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.AssetDraft> assets;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductTailoringAddVariantActionBuilder id(@Nullable final Long id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductTailoringAddVariantActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Images for the Product Variant Tailoring.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductTailoringAddVariantActionBuilder images(
            @Nullable final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images for the Product Variant Tailoring.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductTailoringAddVariantActionBuilder images(
            @Nullable final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>Images for the Product Variant Tailoring.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductTailoringAddVariantActionBuilder plusImages(
            @Nullable final com.commercetools.api.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images for the Product Variant Tailoring.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductTailoringAddVariantActionBuilder plusImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images for the Product Variant Tailoring.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductTailoringAddVariantActionBuilder withImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images for the Product Variant Tailoring.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductTailoringAddVariantActionBuilder addImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Images for the Product Variant Tailoring.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductTailoringAddVariantActionBuilder setImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Media assets for the Product Variant Tailoring.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductTailoringAddVariantActionBuilder assets(
            @Nullable final com.commercetools.api.models.common.AssetDraft... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media assets for the Product Variant Tailoring.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductTailoringAddVariantActionBuilder assets(
            @Nullable final java.util.List<com.commercetools.api.models.common.AssetDraft> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Media assets for the Product Variant Tailoring.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductTailoringAddVariantActionBuilder plusAssets(
            @Nullable final com.commercetools.api.models.common.AssetDraft... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media assets for the Product Variant Tailoring.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductTailoringAddVariantActionBuilder plusAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraftBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media assets for the Product Variant Tailoring.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductTailoringAddVariantActionBuilder withAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraftBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media assets for the Product Variant Tailoring.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductTailoringAddVariantActionBuilder addAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraft> builder) {
        return plusAssets(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()));
    }

    /**
     *  <p>Media assets for the Product Variant Tailoring.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductTailoringAddVariantActionBuilder setAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraft> builder) {
        return assets(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()));
    }

    /**
     *  <p>If <code>true</code> the new Product Variant Tailoring is only staged. If <code>false</code> the new Product Variant Tailoring is both current and staged.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringAddVariantActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @return id
     */

    @Nullable
    public Long getId() {
        return this.id;
    }

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Images for the Product Variant Tailoring.</p>
     * @return images
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Media assets for the Product Variant Tailoring.</p>
     * @return assets
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.AssetDraft> getAssets() {
        return this.assets;
    }

    /**
     *  <p>If <code>true</code> the new Product Variant Tailoring is only staged. If <code>false</code> the new Product Variant Tailoring is both current and staged.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductTailoringAddVariantAction with checking for non-null required values
     * @return ProductTailoringAddVariantAction
     */
    public ProductTailoringAddVariantAction build() {
        return new ProductTailoringAddVariantActionImpl(id, sku, images, assets, staged);
    }

    /**
     * builds ProductTailoringAddVariantAction without checking for non-null required values
     * @return ProductTailoringAddVariantAction
     */
    public ProductTailoringAddVariantAction buildUnchecked() {
        return new ProductTailoringAddVariantActionImpl(id, sku, images, assets, staged);
    }

    /**
     * factory method for an instance of ProductTailoringAddVariantActionBuilder
     * @return builder
     */
    public static ProductTailoringAddVariantActionBuilder of() {
        return new ProductTailoringAddVariantActionBuilder();
    }

    /**
     * create builder for ProductTailoringAddVariantAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringAddVariantActionBuilder of(final ProductTailoringAddVariantAction template) {
        ProductTailoringAddVariantActionBuilder builder = new ProductTailoringAddVariantActionBuilder();
        builder.id = template.getId();
        builder.sku = template.getSku();
        builder.images = template.getImages();
        builder.assets = template.getAssets();
        builder.staged = template.getStaged();
        return builder;
    }

}
