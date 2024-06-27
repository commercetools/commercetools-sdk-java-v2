
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringImageAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringImageAddedMessagePayload productTailoringImageAddedMessagePayload = ProductTailoringImageAddedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .variantId(0.3)
 *             .image(imageBuilder -> imageBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringImageAddedMessagePayloadBuilder
        implements Builder<ProductTailoringImageAddedMessagePayload> {

    private com.commercetools.api.models.store.StoreKeyReference store;

    @Nullable
    private String productKey;

    private com.commercetools.api.models.product.ProductReference product;

    private Long variantId;

    private com.commercetools.api.models.common.Image image;

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductTailoringImageAddedMessagePayloadBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductTailoringImageAddedMessagePayloadBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param store value to be set
     * @return Builder
     */

    public ProductTailoringImageAddedMessagePayloadBuilder store(
            final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p><code>key</code> of the tailored Product.</p>
     * @param productKey value to be set
     * @return Builder
     */

    public ProductTailoringImageAddedMessagePayloadBuilder productKey(@Nullable final String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     *  <p>Reference to the tailored Product.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringImageAddedMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the tailored Product.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringImageAddedMessagePayloadBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the tailored Product.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductTailoringImageAddedMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p><code>id</code> of the tailored ProductVariant.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductTailoringImageAddedMessagePayloadBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Image that was added.</p>
     * @param builder function to build the image value
     * @return Builder
     */

    public ProductTailoringImageAddedMessagePayloadBuilder image(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.image = builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Image that was added.</p>
     * @param builder function to build the image value
     * @return Builder
     */

    public ProductTailoringImageAddedMessagePayloadBuilder withImage(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        this.image = builder.apply(com.commercetools.api.models.common.ImageBuilder.of());
        return this;
    }

    /**
     *  <p>Image that was added.</p>
     * @param image value to be set
     * @return Builder
     */

    public ProductTailoringImageAddedMessagePayloadBuilder image(
            final com.commercetools.api.models.common.Image image) {
        this.image = image;
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @return store
     */

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p><code>key</code> of the tailored Product.</p>
     * @return productKey
     */

    @Nullable
    public String getProductKey() {
        return this.productKey;
    }

    /**
     *  <p>Reference to the tailored Product.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p><code>id</code> of the tailored ProductVariant.</p>
     * @return variantId
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Image that was added.</p>
     * @return image
     */

    public com.commercetools.api.models.common.Image getImage() {
        return this.image;
    }

    /**
     * builds ProductTailoringImageAddedMessagePayload with checking for non-null required values
     * @return ProductTailoringImageAddedMessagePayload
     */
    public ProductTailoringImageAddedMessagePayload build() {
        Objects.requireNonNull(store, ProductTailoringImageAddedMessagePayload.class + ": store is missing");
        Objects.requireNonNull(product, ProductTailoringImageAddedMessagePayload.class + ": product is missing");
        Objects.requireNonNull(variantId, ProductTailoringImageAddedMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(image, ProductTailoringImageAddedMessagePayload.class + ": image is missing");
        return new ProductTailoringImageAddedMessagePayloadImpl(store, productKey, product, variantId, image);
    }

    /**
     * builds ProductTailoringImageAddedMessagePayload without checking for non-null required values
     * @return ProductTailoringImageAddedMessagePayload
     */
    public ProductTailoringImageAddedMessagePayload buildUnchecked() {
        return new ProductTailoringImageAddedMessagePayloadImpl(store, productKey, product, variantId, image);
    }

    /**
     * factory method for an instance of ProductTailoringImageAddedMessagePayloadBuilder
     * @return builder
     */
    public static ProductTailoringImageAddedMessagePayloadBuilder of() {
        return new ProductTailoringImageAddedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductTailoringImageAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringImageAddedMessagePayloadBuilder of(
            final ProductTailoringImageAddedMessagePayload template) {
        ProductTailoringImageAddedMessagePayloadBuilder builder = new ProductTailoringImageAddedMessagePayloadBuilder();
        builder.store = template.getStore();
        builder.productKey = template.getProductKey();
        builder.product = template.getProduct();
        builder.variantId = template.getVariantId();
        builder.image = template.getImage();
        return builder;
    }

}
