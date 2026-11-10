
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceDiscountsSetUpdatedPriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceDiscountsSetUpdatedPrice productPriceDiscountsSetUpdatedPrice = ProductPriceDiscountsSetUpdatedPrice.builder()
 *             .variantId(1)
 *             .priceId("{priceId}")
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceDiscountsSetUpdatedPriceBuilder implements Builder<ProductPriceDiscountsSetUpdatedPrice> {

    private Integer variantId;

    @Nullable
    private String variantKey;

    @Nullable
    private String sku;

    private String priceId;

    @Nullable
    private com.commercetools.api.models.common.DiscountedPrice discounted;

    private Boolean staged;

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> for which the Discount was set.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductPriceDiscountsSetUpdatedPriceBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Key of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> for which Discount was set.</p>
     * @param variantKey value to be set
     * @return Builder
     */

    public ProductPriceDiscountsSetUpdatedPriceBuilder variantKey(@Nullable final String variantKey) {
        this.variantKey = variantKey;
        return this;
    }

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> for which Discount was set.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductPriceDiscountsSetUpdatedPriceBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a>.</p>
     * @param priceId value to be set
     * @return Builder
     */

    public ProductPriceDiscountsSetUpdatedPriceBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p>Discounted Price for the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> for which Discount was set.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public ProductPriceDiscountsSetUpdatedPriceBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Discounted Price for the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> for which Discount was set.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public ProductPriceDiscountsSetUpdatedPriceBuilder withDiscounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPrice> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Discounted Price for the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> for which Discount was set.</p>
     * @param discounted value to be set
     * @return Builder
     */

    public ProductPriceDiscountsSetUpdatedPriceBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">ProductProjection</a>.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductPriceDiscountsSetUpdatedPriceBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> for which the Discount was set.</p>
     * @return variantId
     */

    public Integer getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Key of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> for which Discount was set.</p>
     * @return variantKey
     */

    @Nullable
    public String getVariantKey() {
        return this.variantKey;
    }

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> for which Discount was set.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a>.</p>
     * @return priceId
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     *  <p>Discounted Price for the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> for which Discount was set.</p>
     * @return discounted
     */

    @Nullable
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">ProductProjection</a>.</p>
     * @return staged
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductPriceDiscountsSetUpdatedPrice with checking for non-null required values
     * @return ProductPriceDiscountsSetUpdatedPrice
     */
    public ProductPriceDiscountsSetUpdatedPrice build() {
        Objects.requireNonNull(variantId, ProductPriceDiscountsSetUpdatedPrice.class + ": variantId is missing");
        Objects.requireNonNull(priceId, ProductPriceDiscountsSetUpdatedPrice.class + ": priceId is missing");
        Objects.requireNonNull(staged, ProductPriceDiscountsSetUpdatedPrice.class + ": staged is missing");
        return new ProductPriceDiscountsSetUpdatedPriceImpl(variantId, variantKey, sku, priceId, discounted, staged);
    }

    /**
     * builds ProductPriceDiscountsSetUpdatedPrice without checking for non-null required values
     * @return ProductPriceDiscountsSetUpdatedPrice
     */
    public ProductPriceDiscountsSetUpdatedPrice buildUnchecked() {
        return new ProductPriceDiscountsSetUpdatedPriceImpl(variantId, variantKey, sku, priceId, discounted, staged);
    }

    /**
     * factory method for an instance of ProductPriceDiscountsSetUpdatedPriceBuilder
     * @return builder
     */
    public static ProductPriceDiscountsSetUpdatedPriceBuilder of() {
        return new ProductPriceDiscountsSetUpdatedPriceBuilder();
    }

    /**
     * create builder for ProductPriceDiscountsSetUpdatedPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceDiscountsSetUpdatedPriceBuilder of(final ProductPriceDiscountsSetUpdatedPrice template) {
        ProductPriceDiscountsSetUpdatedPriceBuilder builder = new ProductPriceDiscountsSetUpdatedPriceBuilder();
        builder.variantId = template.getVariantId();
        builder.variantKey = template.getVariantKey();
        builder.sku = template.getSku();
        builder.priceId = template.getPriceId();
        builder.discounted = template.getDiscounted();
        builder.staged = template.getStaged();
        return builder;
    }

}
