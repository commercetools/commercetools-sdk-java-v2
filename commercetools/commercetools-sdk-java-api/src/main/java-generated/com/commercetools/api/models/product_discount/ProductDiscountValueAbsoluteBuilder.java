
package com.commercetools.api.models.product_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ProductDiscountValueAbsolute productDiscountValueAbsolute = ProductDiscountValueAbsolute.builder()
           .plusMoney(moneyBuilder -> moneyBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountValueAbsoluteBuilder implements Builder<ProductDiscountValueAbsolute> {

    private java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money;

    /**
     *  <p>Money values in different currencies. An absolute ProductDiscount will only match a price if this array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     */

    public ProductDiscountValueAbsoluteBuilder money(
            final com.commercetools.api.models.common.CentPrecisionMoney... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }

    /**
     *  <p>Money values in different currencies. An absolute ProductDiscount will only match a price if this array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     */

    public ProductDiscountValueAbsoluteBuilder money(
            final java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money) {
        this.money = money;
        return this;
    }

    /**
     *  <p>Money values in different currencies. An absolute ProductDiscount will only match a price if this array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     */

    public ProductDiscountValueAbsoluteBuilder plusMoney(
            final com.commercetools.api.models.common.CentPrecisionMoney... money) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.addAll(Arrays.asList(money));
        return this;
    }

    /**
     *  <p>Money values in different currencies. An absolute ProductDiscount will only match a price if this array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     */

    public ProductDiscountValueAbsoluteBuilder plusMoney(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.add(builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Money values in different currencies. An absolute ProductDiscount will only match a price if this array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     */

    public ProductDiscountValueAbsoluteBuilder withMoney(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.money = new ArrayList<>();
        this.money.add(builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> getMoney() {
        return this.money;
    }

    public ProductDiscountValueAbsolute build() {
        Objects.requireNonNull(money, ProductDiscountValueAbsolute.class + ": money is missing");
        return new ProductDiscountValueAbsoluteImpl(money);
    }

    /**
     * builds ProductDiscountValueAbsolute without checking for non null required values
     */
    public ProductDiscountValueAbsolute buildUnchecked() {
        return new ProductDiscountValueAbsoluteImpl(money);
    }

    public static ProductDiscountValueAbsoluteBuilder of() {
        return new ProductDiscountValueAbsoluteBuilder();
    }

    public static ProductDiscountValueAbsoluteBuilder of(final ProductDiscountValueAbsolute template) {
        ProductDiscountValueAbsoluteBuilder builder = new ProductDiscountValueAbsoluteBuilder();
        builder.money = template.getMoney();
        return builder;
    }

}
