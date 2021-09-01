
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderChangeCustomLineItemMoneyActionBuilder
        implements Builder<StagedOrderChangeCustomLineItemMoneyAction> {

    private String customLineItemId;

    private com.commercetools.api.models.common.Money money;

    public StagedOrderChangeCustomLineItemMoneyActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public StagedOrderChangeCustomLineItemMoneyActionBuilder money(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
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
        Objects.requireNonNull(customLineItemId,
            StagedOrderChangeCustomLineItemMoneyAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(money, StagedOrderChangeCustomLineItemMoneyAction.class + ": money is missing");
        return new StagedOrderChangeCustomLineItemMoneyActionImpl(customLineItemId, money);
    }

    /**
     * builds StagedOrderChangeCustomLineItemMoneyAction without checking for non null required values
     */
    public StagedOrderChangeCustomLineItemMoneyAction buildUnchecked() {
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
