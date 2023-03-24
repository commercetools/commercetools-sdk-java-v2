
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExternalLineItemTotalPriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExternalLineItemTotalPrice externalLineItemTotalPrice = ExternalLineItemTotalPrice.builder()
 *             .price(priceBuilder -> priceBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExternalLineItemTotalPriceBuilder implements Builder<ExternalLineItemTotalPrice> {

    private com.commercetools.api.models.common.Money price;

    private com.commercetools.api.models.common.Money totalPrice;

    /**
     *  <p>Price of the Line Item.</p>
     *  <p>The value is selected from the Product Variant according to the Product <code>priceMode</code>.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public ExternalLineItemTotalPriceBuilder price(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Price of the Line Item.</p>
     *  <p>The value is selected from the Product Variant according to the Product <code>priceMode</code>.</p>
     * @param price value to be set
     * @return Builder
     */

    public ExternalLineItemTotalPriceBuilder price(final com.commercetools.api.models.common.Money price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>Total price of the Line Item.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public ExternalLineItemTotalPriceBuilder totalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total price of the Line Item.</p>
     * @param totalPrice value to be set
     * @return Builder
     */

    public ExternalLineItemTotalPriceBuilder totalPrice(final com.commercetools.api.models.common.Money totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    public com.commercetools.api.models.common.Money getTotalPrice() {
        return this.totalPrice;
    }

    /**
     * builds ExternalLineItemTotalPrice with checking for non-null required values
     * @return ExternalLineItemTotalPrice
     */
    public ExternalLineItemTotalPrice build() {
        Objects.requireNonNull(price, ExternalLineItemTotalPrice.class + ": price is missing");
        Objects.requireNonNull(totalPrice, ExternalLineItemTotalPrice.class + ": totalPrice is missing");
        return new ExternalLineItemTotalPriceImpl(price, totalPrice);
    }

    /**
     * builds ExternalLineItemTotalPrice without checking for non-null required values
     * @return ExternalLineItemTotalPrice
     */
    public ExternalLineItemTotalPrice buildUnchecked() {
        return new ExternalLineItemTotalPriceImpl(price, totalPrice);
    }

    public static ExternalLineItemTotalPriceBuilder of() {
        return new ExternalLineItemTotalPriceBuilder();
    }

    public static ExternalLineItemTotalPriceBuilder of(final ExternalLineItemTotalPrice template) {
        ExternalLineItemTotalPriceBuilder builder = new ExternalLineItemTotalPriceBuilder();
        builder.price = template.getPrice();
        builder.totalPrice = template.getTotalPrice();
        return builder;
    }

}
