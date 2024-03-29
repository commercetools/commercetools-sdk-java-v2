
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountedLineItemPriceForQuantityBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedLineItemPriceForQuantity discountedLineItemPriceForQuantity = DiscountedLineItemPriceForQuantity.builder()
 *             .quantity(1)
 *             .discountedPrice(discountedPriceBuilder -> discountedPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountedLineItemPriceForQuantityBuilder implements Builder<DiscountedLineItemPriceForQuantity> {

    private Integer quantity;

    private com.commercetools.history.models.common.DiscountedLineItemPrice discountedPrice;

    /**
     * set the value to the quantity
     * @param quantity value to be set
     * @return Builder
     */

    public DiscountedLineItemPriceForQuantityBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * set the value to the discountedPrice using the builder function
     * @param builder function to build the discountedPrice value
     * @return Builder
     */

    public DiscountedLineItemPriceForQuantityBuilder discountedPrice(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceBuilder> builder) {
        this.discountedPrice = builder
                .apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the discountedPrice using the builder function
     * @param builder function to build the discountedPrice value
     * @return Builder
     */

    public DiscountedLineItemPriceForQuantityBuilder withDiscountedPrice(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPrice> builder) {
        this.discountedPrice = builder
                .apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of());
        return this;
    }

    /**
     * set the value to the discountedPrice
     * @param discountedPrice value to be set
     * @return Builder
     */

    public DiscountedLineItemPriceForQuantityBuilder discountedPrice(
            final com.commercetools.history.models.common.DiscountedLineItemPrice discountedPrice) {
        this.discountedPrice = discountedPrice;
        return this;
    }

    /**
     * value of quantity}
     * @return quantity
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * value of discountedPrice}
     * @return discountedPrice
     */

    public com.commercetools.history.models.common.DiscountedLineItemPrice getDiscountedPrice() {
        return this.discountedPrice;
    }

    /**
     * builds DiscountedLineItemPriceForQuantity with checking for non-null required values
     * @return DiscountedLineItemPriceForQuantity
     */
    public DiscountedLineItemPriceForQuantity build() {
        Objects.requireNonNull(quantity, DiscountedLineItemPriceForQuantity.class + ": quantity is missing");
        Objects.requireNonNull(discountedPrice,
            DiscountedLineItemPriceForQuantity.class + ": discountedPrice is missing");
        return new DiscountedLineItemPriceForQuantityImpl(quantity, discountedPrice);
    }

    /**
     * builds DiscountedLineItemPriceForQuantity without checking for non-null required values
     * @return DiscountedLineItemPriceForQuantity
     */
    public DiscountedLineItemPriceForQuantity buildUnchecked() {
        return new DiscountedLineItemPriceForQuantityImpl(quantity, discountedPrice);
    }

    /**
     * factory method for an instance of DiscountedLineItemPriceForQuantityBuilder
     * @return builder
     */
    public static DiscountedLineItemPriceForQuantityBuilder of() {
        return new DiscountedLineItemPriceForQuantityBuilder();
    }

    /**
     * create builder for DiscountedLineItemPriceForQuantity instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedLineItemPriceForQuantityBuilder of(final DiscountedLineItemPriceForQuantity template) {
        DiscountedLineItemPriceForQuantityBuilder builder = new DiscountedLineItemPriceForQuantityBuilder();
        builder.quantity = template.getQuantity();
        builder.discountedPrice = template.getDiscountedPrice();
        return builder;
    }

}
