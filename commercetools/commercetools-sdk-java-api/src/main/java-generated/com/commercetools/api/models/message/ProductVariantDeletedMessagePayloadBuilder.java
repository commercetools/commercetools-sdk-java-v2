
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantDeletedMessagePayload productVariantDeletedMessagePayload = ProductVariantDeletedMessagePayload.builder()
 *             .plusRemovedImageUrls(removedImageUrlsBuilder -> removedImageUrlsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantDeletedMessagePayloadBuilder implements Builder<ProductVariantDeletedMessagePayload> {

    @Nullable
    private com.commercetools.api.models.product.ProductVariant variant;

    private java.util.List<String> removedImageUrls;

    /**
     *  <p>Unique identifier of the Product Variant that was added.</p>
     * @return Builder
     */

    public ProductVariantDeletedMessagePayloadBuilder variant(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        this.variant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Unique identifier of the Product Variant that was added.</p>
     * @param variant
     * @return Builder
     */

    public ProductVariantDeletedMessagePayloadBuilder variant(
            @Nullable final com.commercetools.api.models.product.ProductVariant variant) {
        this.variant = variant;
        return this;
    }

    /**
     *  <p>List of image URLs that were removed with the Remove Product Variant update action.</p>
     * @param removedImageUrls
     * @return Builder
     */

    public ProductVariantDeletedMessagePayloadBuilder removedImageUrls(final String... removedImageUrls) {
        this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
        return this;
    }

    /**
     *  <p>List of image URLs that were removed with the Remove Product Variant update action.</p>
     * @param removedImageUrls
     * @return Builder
     */

    public ProductVariantDeletedMessagePayloadBuilder removedImageUrls(final java.util.List<String> removedImageUrls) {
        this.removedImageUrls = removedImageUrls;
        return this;
    }

    /**
     *  <p>List of image URLs that were removed with the Remove Product Variant update action.</p>
     * @param removedImageUrls
     * @return Builder
     */

    public ProductVariantDeletedMessagePayloadBuilder plusRemovedImageUrls(final String... removedImageUrls) {
        if (this.removedImageUrls == null) {
            this.removedImageUrls = new ArrayList<>();
        }
        this.removedImageUrls.addAll(Arrays.asList(removedImageUrls));
        return this;
    }

    @Nullable
    public com.commercetools.api.models.product.ProductVariant getVariant() {
        return this.variant;
    }

    public java.util.List<String> getRemovedImageUrls() {
        return this.removedImageUrls;
    }

    public ProductVariantDeletedMessagePayload build() {
        Objects.requireNonNull(removedImageUrls,
            ProductVariantDeletedMessagePayload.class + ": removedImageUrls is missing");
        return new ProductVariantDeletedMessagePayloadImpl(variant, removedImageUrls);
    }

    /**
     * builds ProductVariantDeletedMessagePayload without checking for non null required values
     */
    public ProductVariantDeletedMessagePayload buildUnchecked() {
        return new ProductVariantDeletedMessagePayloadImpl(variant, removedImageUrls);
    }

    public static ProductVariantDeletedMessagePayloadBuilder of() {
        return new ProductVariantDeletedMessagePayloadBuilder();
    }

    public static ProductVariantDeletedMessagePayloadBuilder of(final ProductVariantDeletedMessagePayload template) {
        ProductVariantDeletedMessagePayloadBuilder builder = new ProductVariantDeletedMessagePayloadBuilder();
        builder.variant = template.getVariant();
        builder.removedImageUrls = template.getRemovedImageUrls();
        return builder;
    }

}
