
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
     * @param money value to be set
     * @return Builder
     */

    public CartDiscountValueAbsoluteBuilder money(
            final com.commercetools.api.models.common.CentPrecisionMoney... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }

    /**
     *  <p>Cent precision money values in different currencies.</p>
     * @param money value to be set
     * @return Builder
     */

    public CartDiscountValueAbsoluteBuilder money(
            final java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money) {
        this.money = money;
        return this;
    }

    /**
     *  <p>Cent precision money values in different currencies.</p>
     * @param money value to be set
     * @return Builder
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
     * @param builder function to build the money value
     * @return Builder
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
     * @param builder function to build the money value
     * @return Builder
     */

    public CartDiscountValueAbsoluteBuilder withMoney(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.money = new ArrayList<>();
        this.money.add(builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Cent precision money values in different currencies.</p>
     * @return money
     */

    public java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> getMoney() {
        return this.money;
    }

    /**
     * builds CartDiscountValueAbsolute with checking for non-null required values
     * @return CartDiscountValueAbsolute
     */
    public CartDiscountValueAbsolute build() {
        Objects.requireNonNull(money, CartDiscountValueAbsolute.class + ": money is missing");
        return new CartDiscountValueAbsoluteImpl(money);
    }

    /**
     * builds CartDiscountValueAbsolute without checking for non-null required values
     * @return CartDiscountValueAbsolute
     */
    public CartDiscountValueAbsolute buildUnchecked() {
        return new CartDiscountValueAbsoluteImpl(money);
    }

    /**
     * factory method for an instance of CartDiscountValueAbsoluteBuilder
     * @return builder
     */
    public static CartDiscountValueAbsoluteBuilder of() {
        return new CartDiscountValueAbsoluteBuilder();
    }

    /**
     * create builder for CartDiscountValueAbsolute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueAbsoluteBuilder of(final CartDiscountValueAbsolute template) {
        CartDiscountValueAbsoluteBuilder builder = new CartDiscountValueAbsoluteBuilder();
        builder.money = template.getMoney();
        return builder;
    }

}
