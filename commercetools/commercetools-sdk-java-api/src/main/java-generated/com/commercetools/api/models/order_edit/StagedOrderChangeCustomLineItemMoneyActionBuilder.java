
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderChangeCustomLineItemMoneyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeCustomLineItemMoneyAction stagedOrderChangeCustomLineItemMoneyAction = StagedOrderChangeCustomLineItemMoneyAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .money(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderChangeCustomLineItemMoneyActionBuilder
        implements Builder<StagedOrderChangeCustomLineItemMoneyAction> {

    private String customLineItemId;

    private com.commercetools.api.models.common.Money money;

    /**
     *
     */

    public StagedOrderChangeCustomLineItemMoneyActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public StagedOrderChangeCustomLineItemMoneyActionBuilder money(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

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
