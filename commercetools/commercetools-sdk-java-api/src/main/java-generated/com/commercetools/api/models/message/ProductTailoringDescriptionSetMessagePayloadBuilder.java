
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringDescriptionSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringDescriptionSetMessagePayload productTailoringDescriptionSetMessagePayload = ProductTailoringDescriptionSetMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringDescriptionSetMessagePayloadBuilder
        implements Builder<ProductTailoringDescriptionSetMessagePayload> {

    private com.commercetools.api.models.store.StoreKeyReference store;

    @Nullable
    private String productKey;

    private com.commercetools.api.models.product.ProductReference product;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString oldDescription;

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductTailoringDescriptionSetMessagePayloadBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductTailoringDescriptionSetMessagePayloadBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param store value to be set
     * @return Builder
     */

    public ProductTailoringDescriptionSetMessagePayloadBuilder store(
            final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Product this Product Tailoring belongs to.</p>
     * @param productKey value to be set
     * @return Builder
     */

    public ProductTailoringDescriptionSetMessagePayloadBuilder productKey(@Nullable final String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringDescriptionSetMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringDescriptionSetMessagePayloadBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductTailoringDescriptionSetMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>The description of the Product Tailoring after the Set Description update action.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductTailoringDescriptionSetMessagePayloadBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The description of the Product Tailoring after the Set Description update action.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductTailoringDescriptionSetMessagePayloadBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>The description of the Product Tailoring after the Set Description update action.</p>
     * @param description value to be set
     * @return Builder
     */

    public ProductTailoringDescriptionSetMessagePayloadBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>The description of the ProductTailoring before the Set Description update action.</p>
     * @param builder function to build the oldDescription value
     * @return Builder
     */

    public ProductTailoringDescriptionSetMessagePayloadBuilder oldDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.oldDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The description of the ProductTailoring before the Set Description update action.</p>
     * @param builder function to build the oldDescription value
     * @return Builder
     */

    public ProductTailoringDescriptionSetMessagePayloadBuilder withOldDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.oldDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>The description of the ProductTailoring before the Set Description update action.</p>
     * @param oldDescription value to be set
     * @return Builder
     */

    public ProductTailoringDescriptionSetMessagePayloadBuilder oldDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString oldDescription) {
        this.oldDescription = oldDescription;
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
     *  <p>The description of the Product Tailoring after the Set Description update action.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>The description of the ProductTailoring before the Set Description update action.</p>
     * @return oldDescription
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getOldDescription() {
        return this.oldDescription;
    }

    /**
     * builds ProductTailoringDescriptionSetMessagePayload with checking for non-null required values
     * @return ProductTailoringDescriptionSetMessagePayload
     */
    public ProductTailoringDescriptionSetMessagePayload build() {
        Objects.requireNonNull(store, ProductTailoringDescriptionSetMessagePayload.class + ": store is missing");
        Objects.requireNonNull(product, ProductTailoringDescriptionSetMessagePayload.class + ": product is missing");
        return new ProductTailoringDescriptionSetMessagePayloadImpl(store, productKey, product, description,
            oldDescription);
    }

    /**
     * builds ProductTailoringDescriptionSetMessagePayload without checking for non-null required values
     * @return ProductTailoringDescriptionSetMessagePayload
     */
    public ProductTailoringDescriptionSetMessagePayload buildUnchecked() {
        return new ProductTailoringDescriptionSetMessagePayloadImpl(store, productKey, product, description,
            oldDescription);
    }

    /**
     * factory method for an instance of ProductTailoringDescriptionSetMessagePayloadBuilder
     * @return builder
     */
    public static ProductTailoringDescriptionSetMessagePayloadBuilder of() {
        return new ProductTailoringDescriptionSetMessagePayloadBuilder();
    }

    /**
     * create builder for ProductTailoringDescriptionSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringDescriptionSetMessagePayloadBuilder of(
            final ProductTailoringDescriptionSetMessagePayload template) {
        ProductTailoringDescriptionSetMessagePayloadBuilder builder = new ProductTailoringDescriptionSetMessagePayloadBuilder();
        builder.store = template.getStore();
        builder.productKey = template.getProductKey();
        builder.product = template.getProduct();
        builder.description = template.getDescription();
        builder.oldDescription = template.getOldDescription();
        return builder;
    }

}
