
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountValueAbsoluteDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueAbsoluteDraft cartDiscountValueAbsoluteDraft = CartDiscountValueAbsoluteDraft.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueAbsoluteDraftBuilder implements Builder<CartDiscountValueAbsoluteDraft> {

    private java.util.List<com.commercetools.api.models.common.Money> money;

    @Nullable
    private com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode;

    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an InvalidOperation error.</p>
     * @param money value to be set
     * @return Builder
     */

    public CartDiscountValueAbsoluteDraftBuilder money(final com.commercetools.api.models.common.Money... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }

    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an InvalidOperation error.</p>
     * @param money value to be set
     * @return Builder
     */

    public CartDiscountValueAbsoluteDraftBuilder money(
            final java.util.List<com.commercetools.api.models.common.Money> money) {
        this.money = money;
        return this;
    }

    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an InvalidOperation error.</p>
     * @param money value to be set
     * @return Builder
     */

    public CartDiscountValueAbsoluteDraftBuilder plusMoney(final com.commercetools.api.models.common.Money... money) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.addAll(Arrays.asList(money));
        return this;
    }

    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an InvalidOperation error.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public CartDiscountValueAbsoluteDraftBuilder plusMoney(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.add(builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an InvalidOperation error.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public CartDiscountValueAbsoluteDraftBuilder withMoney(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.money = new ArrayList<>();
        this.money.add(builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an InvalidOperation error.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public CartDiscountValueAbsoluteDraftBuilder addMoney(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        return plusMoney(builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()));
    }

    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an InvalidOperation error.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public CartDiscountValueAbsoluteDraftBuilder setMoney(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        return money(builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()));
    }

    /**
     *  <p>Determines how the discount applies on CartDiscountLineItemTarget and CartDiscountCustomLineItemTarget.</p>
     *  <p>If not set, the default behavior is <code>ProportionateDistribution</code>.</p>
     * @param applicationMode value to be set
     * @return Builder
     */

    public CartDiscountValueAbsoluteDraftBuilder applicationMode(
            @Nullable final com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode) {
        this.applicationMode = applicationMode;
        return this;
    }

    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an InvalidOperation error.</p>
     * @return money
     */

    public java.util.List<com.commercetools.api.models.common.Money> getMoney() {
        return this.money;
    }

    /**
     *  <p>Determines how the discount applies on CartDiscountLineItemTarget and CartDiscountCustomLineItemTarget.</p>
     *  <p>If not set, the default behavior is <code>ProportionateDistribution</code>.</p>
     * @return applicationMode
     */

    @Nullable
    public com.commercetools.api.models.cart_discount.DiscountApplicationMode getApplicationMode() {
        return this.applicationMode;
    }

    /**
     * builds CartDiscountValueAbsoluteDraft with checking for non-null required values
     * @return CartDiscountValueAbsoluteDraft
     */
    public CartDiscountValueAbsoluteDraft build() {
        Objects.requireNonNull(money, CartDiscountValueAbsoluteDraft.class + ": money is missing");
        return new CartDiscountValueAbsoluteDraftImpl(money, applicationMode);
    }

    /**
     * builds CartDiscountValueAbsoluteDraft without checking for non-null required values
     * @return CartDiscountValueAbsoluteDraft
     */
    public CartDiscountValueAbsoluteDraft buildUnchecked() {
        return new CartDiscountValueAbsoluteDraftImpl(money, applicationMode);
    }

    /**
     * factory method for an instance of CartDiscountValueAbsoluteDraftBuilder
     * @return builder
     */
    public static CartDiscountValueAbsoluteDraftBuilder of() {
        return new CartDiscountValueAbsoluteDraftBuilder();
    }

    /**
     * create builder for CartDiscountValueAbsoluteDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueAbsoluteDraftBuilder of(final CartDiscountValueAbsoluteDraft template) {
        CartDiscountValueAbsoluteDraftBuilder builder = new CartDiscountValueAbsoluteDraftBuilder();
        builder.money = template.getMoney();
        builder.applicationMode = template.getApplicationMode();
        return builder;
    }

}
