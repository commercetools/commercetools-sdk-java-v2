
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderChangeCustomLineItemMoneyActionBuilder {

    private String customLineItemId;

    private com.commercetools.api.models.common.Money money;

    public StagedOrderChangeCustomLineItemMoneyActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public StagedOrderChangeCustomLineItemMoneyActionBuilder money(
            final com.commercetools.api.models.common.Money money) {
        this.money = money;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public com.commercetools.api.models.common.Money getMoney() {
        return this.money;
    }

    public StagedOrderChangeCustomLineItemMoneyAction build() {
        return new StagedOrderChangeCustomLineItemMoneyActionImpl(customLineItemId, money);
    }

    public static StagedOrderChangeCustomLineItemMoneyActionBuilder of() {
        return new StagedOrderChangeCustomLineItemMoneyActionBuilder();
    }

    public static StagedOrderChangeCustomLineItemMoneyActionBuilder of(
            final StagedOrderChangeCustomLineItemMoneyAction template) {
        StagedOrderChangeCustomLineItemMoneyActionBuilder builder = new StagedOrderChangeCustomLineItemMoneyActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.money = template.getMoney();
        return builder;
    }

}
