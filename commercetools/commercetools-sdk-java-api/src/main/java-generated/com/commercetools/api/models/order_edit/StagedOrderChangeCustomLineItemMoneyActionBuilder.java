
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderChangeCustomLineItemMoneyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeCustomLineItemMoneyAction stagedOrderChangeCustomLineItemMoneyAction = StagedOrderChangeCustomLineItemMoneyAction.builder()
 *             .money(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderChangeCustomLineItemMoneyActionBuilder
        implements Builder<StagedOrderChangeCustomLineItemMoneyAction> {

    @Nullable
    private String customLineItemId;

    @Nullable
    private String customLineItemKey;

    private com.commercetools.api.models.common.Money money;

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public StagedOrderChangeCustomLineItemMoneyActionBuilder customLineItemId(@Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     * @return Builder
     */

    public StagedOrderChangeCustomLineItemMoneyActionBuilder customLineItemKey(
            @Nullable final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
        return this;
    }

    /**
     *  <p>Value to set. Must not be empty. Can be a negative amount.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public StagedOrderChangeCustomLineItemMoneyActionBuilder money(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. Must not be empty. Can be a negative amount.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public StagedOrderChangeCustomLineItemMoneyActionBuilder withMoney(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. Must not be empty. Can be a negative amount.</p>
     * @param money value to be set
     * @return Builder
     */

    public StagedOrderChangeCustomLineItemMoneyActionBuilder money(
            final com.commercetools.api.models.common.Money money) {
        this.money = money;
        return this;
    }

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @Nullable
    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @Nullable
    public String getCustomLineItemKey() {
        return this.customLineItemKey;
    }

    /**
     *  <p>Value to set. Must not be empty. Can be a negative amount.</p>
     * @return money
     */

    public com.commercetools.api.models.common.Money getMoney() {
        return this.money;
    }

    /**
     * builds StagedOrderChangeCustomLineItemMoneyAction with checking for non-null required values
     * @return StagedOrderChangeCustomLineItemMoneyAction
     */
    public StagedOrderChangeCustomLineItemMoneyAction build() {
        Objects.requireNonNull(money, StagedOrderChangeCustomLineItemMoneyAction.class + ": money is missing");
        return new StagedOrderChangeCustomLineItemMoneyActionImpl(customLineItemId, customLineItemKey, money);
    }

    /**
     * builds StagedOrderChangeCustomLineItemMoneyAction without checking for non-null required values
     * @return StagedOrderChangeCustomLineItemMoneyAction
     */
    public StagedOrderChangeCustomLineItemMoneyAction buildUnchecked() {
        return new StagedOrderChangeCustomLineItemMoneyActionImpl(customLineItemId, customLineItemKey, money);
    }

    /**
     * factory method for an instance of StagedOrderChangeCustomLineItemMoneyActionBuilder
     * @return builder
     */
    public static StagedOrderChangeCustomLineItemMoneyActionBuilder of() {
        return new StagedOrderChangeCustomLineItemMoneyActionBuilder();
    }

    /**
     * create builder for StagedOrderChangeCustomLineItemMoneyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeCustomLineItemMoneyActionBuilder of(
            final StagedOrderChangeCustomLineItemMoneyAction template) {
        StagedOrderChangeCustomLineItemMoneyActionBuilder builder = new StagedOrderChangeCustomLineItemMoneyActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.customLineItemKey = template.getCustomLineItemKey();
        builder.money = template.getMoney();
        return builder;
    }

}
