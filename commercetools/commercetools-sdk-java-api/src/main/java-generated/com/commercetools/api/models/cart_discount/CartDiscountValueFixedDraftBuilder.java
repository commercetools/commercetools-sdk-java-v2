
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountValueFixedDraftBuilder implements Builder<CartDiscountValueFixedDraft> {

    private java.util.List<com.commercetools.api.models.common.Money> money;

    public CartDiscountValueFixedDraftBuilder money(final com.commercetools.api.models.common.Money... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }

    public CartDiscountValueFixedDraftBuilder money(
            final java.util.List<com.commercetools.api.models.common.Money> money) {
        this.money = money;
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
