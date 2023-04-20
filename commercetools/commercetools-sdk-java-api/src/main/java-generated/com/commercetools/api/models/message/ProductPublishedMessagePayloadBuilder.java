
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPublishedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPublishedMessagePayload productPublishedMessagePayload = ProductPublishedMessagePayload.builder()
 *             .plusRemovedImageUrls(removedImageUrlsBuilder -> removedImageUrlsBuilder)
 *             .productProjection(productProjectionBuilder -> productProjectionBuilder)
 *             .scope(ProductPublishScope.ALL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPublishedMessagePayloadBuilder implements Builder<ProductPublishedMessagePayload> {

    private java.util.List<String> removedImageUrls;

    private com.commercetools.api.models.product.ProductProjection productProjection;

    private com.commercetools.api.models.cart.ProductPublishScope scope;

    /**
     *  <p>List of image URLs which were removed during the Publish update action.</p>
     * @param removedImageUrls value to be set
     * @return Builder
     */

    public ProductPublishedMessagePayloadBuilder removedImageUrls(final String... removedImageUrls) {
        this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
        return this;
    }

    /**
     *  <p>List of image URLs which were removed during the Publish update action.</p>
     * @param removedImageUrls value to be set
     * @return Builder
     */

    public ProductPublishedMessagePayloadBuilder removedImageUrls(final java.util.List<String> removedImageUrls) {
        this.removedImageUrls = removedImageUrls;
        return this;
    }

    /**
     *  <p>List of image URLs which were removed during the Publish update action.</p>
     * @param removedImageUrls value to be set
     * @return Builder
     */

    public ProductPublishedMessagePayloadBuilder plusRemovedImageUrls(final String... removedImageUrls) {
        if (this.removedImageUrls == null) {
            this.removedImageUrls = new ArrayList<>();
        }
        this.removedImageUrls.addAll(Arrays.asList(removedImageUrls));
        return this;
    }

    /**
     *  <p>Current Product Projection of the Product at the time of creation.</p>
     * @param builder function to build the productProjection value
     * @return Builder
     */

    public ProductPublishedMessagePayloadBuilder productProjection(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        this.productProjection = builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Current Product Projection of the Product at the time of creation.</p>
     * @param builder function to build the productProjection value
     * @return Builder
     */

    public ProductPublishedMessagePayloadBuilder withProductProjection(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjection> builder) {
        this.productProjection = builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of());
        return this;
    }

    /**
     *  <p>Current Product Projection of the Product at the time of creation.</p>
     * @param productProjection value to be set
     * @return Builder
     */

    public ProductPublishedMessagePayloadBuilder productProjection(
            final com.commercetools.api.models.product.ProductProjection productProjection) {
        this.productProjection = productProjection;
        return this;
    }

    /**
     *  <p>Publishing Scope that was used during the Publish update action.</p>
     * @param scope value to be set
     * @return Builder
     */

    public ProductPublishedMessagePayloadBuilder scope(
            final com.commercetools.api.models.cart.ProductPublishScope scope) {
        this.scope = scope;
        return this;
    }

    /**
     *  <p>List of image URLs which were removed during the Publish update action.</p>
     * @return removedImageUrls
     */

    public java.util.List<String> getRemovedImageUrls() {
        return this.removedImageUrls;
    }

    /**
     *  <p>Current Product Projection of the Product at the time of creation.</p>
     * @return productProjection
     */

    public com.commercetools.api.models.product.ProductProjection getProductProjection() {
        return this.productProjection;
    }

    /**
     *  <p>Publishing Scope that was used during the Publish update action.</p>
     * @return scope
     */

    public com.commercetools.api.models.cart.ProductPublishScope getScope() {
        return this.scope;
    }

    /**
     * builds ProductPublishedMessagePayload with checking for non-null required values
     * @return ProductPublishedMessagePayload
     */
    public ProductPublishedMessagePayload build() {
        Objects.requireNonNull(removedImageUrls,
            ProductPublishedMessagePayload.class + ": removedImageUrls is missing");
        Objects.requireNonNull(productProjection,
            ProductPublishedMessagePayload.class + ": productProjection is missing");
        Objects.requireNonNull(scope, ProductPublishedMessagePayload.class + ": scope is missing");
        return new ProductPublishedMessagePayloadImpl(removedImageUrls, productProjection, scope);
    }

    /**
     * builds ProductPublishedMessagePayload without checking for non-null required values
     * @return ProductPublishedMessagePayload
     */
    public ProductPublishedMessagePayload buildUnchecked() {
        return new ProductPublishedMessagePayloadImpl(removedImageUrls, productProjection, scope);
    }

    /**
     * factory method for an instance of ProductPublishedMessagePayloadBuilder
     * @return builder
     */
    public static ProductPublishedMessagePayloadBuilder of() {
        return new ProductPublishedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductPublishedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPublishedMessagePayloadBuilder of(final ProductPublishedMessagePayload template) {
        ProductPublishedMessagePayloadBuilder builder = new ProductPublishedMessagePayloadBuilder();
        builder.removedImageUrls = template.getRemovedImageUrls();
        builder.productProjection = template.getProductProjection();
        builder.scope = template.getScope();
        return builder;
    }

}
