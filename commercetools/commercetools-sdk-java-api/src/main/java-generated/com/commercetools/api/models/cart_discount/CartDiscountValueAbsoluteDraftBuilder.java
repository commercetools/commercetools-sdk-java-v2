
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

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

    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     * @param money value to be set
     * @return Builder
     */

    public CartDiscountValueAbsoluteDraftBuilder money(final com.commercetools.api.models.common.Money... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }

    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     * @param money value to be set
     * @return Builder
     */

    public CartDiscountValueAbsoluteDraftBuilder money(
            final java.util.List<com.commercetools.api.models.common.Money> money) {
        this.money = money;
        return this;
    }

    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
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
     *  <p>Money values in different currencies. An absolute Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
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
     *  <p>Money values in different currencies. An absolute Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
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
     *  <p>Money values in different currencies. An absolute Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     * @return money
     */

    public java.util.List<com.commercetools.api.models.common.Money> getMoney() {
        return this.money;
    }

    /**
     * builds CartDiscountValueAbsoluteDraft with checking for non-null required values
     * @return CartDiscountValueAbsoluteDraft
     */
    public CartDiscountValueAbsoluteDraft build() {
        Objects.requireNonNull(money, CartDiscountValueAbsoluteDraft.class + ": money is missing");
        return new CartDiscountValueAbsoluteDraftImpl(money);
    }

    /**
     * builds CartDiscountValueAbsoluteDraft without checking for non-null required values
     * @return CartDiscountValueAbsoluteDraft
     */
    public CartDiscountValueAbsoluteDraft buildUnchecked() {
        return new CartDiscountValueAbsoluteDraftImpl(money);
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
        return builder;
    }

}
