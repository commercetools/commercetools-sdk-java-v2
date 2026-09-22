
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantSkuSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSkuSetMessagePayload variantSkuSetMessagePayload = VariantSkuSetMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSkuSetMessagePayloadBuilder implements Builder<VariantSkuSetMessagePayload> {

    private com.commercetools.api.models.product.ProductReference product;

    @Nullable
    private String sku;

    @Nullable
    private String oldSku;

    private Boolean staged;

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantSkuSetMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantSkuSetMessagePayloadBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param product value to be set
     * @return Builder
     */

    public VariantSkuSetMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>The SKU that was set on the Variant.</p>
     * @param sku value to be set
     * @return Builder
     */

    public VariantSkuSetMessagePayloadBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>The previous SKU of the Variant.</p>
     * @param oldSku value to be set
     * @return Builder
     */

    public VariantSkuSetMessagePayloadBuilder oldSku(@Nullable final String oldSku) {
        this.oldSku = oldSku;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged Variant.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantSkuSetMessagePayloadBuilder staged(final Boolean staged) {
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
     *  <p>The SKU that was set on the Variant.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>The previous SKU of the Variant.</p>
     * @return oldSku
     */

    @Nullable
    public String getOldSku() {
        return this.oldSku;
    }

    /**
     *  <p>Whether the update was only applied to the staged Variant.</p>
     * @return staged
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds VariantSkuSetMessagePayload with checking for non-null required values
     * @return VariantSkuSetMessagePayload
     */
    public VariantSkuSetMessagePayload build() {
        Objects.requireNonNull(product, VariantSkuSetMessagePayload.class + ": product is missing");
        Objects.requireNonNull(staged, VariantSkuSetMessagePayload.class + ": staged is missing");
        return new VariantSkuSetMessagePayloadImpl(product, sku, oldSku, staged);
    }

    /**
     * builds VariantSkuSetMessagePayload without checking for non-null required values
     * @return VariantSkuSetMessagePayload
     */
    public VariantSkuSetMessagePayload buildUnchecked() {
        return new VariantSkuSetMessagePayloadImpl(product, sku, oldSku, staged);
    }

    /**
     * factory method for an instance of VariantSkuSetMessagePayloadBuilder
     * @return builder
     */
    public static VariantSkuSetMessagePayloadBuilder of() {
        return new VariantSkuSetMessagePayloadBuilder();
    }

    /**
     * create builder for VariantSkuSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSkuSetMessagePayloadBuilder of(final VariantSkuSetMessagePayload template) {
        VariantSkuSetMessagePayloadBuilder builder = new VariantSkuSetMessagePayloadBuilder();
        builder.product = template.getProduct();
        builder.sku = template.getSku();
        builder.oldSku = template.getOldSku();
        builder.staged = template.getStaged();
        return builder;
    }

}
