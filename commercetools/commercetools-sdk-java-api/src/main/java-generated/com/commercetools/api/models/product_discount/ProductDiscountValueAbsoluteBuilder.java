
package com.commercetools.api.models.product_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductDiscountValueAbsoluteBuilder implements Builder<ProductDiscountValueAbsolute> {

    private java.util.List<com.commercetools.api.models.common.TypedMoney> money;

    public ProductDiscountValueAbsoluteBuilder money(final com.commercetools.api.models.common.TypedMoney... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }

    public ProductDiscountValueAbsoluteBuilder money(
            final java.util.List<com.commercetools.api.models.common.TypedMoney> money) {
        this.money = money;
        return this;
    }

    public ProductDiscountValueAbsoluteBuilder plusMoney(
            final com.commercetools.api.models.common.TypedMoney... money) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.addAll(Arrays.asList(money));
        return this;
    }

    public ProductDiscountValueAbsoluteBuilder plusMoney(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.add(builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build());
        return this;
    }

    public ProductDiscountValueAbsoluteBuilder withMoney(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.money = new ArrayList<>();
        this.money.add(builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.common.TypedMoney> getMoney() {
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
