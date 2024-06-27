
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantTailoringRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantTailoringRemovedMessagePayload productVariantTailoringRemovedMessagePayload = ProductVariantTailoringRemovedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .variantId(1)
 *             .variant(variantBuilder -> variantBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantTailoringRemovedMessagePayloadBuilder
        implements Builder<ProductVariantTailoringRemovedMessagePayload> {

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

    public ProductVariantTailoringRemovedMessagePayloadBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessagePayloadBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param store value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessagePayloadBuilder store(
            final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p><code>key</code> of the tailored Product.</p>
     * @param productKey value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessagePayloadBuilder productKey(@Nullable final String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessagePayloadBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p><code>id</code> of the ProductVariant removed from the Tailoring.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessagePayloadBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The ProductVariantTailoring that was removed from the ProductTailoring.</p>
     * @param builder function to build the variant value
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessagePayloadBuilder variant(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder> builder) {
        this.variant = builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The ProductVariantTailoring that was removed from the ProductTailoring.</p>
     * @param builder function to build the variant value
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessagePayloadBuilder withVariant(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoring> builder) {
        this.variant = builder
                .apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder.of());
        return this;
    }

    /**
     *  <p>The ProductVariantTailoring that was removed from the ProductTailoring.</p>
     * @param variant value to be set
     * @return Builder
     */

    public ProductVariantTailoringRemovedMessagePayloadBuilder variant(
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
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p><code>id</code> of the ProductVariant removed from the Tailoring.</p>
     * @return variantId
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The ProductVariantTailoring that was removed from the ProductTailoring.</p>
     * @return variant
     */

    public com.commercetools.api.models.product_tailoring.ProductVariantTailoring getVariant() {
        return this.variant;
    }

    /**
     * builds ProductVariantTailoringRemovedMessagePayload with checking for non-null required values
     * @return ProductVariantTailoringRemovedMessagePayload
     */
    public ProductVariantTailoringRemovedMessagePayload build() {
        Objects.requireNonNull(store, ProductVariantTailoringRemovedMessagePayload.class + ": store is missing");
        Objects.requireNonNull(product, ProductVariantTailoringRemovedMessagePayload.class + ": product is missing");
        Objects.requireNonNull(variantId,
            ProductVariantTailoringRemovedMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(variant, ProductVariantTailoringRemovedMessagePayload.class + ": variant is missing");
        return new ProductVariantTailoringRemovedMessagePayloadImpl(store, productKey, product, variantId, variant);
    }

    /**
     * builds ProductVariantTailoringRemovedMessagePayload without checking for non-null required values
     * @return ProductVariantTailoringRemovedMessagePayload
     */
    public ProductVariantTailoringRemovedMessagePayload buildUnchecked() {
        return new ProductVariantTailoringRemovedMessagePayloadImpl(store, productKey, product, variantId, variant);
    }

    /**
     * factory method for an instance of ProductVariantTailoringRemovedMessagePayloadBuilder
     * @return builder
     */
    public static ProductVariantTailoringRemovedMessagePayloadBuilder of() {
        return new ProductVariantTailoringRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductVariantTailoringRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantTailoringRemovedMessagePayloadBuilder of(
            final ProductVariantTailoringRemovedMessagePayload template) {
        ProductVariantTailoringRemovedMessagePayloadBuilder builder = new ProductVariantTailoringRemovedMessagePayloadBuilder();
        builder.store = template.getStore();
        builder.productKey = template.getProductKey();
        builder.product = template.getProduct();
        builder.variantId = template.getVariantId();
        builder.variant = template.getVariant();
        return builder;
    }

}
