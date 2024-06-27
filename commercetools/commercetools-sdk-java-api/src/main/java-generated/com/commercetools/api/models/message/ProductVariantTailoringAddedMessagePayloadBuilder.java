
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantTailoringAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantTailoringAddedMessagePayload productVariantTailoringAddedMessagePayload = ProductVariantTailoringAddedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .variantId(1)
 *             .variant(variantBuilder -> variantBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantTailoringAddedMessagePayloadBuilder
        implements Builder<ProductVariantTailoringAddedMessagePayload> {

    private com.commercetools.api.models.store.StoreKeyReference store;

    @Nullable
    private String productKey;

    private com.commercetools.api.models.product.ProductReference product;

    private Long variantId;

    private com.commercetools.api.models.product_tailoring.ProductVariantTailoring variant;

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductVariantTailoringAddedMessagePayloadBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductVariantTailoringAddedMessagePayloadBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param store value to be set
     * @return Builder
     */

    public ProductVariantTailoringAddedMessagePayloadBuilder store(
            final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p><code>key</code> of the tailored Product.</p>
     * @param productKey value to be set
     * @return Builder
     */

    public ProductVariantTailoringAddedMessagePayloadBuilder productKey(@Nullable final String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     *  <p>Reference to the tailored Product.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductVariantTailoringAddedMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the tailored Product.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductVariantTailoringAddedMessagePayloadBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the tailored Product.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductVariantTailoringAddedMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p><code>id</code> of the ProductVariant added to the Tailoring.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductVariantTailoringAddedMessagePayloadBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The ProductVariantTailoring that was added to the ProductTailoring.</p>
     * @param builder function to build the variant value
     * @return Builder
     */

    public ProductVariantTailoringAddedMessagePayloadBuilder variant(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder> builder) {
        this.variant = builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The ProductVariantTailoring that was added to the ProductTailoring.</p>
     * @param builder function to build the variant value
     * @return Builder
     */

    public ProductVariantTailoringAddedMessagePayloadBuilder withVariant(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoring> builder) {
        this.variant = builder
                .apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder.of());
        return this;
    }

    /**
     *  <p>The ProductVariantTailoring that was added to the ProductTailoring.</p>
     * @param variant value to be set
     * @return Builder
     */

    public ProductVariantTailoringAddedMessagePayloadBuilder variant(
            final com.commercetools.api.models.product_tailoring.ProductVariantTailoring variant) {
        this.variant = variant;
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
     *  <p><code>id</code> of the ProductVariant added to the Tailoring.</p>
     * @return variantId
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The ProductVariantTailoring that was added to the ProductTailoring.</p>
     * @return variant
     */

    public com.commercetools.api.models.product_tailoring.ProductVariantTailoring getVariant() {
        return this.variant;
    }

    /**
     * builds ProductVariantTailoringAddedMessagePayload with checking for non-null required values
     * @return ProductVariantTailoringAddedMessagePayload
     */
    public ProductVariantTailoringAddedMessagePayload build() {
        Objects.requireNonNull(store, ProductVariantTailoringAddedMessagePayload.class + ": store is missing");
        Objects.requireNonNull(product, ProductVariantTailoringAddedMessagePayload.class + ": product is missing");
        Objects.requireNonNull(variantId, ProductVariantTailoringAddedMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(variant, ProductVariantTailoringAddedMessagePayload.class + ": variant is missing");
        return new ProductVariantTailoringAddedMessagePayloadImpl(store, productKey, product, variantId, variant);
    }

    /**
     * builds ProductVariantTailoringAddedMessagePayload without checking for non-null required values
     * @return ProductVariantTailoringAddedMessagePayload
     */
    public ProductVariantTailoringAddedMessagePayload buildUnchecked() {
        return new ProductVariantTailoringAddedMessagePayloadImpl(store, productKey, product, variantId, variant);
    }

    /**
     * factory method for an instance of ProductVariantTailoringAddedMessagePayloadBuilder
     * @return builder
     */
    public static ProductVariantTailoringAddedMessagePayloadBuilder of() {
        return new ProductVariantTailoringAddedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductVariantTailoringAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantTailoringAddedMessagePayloadBuilder of(
            final ProductVariantTailoringAddedMessagePayload template) {
        ProductVariantTailoringAddedMessagePayloadBuilder builder = new ProductVariantTailoringAddedMessagePayloadBuilder();
        builder.store = template.getStore();
        builder.productKey = template.getProductKey();
        builder.product = template.getProduct();
        builder.variantId = template.getVariantId();
        builder.variant = template.getVariant();
        return builder;
    }

}
