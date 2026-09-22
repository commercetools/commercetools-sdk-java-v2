
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantImageAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantImageAddedMessagePayload variantImageAddedMessagePayload = VariantImageAddedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .image(imageBuilder -> imageBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantImageAddedMessagePayloadBuilder implements Builder<VariantImageAddedMessagePayload> {

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.common.Image image;

    private Boolean staged;

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantImageAddedMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantImageAddedMessagePayloadBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param product value to be set
     * @return Builder
     */

    public VariantImageAddedMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Image</a> that was added.</p>
     * @param builder function to build the image value
     * @return Builder
     */

    public VariantImageAddedMessagePayloadBuilder image(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.image = builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Image</a> that was added.</p>
     * @param builder function to build the image value
     * @return Builder
     */

    public VariantImageAddedMessagePayloadBuilder withImage(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        this.image = builder.apply(com.commercetools.api.models.common.ImageBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Image</a> that was added.</p>
     * @param image value to be set
     * @return Builder
     */

    public VariantImageAddedMessagePayloadBuilder image(final com.commercetools.api.models.common.Image image) {
        this.image = image;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged Variant.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantImageAddedMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Image</a> that was added.</p>
     * @return image
     */

    public com.commercetools.api.models.common.Image getImage() {
        return this.image;
    }

    /**
     *  <p>Whether the update was only applied to the staged Variant.</p>
     * @return staged
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds VariantImageAddedMessagePayload with checking for non-null required values
     * @return VariantImageAddedMessagePayload
     */
    public VariantImageAddedMessagePayload build() {
        Objects.requireNonNull(product, VariantImageAddedMessagePayload.class + ": product is missing");
        Objects.requireNonNull(image, VariantImageAddedMessagePayload.class + ": image is missing");
        Objects.requireNonNull(staged, VariantImageAddedMessagePayload.class + ": staged is missing");
        return new VariantImageAddedMessagePayloadImpl(product, image, staged);
    }

    /**
     * builds VariantImageAddedMessagePayload without checking for non-null required values
     * @return VariantImageAddedMessagePayload
     */
    public VariantImageAddedMessagePayload buildUnchecked() {
        return new VariantImageAddedMessagePayloadImpl(product, image, staged);
    }

    /**
     * factory method for an instance of VariantImageAddedMessagePayloadBuilder
     * @return builder
     */
    public static VariantImageAddedMessagePayloadBuilder of() {
        return new VariantImageAddedMessagePayloadBuilder();
    }

    /**
     * create builder for VariantImageAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantImageAddedMessagePayloadBuilder of(final VariantImageAddedMessagePayload template) {
        VariantImageAddedMessagePayloadBuilder builder = new VariantImageAddedMessagePayloadBuilder();
        builder.product = template.getProduct();
        builder.image = template.getImage();
        builder.staged = template.getStaged();
        return builder;
    }

}
