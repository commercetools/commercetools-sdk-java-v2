
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringNameSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringNameSetMessagePayload productTailoringNameSetMessagePayload = ProductTailoringNameSetMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringNameSetMessagePayloadBuilder implements Builder<ProductTailoringNameSetMessagePayload> {

    private com.commercetools.api.models.store.StoreKeyReference store;

    @Nullable
    private String productKey;

    private com.commercetools.api.models.product.ProductReference product;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString oldName;

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductTailoringNameSetMessagePayloadBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductTailoringNameSetMessagePayloadBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param store value to be set
     * @return Builder
     */

    public ProductTailoringNameSetMessagePayloadBuilder store(
            final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Product this Product Tailoring belongs to.</p>
     * @param productKey value to be set
     * @return Builder
     */

    public ProductTailoringNameSetMessagePayloadBuilder productKey(@Nullable final String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringNameSetMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringNameSetMessagePayloadBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductTailoringNameSetMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>The name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductTailoringNameSetMessagePayloadBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductTailoringNameSetMessagePayloadBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>The name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductTailoringNameSetMessagePayloadBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @param builder function to build the oldName value
     * @return Builder
     */

    public ProductTailoringNameSetMessagePayloadBuilder oldName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.oldName = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @param builder function to build the oldName value
     * @return Builder
     */

    public ProductTailoringNameSetMessagePayloadBuilder withOldName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.oldName = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>The name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @param oldName value to be set
     * @return Builder
     */

    public ProductTailoringNameSetMessagePayloadBuilder oldName(
            @Nullable final com.commercetools.api.models.common.LocalizedString oldName) {
        this.oldName = oldName;
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
     *  <p>The name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>The name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @return oldName
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getOldName() {
        return this.oldName;
    }

    /**
     * builds ProductTailoringNameSetMessagePayload with checking for non-null required values
     * @return ProductTailoringNameSetMessagePayload
     */
    public ProductTailoringNameSetMessagePayload build() {
        Objects.requireNonNull(store, ProductTailoringNameSetMessagePayload.class + ": store is missing");
        Objects.requireNonNull(product, ProductTailoringNameSetMessagePayload.class + ": product is missing");
        return new ProductTailoringNameSetMessagePayloadImpl(store, productKey, product, name, oldName);
    }

    /**
     * builds ProductTailoringNameSetMessagePayload without checking for non-null required values
     * @return ProductTailoringNameSetMessagePayload
     */
    public ProductTailoringNameSetMessagePayload buildUnchecked() {
        return new ProductTailoringNameSetMessagePayloadImpl(store, productKey, product, name, oldName);
    }

    /**
     * factory method for an instance of ProductTailoringNameSetMessagePayloadBuilder
     * @return builder
     */
    public static ProductTailoringNameSetMessagePayloadBuilder of() {
        return new ProductTailoringNameSetMessagePayloadBuilder();
    }

    /**
     * create builder for ProductTailoringNameSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringNameSetMessagePayloadBuilder of(
            final ProductTailoringNameSetMessagePayload template) {
        ProductTailoringNameSetMessagePayloadBuilder builder = new ProductTailoringNameSetMessagePayloadBuilder();
        builder.store = template.getStore();
        builder.productKey = template.getProductKey();
        builder.product = template.getProduct();
        builder.name = template.getName();
        builder.oldName = template.getOldName();
        return builder;
    }

}
