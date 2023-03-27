
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetDiscountedPriceActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetDiscountedPriceAction productSetDiscountedPriceAction = ProductSetDiscountedPriceAction.builder()
 *             .priceId("{priceId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetDiscountedPriceActionBuilder implements Builder<ProductSetDiscountedPriceAction> {

    private String priceId;

    @Nullable
    private Boolean staged;

    @Nullable
    private com.commercetools.api.models.common.DiscountedPriceDraft discounted;

    /**
     *  <p>The <code>id</code> of the Price to set the Discount.</p>
     * @param priceId value to be set
     * @return Builder
     */

    public ProductSetDiscountedPriceActionBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductSetDiscountedPriceActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. The referenced ProductDiscount must have the Type <code>external</code>, be active, and its predicate must match the referenced Price.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public ProductSetDiscountedPriceActionBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceDraftBuilder, com.commercetools.api.models.common.DiscountedPriceDraftBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. The referenced ProductDiscount must have the Type <code>external</code>, be active, and its predicate must match the referenced Price.</p>
     * @param discounted value to be set
     * @return Builder
     */

    public ProductSetDiscountedPriceActionBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPriceDraft discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Price to set the Discount.</p>
     * @return priceId
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. The referenced ProductDiscount must have the Type <code>external</code>, be active, and its predicate must match the referenced Price.</p>
     * @return discounted
     */

    @Nullable
    public com.commercetools.api.models.common.DiscountedPriceDraft getDiscounted() {
        return this.discounted;
    }

    /**
     * builds ProductSetDiscountedPriceAction with checking for non-null required values
     * @return ProductSetDiscountedPriceAction
     */
    public ProductSetDiscountedPriceAction build() {
        Objects.requireNonNull(priceId, ProductSetDiscountedPriceAction.class + ": priceId is missing");
        return new ProductSetDiscountedPriceActionImpl(priceId, staged, discounted);
    }

    /**
     * builds ProductSetDiscountedPriceAction without checking for non-null required values
     * @return ProductSetDiscountedPriceAction
     */
    public ProductSetDiscountedPriceAction buildUnchecked() {
        return new ProductSetDiscountedPriceActionImpl(priceId, staged, discounted);
    }

    /**
     * factory method for an instance of ProductSetDiscountedPriceActionBuilder
     * @return builder
     */
    public static ProductSetDiscountedPriceActionBuilder of() {
        return new ProductSetDiscountedPriceActionBuilder();
    }

    /**
     * create builder for ProductSetDiscountedPriceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetDiscountedPriceActionBuilder of(final ProductSetDiscountedPriceAction template) {
        ProductSetDiscountedPriceActionBuilder builder = new ProductSetDiscountedPriceActionBuilder();
        builder.priceId = template.getPriceId();
        builder.staged = template.getStaged();
        builder.discounted = template.getDiscounted();
        return builder;
    }

}
