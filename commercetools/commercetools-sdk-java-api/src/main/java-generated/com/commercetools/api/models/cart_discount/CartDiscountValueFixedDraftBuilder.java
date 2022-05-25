
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

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

    /**
     <*  <p>Money values in different currencies. A fixed Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>>
     */

    public CartDiscountValueFixedDraftBuilder money(final com.commercetools.api.models.common.Money... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }

    /**
     <*  <p>Money values in different currencies. A fixed Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>>
     */

    public CartDiscountValueFixedDraftBuilder money(
            final java.util.List<com.commercetools.api.models.common.Money> money) {
        this.money = money;
        return this;
    }

    /**
     <*  <p>Money values in different currencies. A fixed Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>>
     */

    public CartDiscountValueFixedDraftBuilder plusMoney(final com.commercetools.api.models.common.Money... money) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.addAll(Arrays.asList(money));
        return this;
    }

    /**
     <*  <p>Money values in different currencies. A fixed Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>>
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
     <*  <p>Money values in different currencies. A fixed Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>>
     */

    public CartDiscountValueFixedDraftBuilder withMoney(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.money = new ArrayList<>();
        this.money.add(builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.common.Money> getMoney() {
        return this.money;
    }

    public CartDiscountValueFixedDraft build() {
        Objects.requireNonNull(money, CartDiscountValueFixedDraft.class + ": money is missing");
        return new CartDiscountValueFixedDraftImpl(money);
    }

    /**
     * builds CartDiscountValueFixedDraft without checking for non null required values
     */
    public CartDiscountValueFixedDraft buildUnchecked() {
        return new CartDiscountValueFixedDraftImpl(money);
    }

    public static CartDiscountValueFixedDraftBuilder of() {
        return new CartDiscountValueFixedDraftBuilder();
    }

    public static CartDiscountValueFixedDraftBuilder of(final CartDiscountValueFixedDraft template) {
        CartDiscountValueFixedDraftBuilder builder = new CartDiscountValueFixedDraftBuilder();
        builder.money = template.getMoney();
        return builder;
    }

}
