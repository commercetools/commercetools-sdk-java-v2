
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartChangeCustomLineItemMoneyActionBuilder {

    private String customLineItemId;

    private com.commercetools.api.models.common.Money money;

    public CartChangeCustomLineItemMoneyActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public CartChangeCustomLineItemMoneyActionBuilder money(final com.commercetools.api.models.common.Money money) {
        this.money = money;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public com.commercetools.api.models.common.Money getMoney() {
        return this.money;
    }

    public CartChangeCustomLineItemMoneyAction build() {
        return new CartChangeCustomLineItemMoneyActionImpl(customLineItemId, money);
    }

    public static CartChangeCustomLineItemMoneyActionBuilder of() {
        return new CartChangeCustomLineItemMoneyActionBuilder();
    }

    public static CartChangeCustomLineItemMoneyActionBuilder of(final CartChangeCustomLineItemMoneyAction template) {
        CartChangeCustomLineItemMoneyActionBuilder builder = new CartChangeCustomLineItemMoneyActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.money = template.getMoney();
        return builder;
    }

}
