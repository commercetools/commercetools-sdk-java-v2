
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductImageAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductImageAddedMessagePayload productImageAddedMessagePayload = ProductImageAddedMessagePayload.builder()
 *             .variantId(0.3)
 *             .image(imageBuilder -> imageBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductImageAddedMessagePayloadBuilder implements Builder<ProductImageAddedMessagePayload> {

    private Long variantId;

    private com.commercetools.api.models.common.Image image;

    private Boolean staged;

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">Product Variant</a> to which the <a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Image</a> was added.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductImageAddedMessagePayloadBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Image</a> that was added.</p>
     * @param builder function to build the image value
     * @return Builder
     */

    public ProductImageAddedMessagePayloadBuilder image(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.image = builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Image</a> that was added.</p>
     * @param builder function to build the image value
     * @return Builder
     */

    public ProductImageAddedMessagePayloadBuilder withImage(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        this.image = builder.apply(com.commercetools.api.models.common.ImageBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Image</a> that was added.</p>
     * @param image value to be set
     * @return Builder
     */

    public ProductImageAddedMessagePayloadBuilder image(final com.commercetools.api.models.common.Image image) {
        this.image = image;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a>.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductImageAddedMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">Product Variant</a> to which the <a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Image</a> was added.</p>
     * @return variantId
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Image</a> that was added.</p>
     * @return image
     */

    public com.commercetools.api.models.common.Image getImage() {
        return this.image;
    }

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a>.</p>
     * @return staged
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductImageAddedMessagePayload with checking for non-null required values
     * @return ProductImageAddedMessagePayload
     */
    public ProductImageAddedMessagePayload build() {
        Objects.requireNonNull(variantId, ProductImageAddedMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(image, ProductImageAddedMessagePayload.class + ": image is missing");
        Objects.requireNonNull(staged, ProductImageAddedMessagePayload.class + ": staged is missing");
        return new ProductImageAddedMessagePayloadImpl(variantId, image, staged);
    }

    /**
     * builds ProductImageAddedMessagePayload without checking for non-null required values
     * @return ProductImageAddedMessagePayload
     */
    public ProductImageAddedMessagePayload buildUnchecked() {
        return new ProductImageAddedMessagePayloadImpl(variantId, image, staged);
    }

    /**
     * factory method for an instance of ProductImageAddedMessagePayloadBuilder
     * @return builder
     */
    public static ProductImageAddedMessagePayloadBuilder of() {
        return new ProductImageAddedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductImageAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductImageAddedMessagePayloadBuilder of(final ProductImageAddedMessagePayload template) {
        ProductImageAddedMessagePayloadBuilder builder = new ProductImageAddedMessagePayloadBuilder();
        builder.variantId = template.getVariantId();
        builder.image = template.getImage();
        builder.staged = template.getStaged();
        return builder;
    }

}
