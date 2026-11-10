
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantKeySetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantKeySetMessagePayload variantKeySetMessagePayload = VariantKeySetMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantKeySetMessagePayloadBuilder implements Builder<VariantKeySetMessagePayload> {

    private com.commercetools.api.models.product.ProductReference product;

    @Nullable
    private String key;

    @Nullable
    private String oldKey;

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantKeySetMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantKeySetMessagePayloadBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param product value to be set
     * @return Builder
     */

    public VariantKeySetMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>The key that was set on the Variant.</p>
     * @param key value to be set
     * @return Builder
     */

    public VariantKeySetMessagePayloadBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The previous key of the Variant.</p>
     * @param oldKey value to be set
     * @return Builder
     */

    public VariantKeySetMessagePayloadBuilder oldKey(@Nullable final String oldKey) {
        this.oldKey = oldKey;
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
     *  <p>The key that was set on the Variant.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The previous key of the Variant.</p>
     * @return oldKey
     */

    @Nullable
    public String getOldKey() {
        return this.oldKey;
    }

    /**
     * builds VariantKeySetMessagePayload with checking for non-null required values
     * @return VariantKeySetMessagePayload
     */
    public VariantKeySetMessagePayload build() {
        Objects.requireNonNull(product, VariantKeySetMessagePayload.class + ": product is missing");
        return new VariantKeySetMessagePayloadImpl(product, key, oldKey);
    }

    /**
     * builds VariantKeySetMessagePayload without checking for non-null required values
     * @return VariantKeySetMessagePayload
     */
    public VariantKeySetMessagePayload buildUnchecked() {
        return new VariantKeySetMessagePayloadImpl(product, key, oldKey);
    }

    /**
     * factory method for an instance of VariantKeySetMessagePayloadBuilder
     * @return builder
     */
    public static VariantKeySetMessagePayloadBuilder of() {
        return new VariantKeySetMessagePayloadBuilder();
    }

    /**
     * create builder for VariantKeySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantKeySetMessagePayloadBuilder of(final VariantKeySetMessagePayload template) {
        VariantKeySetMessagePayloadBuilder builder = new VariantKeySetMessagePayloadBuilder();
        builder.product = template.getProduct();
        builder.key = template.getKey();
        builder.oldKey = template.getOldKey();
        return builder;
    }

}
