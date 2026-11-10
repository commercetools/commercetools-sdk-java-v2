
package com.commercetools.importapi.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountedPriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedPrice discountedPrice = DiscountedPrice.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .discount(discountBuilder -> discountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountedPriceBuilder implements Builder<DiscountedPrice> {

    private com.commercetools.importapi.models.common.TypedMoney value;

    private com.commercetools.importapi.models.common.ProductDiscountKeyReference discount;

    /**
     *  <p>Money value of the discounted price.</p>
     * @param value value to be set
     * @return Builder
     */

    public DiscountedPriceBuilder value(final com.commercetools.importapi.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Money value of the discounted price.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public DiscountedPriceBuilder value(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a ProductDiscount. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscount" rel="nofollow">ProductDiscount</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced ProductDiscount is created.</p>
     * @param builder function to build the discount value
     * @return Builder
     */

    public DiscountedPriceBuilder discount(
            Function<com.commercetools.importapi.models.common.ProductDiscountKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductDiscountKeyReferenceBuilder> builder) {
        this.discount = builder.apply(com.commercetools.importapi.models.common.ProductDiscountKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a ProductDiscount. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscount" rel="nofollow">ProductDiscount</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced ProductDiscount is created.</p>
     * @param builder function to build the discount value
     * @return Builder
     */

    public DiscountedPriceBuilder withDiscount(
            Function<com.commercetools.importapi.models.common.ProductDiscountKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductDiscountKeyReference> builder) {
        this.discount = builder
                .apply(com.commercetools.importapi.models.common.ProductDiscountKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a ProductDiscount. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscount" rel="nofollow">ProductDiscount</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced ProductDiscount is created.</p>
     * @param discount value to be set
     * @return Builder
     */

    public DiscountedPriceBuilder discount(
            final com.commercetools.importapi.models.common.ProductDiscountKeyReference discount) {
        this.discount = discount;
        return this;
    }

    /**
     *  <p>Money value of the discounted price.</p>
     * @return value
     */

    public com.commercetools.importapi.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p>Reference to a ProductDiscount. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscount" rel="nofollow">ProductDiscount</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced ProductDiscount is created.</p>
     * @return discount
     */

    public com.commercetools.importapi.models.common.ProductDiscountKeyReference getDiscount() {
        return this.discount;
    }

    /**
     * builds DiscountedPrice with checking for non-null required values
     * @return DiscountedPrice
     */
    public DiscountedPrice build() {
        Objects.requireNonNull(value, DiscountedPrice.class + ": value is missing");
        Objects.requireNonNull(discount, DiscountedPrice.class + ": discount is missing");
        return new DiscountedPriceImpl(value, discount);
    }

    /**
     * builds DiscountedPrice without checking for non-null required values
     * @return DiscountedPrice
     */
    public DiscountedPrice buildUnchecked() {
        return new DiscountedPriceImpl(value, discount);
    }

    /**
     * factory method for an instance of DiscountedPriceBuilder
     * @return builder
     */
    public static DiscountedPriceBuilder of() {
        return new DiscountedPriceBuilder();
    }

    /**
     * create builder for DiscountedPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedPriceBuilder of(final DiscountedPrice template) {
        DiscountedPriceBuilder builder = new DiscountedPriceBuilder();
        builder.value = template.getValue();
        builder.discount = template.getDiscount();
        return builder;
    }

}
