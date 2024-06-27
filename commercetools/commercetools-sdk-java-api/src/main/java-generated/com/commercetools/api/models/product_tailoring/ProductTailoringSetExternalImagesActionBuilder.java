
package com.commercetools.api.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringSetExternalImagesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetExternalImagesAction productTailoringSetExternalImagesAction = ProductTailoringSetExternalImagesAction.builder()
 *             .plusImages(imagesBuilder -> imagesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringSetExternalImagesActionBuilder
        implements Builder<ProductTailoringSetExternalImagesAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    private java.util.List<com.commercetools.api.models.common.Image> images;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductTailoringSetExternalImagesActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductTailoringSetExternalImagesActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Value to set to <code>images</code>.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductTailoringSetExternalImagesActionBuilder images(
            final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Value to set to <code>images</code>.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductTailoringSetExternalImagesActionBuilder images(
            final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>Value to set to <code>images</code>.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductTailoringSetExternalImagesActionBuilder plusImages(
            final com.commercetools.api.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Value to set to <code>images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductTailoringSetExternalImagesActionBuilder plusImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set to <code>images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductTailoringSetExternalImagesActionBuilder withImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set to <code>images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductTailoringSetExternalImagesActionBuilder addImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Value to set to <code>images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductTailoringSetExternalImagesActionBuilder setImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringSetExternalImagesActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @return variantId
     */

    @Nullable
    public Long getVariantId() {
        return this.variantId;
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
     *  <p>Value to set to <code>images</code>.</p>
     * @return images
     */

    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductTailoringSetExternalImagesAction with checking for non-null required values
     * @return ProductTailoringSetExternalImagesAction
     */
    public ProductTailoringSetExternalImagesAction build() {
        Objects.requireNonNull(images, ProductTailoringSetExternalImagesAction.class + ": images is missing");
        return new ProductTailoringSetExternalImagesActionImpl(variantId, sku, images, staged);
    }

    /**
     * builds ProductTailoringSetExternalImagesAction without checking for non-null required values
     * @return ProductTailoringSetExternalImagesAction
     */
    public ProductTailoringSetExternalImagesAction buildUnchecked() {
        return new ProductTailoringSetExternalImagesActionImpl(variantId, sku, images, staged);
    }

    /**
     * factory method for an instance of ProductTailoringSetExternalImagesActionBuilder
     * @return builder
     */
    public static ProductTailoringSetExternalImagesActionBuilder of() {
        return new ProductTailoringSetExternalImagesActionBuilder();
    }

    /**
     * create builder for ProductTailoringSetExternalImagesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetExternalImagesActionBuilder of(
            final ProductTailoringSetExternalImagesAction template) {
        ProductTailoringSetExternalImagesActionBuilder builder = new ProductTailoringSetExternalImagesActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.images = template.getImages();
        builder.staged = template.getStaged();
        return builder;
    }

}
