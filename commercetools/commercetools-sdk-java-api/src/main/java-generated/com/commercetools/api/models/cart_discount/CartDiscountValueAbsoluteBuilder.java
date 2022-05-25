
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountValueAbsoluteBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueAbsolute cartDiscountValueAbsolute = CartDiscountValueAbsolute.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueAbsoluteBuilder implements Builder<CartDiscountValueAbsolute> {

    private java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money;

    /**
     *  <p>Cent precision money values in different currencies.</p>
     */

    public CartDiscountValueAbsoluteBuilder money(
            final com.commercetools.api.models.common.CentPrecisionMoney... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }

    /**
     *  <p>Cent precision money values in different currencies.</p>
     */

    public CartDiscountValueAbsoluteBuilder money(
            final java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money) {
        this.money = money;
        return this;
    }

    /**
     *  <p>Cent precision money values in different currencies.</p>
     */

    public CartDiscountValueAbsoluteBuilder plusMoney(
            final com.commercetools.api.models.common.CentPrecisionMoney... money) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.addAll(Arrays.asList(money));
        return this;
    }

    /**
     *  <p>Cent precision money values in different currencies.</p>
     */

    public CartDiscountValueAbsoluteBuilder plusMoney(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.add(builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Cent precision money values in different currencies.</p>
     */

    public CartDiscountValueAbsoluteBuilder withMoney(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.money = new ArrayList<>();
        this.money.add(builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> getMoney() {
        return this.money;
    }

    public CartDiscountValueAbsolute build() {
        Objects.requireNonNull(money, CartDiscountValueAbsolute.class + ": money is missing");
        return new CartDiscountValueAbsoluteImpl(money);
    }

    /**
     * builds CartDiscountValueAbsolute without checking for non null required values
     */
    public CartDiscountValueAbsolute buildUnchecked() {
        return new CartDiscountValueAbsoluteImpl(money);
    }

    public static CartDiscountValueAbsoluteBuilder of() {
        return new CartDiscountValueAbsoluteBuilder();
    }

    public static CartDiscountValueAbsoluteBuilder of(final CartDiscountValueAbsolute template) {
        CartDiscountValueAbsoluteBuilder builder = new CartDiscountValueAbsoluteBuilder();
        builder.money = template.getMoney();
        return builder;
    }

}
