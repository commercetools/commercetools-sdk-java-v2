
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderChangeCustomLineItemMoneyAction
 *
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
@JsonDeserialize(as = StagedOrderChangeCustomLineItemMoneyActionImpl.class)
public interface StagedOrderChangeCustomLineItemMoneyAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderChangeCustomLineItemMoneyAction
     */
    String CHANGE_CUSTOM_LINE_ITEM_MONEY = "changeCustomLineItemMoney";

    /**
     *
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>Draft type that stores amounts only in cent precision for the specified currency.</p>
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public Money getMoney();

    /**
     * set customLineItemId
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p>Draft type that stores amounts only in cent precision for the specified currency.</p>
     * @param money value to be set
     */

    public void setMoney(final Money money);

    /**
     * factory method
     * @return instance of StagedOrderChangeCustomLineItemMoneyAction
     */
    public static StagedOrderChangeCustomLineItemMoneyAction of() {
        return new StagedOrderChangeCustomLineItemMoneyActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderChangeCustomLineItemMoneyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderChangeCustomLineItemMoneyAction of(
            final StagedOrderChangeCustomLineItemMoneyAction template) {
        StagedOrderChangeCustomLineItemMoneyActionImpl instance = new StagedOrderChangeCustomLineItemMoneyActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setMoney(template.getMoney());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderChangeCustomLineItemMoneyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderChangeCustomLineItemMoneyAction deepCopy(
            @Nullable final StagedOrderChangeCustomLineItemMoneyAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderChangeCustomLineItemMoneyActionImpl instance = new StagedOrderChangeCustomLineItemMoneyActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setMoney(com.commercetools.api.models.common.Money.deepCopy(template.getMoney()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderChangeCustomLineItemMoneyAction
     * @return builder
     */
    public static StagedOrderChangeCustomLineItemMoneyActionBuilder builder() {
        return StagedOrderChangeCustomLineItemMoneyActionBuilder.of();
    }

    /**
     * create builder for StagedOrderChangeCustomLineItemMoneyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeCustomLineItemMoneyActionBuilder builder(
            final StagedOrderChangeCustomLineItemMoneyAction template) {
        return StagedOrderChangeCustomLineItemMoneyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderChangeCustomLineItemMoneyAction(
            Function<StagedOrderChangeCustomLineItemMoneyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangeCustomLineItemMoneyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangeCustomLineItemMoneyAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderChangeCustomLineItemMoneyAction>";
            }
        };
    }
}
