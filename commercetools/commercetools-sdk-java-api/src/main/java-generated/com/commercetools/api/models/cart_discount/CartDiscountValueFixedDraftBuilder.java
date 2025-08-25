
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountValueFixedDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueFixedDraft cartDiscountValueFixedDraft = CartDiscountValueFixedDraft.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueFixedDraftBuilder implements Builder<CartDiscountValueFixedDraft> {

    private java.util.List<com.commercetools.api.models.common.Money> money;

    @Nullable
    private com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode;

    /**
     *  <p>Money values provided either in <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">cent precision</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">high precision</a> for different currencies. A fixed Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param money value to be set
     * @return Builder
     */

    public CartDiscountValueFixedDraftBuilder money(final com.commercetools.api.models.common.Money... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }

    /**
     *  <p>Money values provided either in <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">cent precision</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">high precision</a> for different currencies. A fixed Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param money value to be set
     * @return Builder
     */

    public CartDiscountValueFixedDraftBuilder money(
            final java.util.List<com.commercetools.api.models.common.Money> money) {
        this.money = money;
        return this;
    }

    /**
     *  <p>Money values provided either in <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">cent precision</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">high precision</a> for different currencies. A fixed Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param money value to be set
     * @return Builder
     */

    public CartDiscountValueFixedDraftBuilder plusMoney(final com.commercetools.api.models.common.Money... money) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.addAll(Arrays.asList(money));
        return this;
    }

    /**
     *  <p>Money values provided either in <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">cent precision</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">high precision</a> for different currencies. A fixed Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public CartDiscountValueFixedDraftBuilder plusMoney(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.add(builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Money values provided either in <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">cent precision</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">high precision</a> for different currencies. A fixed Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public CartDiscountValueFixedDraftBuilder withMoney(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.money = new ArrayList<>();
        this.money.add(builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Money values provided either in <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">cent precision</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">high precision</a> for different currencies. A fixed Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public CartDiscountValueFixedDraftBuilder addMoney(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        return plusMoney(builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()));
    }

    /**
     *  <p>Money values provided either in <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">cent precision</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">high precision</a> for different currencies. A fixed Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public CartDiscountValueFixedDraftBuilder setMoney(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        return money(builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()));
    }

    /**
     *  <p>Determines how the discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountLineItemsTarget" rel="nofollow">CartDiscountLineItemTarget</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountCustomLineItemsTarget" rel="nofollow">CartDiscountCustomLineItemTarget</a>.</p>
     *  <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a>, you can also set the mode to <code>ProportionateDistribution</code> or <code>EvenDistribution</code>.</p>
     * @param applicationMode value to be set
     * @return Builder
     */

    public CartDiscountValueFixedDraftBuilder applicationMode(
            @Nullable final com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode) {
        this.applicationMode = applicationMode;
        return this;
    }

    /**
     *  <p>Money values provided either in <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">cent precision</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">high precision</a> for different currencies. A fixed Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @return money
     */

    public java.util.List<com.commercetools.api.models.common.Money> getMoney() {
        return this.money;
    }

    /**
     *  <p>Determines how the discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountLineItemsTarget" rel="nofollow">CartDiscountLineItemTarget</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountCustomLineItemsTarget" rel="nofollow">CartDiscountCustomLineItemTarget</a>.</p>
     *  <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a>, you can also set the mode to <code>ProportionateDistribution</code> or <code>EvenDistribution</code>.</p>
     * @return applicationMode
     */

    @Nullable
    public com.commercetools.api.models.cart_discount.DiscountApplicationMode getApplicationMode() {
        return this.applicationMode;
    }

    /**
     * builds CartDiscountValueFixedDraft with checking for non-null required values
     * @return CartDiscountValueFixedDraft
     */
    public CartDiscountValueFixedDraft build() {
        Objects.requireNonNull(money, CartDiscountValueFixedDraft.class + ": money is missing");
        return new CartDiscountValueFixedDraftImpl(money, applicationMode);
    }

    /**
     * builds CartDiscountValueFixedDraft without checking for non-null required values
     * @return CartDiscountValueFixedDraft
     */
    public CartDiscountValueFixedDraft buildUnchecked() {
        return new CartDiscountValueFixedDraftImpl(money, applicationMode);
    }

    /**
     * factory method for an instance of CartDiscountValueFixedDraftBuilder
     * @return builder
     */
    public static CartDiscountValueFixedDraftBuilder of() {
        return new CartDiscountValueFixedDraftBuilder();
    }

    /**
     * create builder for CartDiscountValueFixedDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueFixedDraftBuilder of(final CartDiscountValueFixedDraft template) {
        CartDiscountValueFixedDraftBuilder builder = new CartDiscountValueFixedDraftBuilder();
        builder.money = template.getMoney();
        builder.applicationMode = template.getApplicationMode();
        return builder;
    }

}
