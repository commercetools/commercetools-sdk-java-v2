
package com.commercetools.importapi.models.orders;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountedLineItemPortionBuilder {

    private com.commercetools.importapi.models.common.CartDiscountKeyReference discount;

    private com.commercetools.importapi.models.common.Money discountedAmount;

    public DiscountedLineItemPortionBuilder discount(
            final com.commercetools.importapi.models.common.CartDiscountKeyReference discount) {
        this.discount = discount;
        return this;
    }

    public DiscountedLineItemPortionBuilder discountedAmount(
            final com.commercetools.importapi.models.common.Money discountedAmount) {
        this.discountedAmount = discountedAmount;
        return this;
    }

    public com.commercetools.importapi.models.common.CartDiscountKeyReference getDiscount() {
        return this.discount;
    }

    public com.commercetools.importapi.models.common.Money getDiscountedAmount() {
        return this.discountedAmount;
    }

    public DiscountedLineItemPortion build() {
        return new DiscountedLineItemPortionImpl(discount, discountedAmount);
    }

    public static DiscountedLineItemPortionBuilder of() {
        return new DiscountedLineItemPortionBuilder();
    }

    public static DiscountedLineItemPortionBuilder of(final DiscountedLineItemPortion template) {
        DiscountedLineItemPortionBuilder builder = new DiscountedLineItemPortionBuilder();
        builder.discount = template.getDiscount();
        builder.discountedAmount = template.getDiscountedAmount();
        return builder;
    }

}
