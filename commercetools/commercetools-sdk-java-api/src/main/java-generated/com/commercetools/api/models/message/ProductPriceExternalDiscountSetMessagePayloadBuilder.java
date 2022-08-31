
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceExternalDiscountSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceExternalDiscountSetMessagePayload productPriceExternalDiscountSetMessagePayload = ProductPriceExternalDiscountSetMessagePayload.builder()
 *             .variantId(1)
 *             .priceId("{priceId}")
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceExternalDiscountSetMessagePayloadBuilder
        implements Builder<ProductPriceExternalDiscountSetMessagePayload> {

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
     *  <p>Unique identifier of the Product Variant for which the Discount was set.</p>
     */

    public ProductPriceExternalDiscountSetMessagePayloadBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Key of the Product Variant for which the Discount was set.</p>
     */

    public ProductPriceExternalDiscountSetMessagePayloadBuilder variantKey(@Nullable final String variantKey) {
        this.variantKey = variantKey;
        return this;
    }

    /**
     *  <p>SKU of the Product Variant for which Discount was set.</p>
     */

    public ProductPriceExternalDiscountSetMessagePayloadBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Unique identifier of the Embedded Price.</p>
     */

    public ProductPriceExternalDiscountSetMessagePayloadBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p>Discounted Price for the Product Variant for which Discount was set.</p>
     */

    public ProductPriceExternalDiscountSetMessagePayloadBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Discounted Price for the Product Variant for which Discount was set.</p>
     */

    public ProductPriceExternalDiscountSetMessagePayloadBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     */

    public ProductPriceExternalDiscountSetMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public Integer getVariantId() {
        return this.variantId;
    }

    @Nullable
    public String getVariantKey() {
        return this.variantKey;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    public String getPriceId() {
        return this.priceId;
    }

    @Nullable
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public ProductPriceExternalDiscountSetMessagePayload build() {
        Objects.requireNonNull(variantId,
            ProductPriceExternalDiscountSetMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(priceId, ProductPriceExternalDiscountSetMessagePayload.class + ": priceId is missing");
        Objects.requireNonNull(staged, ProductPriceExternalDiscountSetMessagePayload.class + ": staged is missing");
        return new ProductPriceExternalDiscountSetMessagePayloadImpl(variantId, variantKey, sku, priceId, discounted,
            staged);
    }

    /**
     * builds ProductPriceExternalDiscountSetMessagePayload without checking for non null required values
     */
    public ProductPriceExternalDiscountSetMessagePayload buildUnchecked() {
        return new ProductPriceExternalDiscountSetMessagePayloadImpl(variantId, variantKey, sku, priceId, discounted,
            staged);
    }

    public static ProductPriceExternalDiscountSetMessagePayloadBuilder of() {
        return new ProductPriceExternalDiscountSetMessagePayloadBuilder();
    }

    public static ProductPriceExternalDiscountSetMessagePayloadBuilder of(
            final ProductPriceExternalDiscountSetMessagePayload template) {
        ProductPriceExternalDiscountSetMessagePayloadBuilder builder = new ProductPriceExternalDiscountSetMessagePayloadBuilder();
        builder.variantId = template.getVariantId();
        builder.variantKey = template.getVariantKey();
        builder.sku = template.getSku();
        builder.priceId = template.getPriceId();
        builder.discounted = template.getDiscounted();
        builder.staged = template.getStaged();
        return builder;
    }

}
