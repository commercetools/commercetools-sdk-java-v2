
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountedPriceDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedPriceDraft discountedPriceDraft = DiscountedPriceDraft.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .discount(discountBuilder -> discountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountedPriceDraftBuilder implements Builder<DiscountedPriceDraft> {

    private com.commercetools.api.models.common.Money value;

    private com.commercetools.api.models.product_discount.ProductDiscountReference discount;

    /**
     *  <p>Sets the money value for the discounted price.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public DiscountedPriceDraftBuilder value(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the money value for the discounted price.</p>
     * @param value value to be set
     * @return Builder
     */

    public DiscountedPriceDraftBuilder value(final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Relates the referenced ProductDiscount to the discounted price.</p>
     * @param builder function to build the discount value
     * @return Builder
     */

    public DiscountedPriceDraftBuilder discount(
            Function<com.commercetools.api.models.product_discount.ProductDiscountReferenceBuilder, com.commercetools.api.models.product_discount.ProductDiscountReferenceBuilder> builder) {
        this.discount = builder
                .apply(com.commercetools.api.models.product_discount.ProductDiscountReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Relates the referenced ProductDiscount to the discounted price.</p>
     * @param discount value to be set
     * @return Builder
     */

    public DiscountedPriceDraftBuilder discount(
            final com.commercetools.api.models.product_discount.ProductDiscountReference discount) {
        this.discount = discount;
        return this;
    }

    /**
     *  <p>Sets the money value for the discounted price.</p>
     * @return value
     */

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    /**
     *  <p>Relates the referenced ProductDiscount to the discounted price.</p>
     * @return discount
     */

    public com.commercetools.api.models.product_discount.ProductDiscountReference getDiscount() {
        return this.discount;
    }

    /**
     * builds DiscountedPriceDraft with checking for non-null required values
     * @return DiscountedPriceDraft
     */
    public DiscountedPriceDraft build() {
        Objects.requireNonNull(value, DiscountedPriceDraft.class + ": value is missing");
        Objects.requireNonNull(discount, DiscountedPriceDraft.class + ": discount is missing");
        return new DiscountedPriceDraftImpl(value, discount);
    }

    /**
     * builds DiscountedPriceDraft without checking for non-null required values
     * @return DiscountedPriceDraft
     */
    public DiscountedPriceDraft buildUnchecked() {
        return new DiscountedPriceDraftImpl(value, discount);
    }

    /**
     * factory method for an instance of DiscountedPriceDraftBuilder
     * @return builder
     */
    public static DiscountedPriceDraftBuilder of() {
        return new DiscountedPriceDraftBuilder();
    }

    /**
     * create builder for DiscountedPriceDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedPriceDraftBuilder of(final DiscountedPriceDraft template) {
        DiscountedPriceDraftBuilder builder = new DiscountedPriceDraftBuilder();
        builder.value = template.getValue();
        builder.discount = template.getDiscount();
        return builder;
    }

}
