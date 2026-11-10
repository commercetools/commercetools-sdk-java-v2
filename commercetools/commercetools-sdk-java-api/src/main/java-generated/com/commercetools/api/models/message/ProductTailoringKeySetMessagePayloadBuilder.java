
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringKeySetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringKeySetMessagePayload productTailoringKeySetMessagePayload = ProductTailoringKeySetMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringKeySetMessagePayloadBuilder implements Builder<ProductTailoringKeySetMessagePayload> {

    private com.commercetools.api.models.store.StoreKeyReference store;

    @Nullable
    private String productKey;

    private com.commercetools.api.models.product.ProductReference product;

    @Nullable
    private String key;

    @Nullable
    private String oldKey;

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductTailoringKeySetMessagePayloadBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductTailoringKeySetMessagePayloadBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param store value to be set
     * @return Builder
     */

    public ProductTailoringKeySetMessagePayloadBuilder store(
            final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Product this Product Tailoring belongs to.</p>
     * @param productKey value to be set
     * @return Builder
     */

    public ProductTailoringKeySetMessagePayloadBuilder productKey(@Nullable final String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringKeySetMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringKeySetMessagePayloadBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductTailoringKeySetMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductTailoringKeySetMessagePayloadBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @param oldKey value to be set
     * @return Builder
     */

    public ProductTailoringKeySetMessagePayloadBuilder oldKey(@Nullable final String oldKey) {
        this.oldKey = oldKey;
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
     *  <p>User-defined unique identifier of the Product this Product Tailoring belongs to.</p>
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
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @return oldKey
     */

    @Nullable
    public String getOldKey() {
        return this.oldKey;
    }

    /**
     * builds ProductTailoringKeySetMessagePayload with checking for non-null required values
     * @return ProductTailoringKeySetMessagePayload
     */
    public ProductTailoringKeySetMessagePayload build() {
        Objects.requireNonNull(store, ProductTailoringKeySetMessagePayload.class + ": store is missing");
        Objects.requireNonNull(product, ProductTailoringKeySetMessagePayload.class + ": product is missing");
        return new ProductTailoringKeySetMessagePayloadImpl(store, productKey, product, key, oldKey);
    }

    /**
     * builds ProductTailoringKeySetMessagePayload without checking for non-null required values
     * @return ProductTailoringKeySetMessagePayload
     */
    public ProductTailoringKeySetMessagePayload buildUnchecked() {
        return new ProductTailoringKeySetMessagePayloadImpl(store, productKey, product, key, oldKey);
    }

    /**
     * factory method for an instance of ProductTailoringKeySetMessagePayloadBuilder
     * @return builder
     */
    public static ProductTailoringKeySetMessagePayloadBuilder of() {
        return new ProductTailoringKeySetMessagePayloadBuilder();
    }

    /**
     * create builder for ProductTailoringKeySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringKeySetMessagePayloadBuilder of(final ProductTailoringKeySetMessagePayload template) {
        ProductTailoringKeySetMessagePayloadBuilder builder = new ProductTailoringKeySetMessagePayloadBuilder();
        builder.store = template.getStore();
        builder.productKey = template.getProductKey();
        builder.product = template.getProduct();
        builder.key = template.getKey();
        builder.oldKey = template.getOldKey();
        return builder;
    }

}
