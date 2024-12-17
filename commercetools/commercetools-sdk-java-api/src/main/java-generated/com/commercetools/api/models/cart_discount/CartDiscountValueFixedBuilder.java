
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountValueFixedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueFixed cartDiscountValueFixed = CartDiscountValueFixed.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueFixedBuilder implements Builder<CartDiscountValueFixed> {

    private java.util.List<com.commercetools.api.models.common.TypedMoney> money;

    @Nullable
    private com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode;

    /**
     *  <p>Money values in cent precision or high precision of different currencies.</p>
     * @param money value to be set
     * @return Builder
     */

    public CartDiscountValueFixedBuilder money(final com.commercetools.api.models.common.TypedMoney... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }

    /**
     *  <p>Money values in cent precision or high precision of different currencies.</p>
     * @param money value to be set
     * @return Builder
     */

    public CartDiscountValueFixedBuilder money(
            final java.util.List<com.commercetools.api.models.common.TypedMoney> money) {
        this.money = money;
        return this;
    }

    /**
     *  <p>Money values in cent precision or high precision of different currencies.</p>
     * @param money value to be set
     * @return Builder
     */

    public CartDiscountValueFixedBuilder plusMoney(final com.commercetools.api.models.common.TypedMoney... money) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.addAll(Arrays.asList(money));
        return this;
    }

    /**
     *  <p>Money values in cent precision or high precision of different currencies.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public CartDiscountValueFixedBuilder plusMoney(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.add(builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Money values in cent precision or high precision of different currencies.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public CartDiscountValueFixedBuilder withMoney(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.money = new ArrayList<>();
        this.money.add(builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Indicates how the discount is applied on CartDiscountLineItemTarget or CartDiscountCustomLineItemTarget.</p>
     *  <p>For CartDiscountPatternTarget, the mode can also be <code>ProportionateDistribution</code> or <code>EvenDistribution</code>.</p>
     * @param applicationMode value to be set
     * @return Builder
     */

    public CartDiscountValueFixedBuilder applicationMode(
            @Nullable final com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode) {
        this.applicationMode = applicationMode;
        return this;
    }

    /**
     *  <p>Money values in cent precision or high precision of different currencies.</p>
     * @return money
     */

    public java.util.List<com.commercetools.api.models.common.TypedMoney> getMoney() {
        return this.money;
    }

    /**
     *  <p>Indicates how the discount is applied on CartDiscountLineItemTarget or CartDiscountCustomLineItemTarget.</p>
     *  <p>For CartDiscountPatternTarget, the mode can also be <code>ProportionateDistribution</code> or <code>EvenDistribution</code>.</p>
     * @return applicationMode
     */

    @Nullable
    public com.commercetools.api.models.cart_discount.DiscountApplicationMode getApplicationMode() {
        return this.applicationMode;
    }

    /**
     * builds CartDiscountValueFixed with checking for non-null required values
     * @return CartDiscountValueFixed
     */
    public CartDiscountValueFixed build() {
        Objects.requireNonNull(money, CartDiscountValueFixed.class + ": money is missing");
        return new CartDiscountValueFixedImpl(money, applicationMode);
    }

    /**
     * builds CartDiscountValueFixed without checking for non-null required values
     * @return CartDiscountValueFixed
     */
    public CartDiscountValueFixed buildUnchecked() {
        return new CartDiscountValueFixedImpl(money, applicationMode);
    }

    /**
     * factory method for an instance of CartDiscountValueFixedBuilder
     * @return builder
     */
    public static CartDiscountValueFixedBuilder of() {
        return new CartDiscountValueFixedBuilder();
    }

    /**
     * create builder for CartDiscountValueFixed instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueFixedBuilder of(final CartDiscountValueFixed template) {
        CartDiscountValueFixedBuilder builder = new CartDiscountValueFixedBuilder();
        builder.money = template.getMoney();
        builder.applicationMode = template.getApplicationMode();
        return builder;
    }

}
