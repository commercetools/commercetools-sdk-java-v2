
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDeletedMessagePayload productDeletedMessagePayload = ProductDeletedMessagePayload.builder()
 *             .plusRemovedImageUrls(removedImageUrlsBuilder -> removedImageUrlsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDeletedMessagePayloadBuilder implements Builder<ProductDeletedMessagePayload> {

    private java.util.List<String> removedImageUrls;

    @Nullable
    private com.commercetools.api.models.product.ProductProjection currentProjection;

    /**
     *  <p>List of image URLs that were removed during the Delete Product request.</p>
     * @param removedImageUrls value to be set
     * @return Builder
     */

    public ProductDeletedMessagePayloadBuilder removedImageUrls(final String... removedImageUrls) {
        this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
        return this;
    }

    /**
     *  <p>List of image URLs that were removed during the Delete Product request.</p>
     * @param removedImageUrls value to be set
     * @return Builder
     */

    public ProductDeletedMessagePayloadBuilder removedImageUrls(final java.util.List<String> removedImageUrls) {
        this.removedImageUrls = removedImageUrls;
        return this;
    }

    /**
     *  <p>List of image URLs that were removed during the Delete Product request.</p>
     * @param removedImageUrls value to be set
     * @return Builder
     */

    public ProductDeletedMessagePayloadBuilder plusRemovedImageUrls(final String... removedImageUrls) {
        if (this.removedImageUrls == null) {
            this.removedImageUrls = new ArrayList<>();
        }
        this.removedImageUrls.addAll(Arrays.asList(removedImageUrls));
        return this;
    }

    /**
     *  <p>Current Product Projection of the deleted Product.</p>
     * @param builder function to build the currentProjection value
     * @return Builder
     */

    public ProductDeletedMessagePayloadBuilder currentProjection(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        this.currentProjection = builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Current Product Projection of the deleted Product.</p>
     * @param builder function to build the currentProjection value
     * @return Builder
     */

    public ProductDeletedMessagePayloadBuilder withCurrentProjection(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjection> builder) {
        this.currentProjection = builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of());
        return this;
    }

    /**
     *  <p>Current Product Projection of the deleted Product.</p>
     * @param currentProjection value to be set
     * @return Builder
     */

    public ProductDeletedMessagePayloadBuilder currentProjection(
            @Nullable final com.commercetools.api.models.product.ProductProjection currentProjection) {
        this.currentProjection = currentProjection;
        return this;
    }

    /**
     *  <p>List of image URLs that were removed during the Delete Product request.</p>
     * @return removedImageUrls
     */

    public java.util.List<String> getRemovedImageUrls() {
        return this.removedImageUrls;
    }

    /**
     *  <p>Current Product Projection of the deleted Product.</p>
     * @return currentProjection
     */

    @Nullable
    public com.commercetools.api.models.product.ProductProjection getCurrentProjection() {
        return this.currentProjection;
    }

    /**
     * builds ProductDeletedMessagePayload with checking for non-null required values
     * @return ProductDeletedMessagePayload
     */
    public ProductDeletedMessagePayload build() {
        Objects.requireNonNull(removedImageUrls, ProductDeletedMessagePayload.class + ": removedImageUrls is missing");
        return new ProductDeletedMessagePayloadImpl(removedImageUrls, currentProjection);
    }

    /**
     * builds ProductDeletedMessagePayload without checking for non-null required values
     * @return ProductDeletedMessagePayload
     */
    public ProductDeletedMessagePayload buildUnchecked() {
        return new ProductDeletedMessagePayloadImpl(removedImageUrls, currentProjection);
    }

    /**
     * factory method for an instance of ProductDeletedMessagePayloadBuilder
     * @return builder
     */
    public static ProductDeletedMessagePayloadBuilder of() {
        return new ProductDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDeletedMessagePayloadBuilder of(final ProductDeletedMessagePayload template) {
        ProductDeletedMessagePayloadBuilder builder = new ProductDeletedMessagePayloadBuilder();
        builder.removedImageUrls = template.getRemovedImageUrls();
        builder.currentProjection = template.getCurrentProjection();
        return builder;
    }

}
