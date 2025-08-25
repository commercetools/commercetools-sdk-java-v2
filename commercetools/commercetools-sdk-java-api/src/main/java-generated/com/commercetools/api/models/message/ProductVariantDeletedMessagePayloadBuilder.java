
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantDeletedMessagePayload productVariantDeletedMessagePayload = ProductVariantDeletedMessagePayload.builder()
 *             .plusRemovedImageUrls(removedImageUrlsBuilder -> removedImageUrlsBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantDeletedMessagePayloadBuilder implements Builder<ProductVariantDeletedMessagePayload> {

    @Nullable
    private com.commercetools.api.models.product.ProductVariant variant;

    private java.util.List<String> removedImageUrls;

    private Boolean staged;

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">Product Variant</a> that was added.</p>
     * @param builder function to build the variant value
     * @return Builder
     */

    public ProductVariantDeletedMessagePayloadBuilder variant(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        this.variant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">Product Variant</a> that was added.</p>
     * @param builder function to build the variant value
     * @return Builder
     */

    public ProductVariantDeletedMessagePayloadBuilder withVariant(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariant> builder) {
        this.variant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of());
        return this;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">Product Variant</a> that was added.</p>
     * @param variant value to be set
     * @return Builder
     */

    public ProductVariantDeletedMessagePayloadBuilder variant(
            @Nullable final com.commercetools.api.models.product.ProductVariant variant) {
        this.variant = variant;
        return this;
    }

    /**
     *  <p>List of image URLs that were removed with the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductRemoveVariantAction" rel="nofollow">Remove Product Variant</a> update action.</p>
     * @param removedImageUrls value to be set
     * @return Builder
     */

    public ProductVariantDeletedMessagePayloadBuilder removedImageUrls(final String... removedImageUrls) {
        this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
        return this;
    }

    /**
     *  <p>List of image URLs that were removed with the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductRemoveVariantAction" rel="nofollow">Remove Product Variant</a> update action.</p>
     * @param removedImageUrls value to be set
     * @return Builder
     */

    public ProductVariantDeletedMessagePayloadBuilder removedImageUrls(final java.util.List<String> removedImageUrls) {
        this.removedImageUrls = removedImageUrls;
        return this;
    }

    /**
     *  <p>List of image URLs that were removed with the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductRemoveVariantAction" rel="nofollow">Remove Product Variant</a> update action.</p>
     * @param removedImageUrls value to be set
     * @return Builder
     */

    public ProductVariantDeletedMessagePayloadBuilder plusRemovedImageUrls(final String... removedImageUrls) {
        if (this.removedImageUrls == null) {
            this.removedImageUrls = new ArrayList<>();
        }
        this.removedImageUrls.addAll(Arrays.asList(removedImageUrls));
        return this;
    }

    /**
     *  <p>If <code>true</code>, this message informs that only the staged ProductVariant has been removed by the update action. If <code>false</code>, both the current and staged ProductVariant have been removed.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductVariantDeletedMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">Product Variant</a> that was added.</p>
     * @return variant
     */

    @Nullable
    public com.commercetools.api.models.product.ProductVariant getVariant() {
        return this.variant;
    }

    /**
     *  <p>List of image URLs that were removed with the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductRemoveVariantAction" rel="nofollow">Remove Product Variant</a> update action.</p>
     * @return removedImageUrls
     */

    public java.util.List<String> getRemovedImageUrls() {
        return this.removedImageUrls;
    }

    /**
     *  <p>If <code>true</code>, this message informs that only the staged ProductVariant has been removed by the update action. If <code>false</code>, both the current and staged ProductVariant have been removed.</p>
     * @return staged
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductVariantDeletedMessagePayload with checking for non-null required values
     * @return ProductVariantDeletedMessagePayload
     */
    public ProductVariantDeletedMessagePayload build() {
        Objects.requireNonNull(removedImageUrls,
            ProductVariantDeletedMessagePayload.class + ": removedImageUrls is missing");
        Objects.requireNonNull(staged, ProductVariantDeletedMessagePayload.class + ": staged is missing");
        return new ProductVariantDeletedMessagePayloadImpl(variant, removedImageUrls, staged);
    }

    /**
     * builds ProductVariantDeletedMessagePayload without checking for non-null required values
     * @return ProductVariantDeletedMessagePayload
     */
    public ProductVariantDeletedMessagePayload buildUnchecked() {
        return new ProductVariantDeletedMessagePayloadImpl(variant, removedImageUrls, staged);
    }

    /**
     * factory method for an instance of ProductVariantDeletedMessagePayloadBuilder
     * @return builder
     */
    public static ProductVariantDeletedMessagePayloadBuilder of() {
        return new ProductVariantDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductVariantDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantDeletedMessagePayloadBuilder of(final ProductVariantDeletedMessagePayload template) {
        ProductVariantDeletedMessagePayloadBuilder builder = new ProductVariantDeletedMessagePayloadBuilder();
        builder.variant = template.getVariant();
        builder.removedImageUrls = template.getRemovedImageUrls();
        builder.staged = template.getStaged();
        return builder;
    }

}
