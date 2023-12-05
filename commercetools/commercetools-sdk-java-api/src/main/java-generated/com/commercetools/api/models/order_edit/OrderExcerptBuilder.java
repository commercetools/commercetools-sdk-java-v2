
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderExcerptBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderExcerpt orderExcerpt = OrderExcerpt.builder()
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .version(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderExcerptBuilder implements Builder<OrderExcerpt> {

    private com.commercetools.api.models.common.TypedMoney totalPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedPrice taxedPrice;

    private Long version;

    /**
     *  <p>Total price of the Order.</p>
     * @param totalPrice value to be set
     * @return Builder
     */

    public OrderExcerptBuilder totalPrice(final com.commercetools.api.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *  <p>Total price of the Order.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public OrderExcerptBuilder totalPrice(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Taxed price of the Order.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public OrderExcerptBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Taxed price of the Order.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public OrderExcerptBuilder withTaxedPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPrice> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Taxed price of the Order.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */

    public OrderExcerptBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Current version of the Order.</p>
     * @param version value to be set
     * @return Builder
     */

    public OrderExcerptBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Total price of the Order.</p>
     * @return totalPrice
     */

    public com.commercetools.api.models.common.TypedMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <p>Taxed price of the Order.</p>
     * @return taxedPrice
     */

    @Nullable
    public com.commercetools.api.models.cart.TaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Current version of the Order.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * builds OrderExcerpt with checking for non-null required values
     * @return OrderExcerpt
     */
    public OrderExcerpt build() {
        Objects.requireNonNull(totalPrice, OrderExcerpt.class + ": totalPrice is missing");
        Objects.requireNonNull(version, OrderExcerpt.class + ": version is missing");
        return new OrderExcerptImpl(totalPrice, taxedPrice, version);
    }

    /**
     * builds OrderExcerpt without checking for non-null required values
     * @return OrderExcerpt
     */
    public OrderExcerpt buildUnchecked() {
        return new OrderExcerptImpl(totalPrice, taxedPrice, version);
    }

    /**
     * factory method for an instance of OrderExcerptBuilder
     * @return builder
     */
    public static OrderExcerptBuilder of() {
        return new OrderExcerptBuilder();
    }

    /**
     * create builder for OrderExcerpt instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderExcerptBuilder of(final OrderExcerpt template) {
        OrderExcerptBuilder builder = new OrderExcerptBuilder();
        builder.totalPrice = template.getTotalPrice();
        builder.taxedPrice = template.getTaxedPrice();
        builder.version = template.getVersion();
        return builder;
    }

}
