
package com.commercetools.api.models.product_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductDiscountValueAbsoluteDraftBuilder implements Builder<ProductDiscountValueAbsoluteDraft> {

    private java.util.List<com.commercetools.api.models.common.CentPrecisionMoneyDraft> money;

    public ProductDiscountValueAbsoluteDraftBuilder money(
            final com.commercetools.api.models.common.CentPrecisionMoneyDraft... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }

    public ProductDiscountValueAbsoluteDraftBuilder money(
            final java.util.List<com.commercetools.api.models.common.CentPrecisionMoneyDraft> money) {
        this.money = money;
        return this;
    }

    public ProductDiscountValueAbsoluteDraftBuilder plusMoney(
            final com.commercetools.api.models.common.CentPrecisionMoneyDraft... money) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.addAll(Arrays.asList(money));
        return this;
    }

    public ProductDiscountValueAbsoluteDraftBuilder plusMoney(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyDraftBuilder, com.commercetools.api.models.common.CentPrecisionMoneyDraftBuilder> builder) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.add(builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyDraftBuilder.of()).build());
        return this;
    }

    public ProductDiscountValueAbsoluteDraftBuilder withMoney(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyDraftBuilder, com.commercetools.api.models.common.CentPrecisionMoneyDraftBuilder> builder) {
        this.money = new ArrayList<>();
        this.money.add(builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyDraftBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.common.CentPrecisionMoneyDraft> getMoney() {
        return this.money;
    }

    public ProductDiscountValueAbsoluteDraft build() {
        Objects.requireNonNull(money, ProductDiscountValueAbsoluteDraft.class + ": money is missing");
        return new ProductDiscountValueAbsoluteDraftImpl(money);
    }

    /**
     * builds ProductDiscountValueAbsoluteDraft without checking for non null required values
     */
    public ProductDiscountValueAbsoluteDraft buildUnchecked() {
        return new ProductDiscountValueAbsoluteDraftImpl(money);
    }

    public static ProductDiscountValueAbsoluteDraftBuilder of() {
        return new ProductDiscountValueAbsoluteDraftBuilder();
    }

    public static ProductDiscountValueAbsoluteDraftBuilder of(final ProductDiscountValueAbsoluteDraft template) {
        ProductDiscountValueAbsoluteDraftBuilder builder = new ProductDiscountValueAbsoluteDraftBuilder();
        builder.money = template.getMoney();
        return builder;
    }

}
