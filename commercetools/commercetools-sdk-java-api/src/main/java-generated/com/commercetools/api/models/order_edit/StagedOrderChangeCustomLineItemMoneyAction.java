
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * StagedOrderChangeCustomLineItemMoneyAction
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("changeCustomLineItemMoney")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderChangeCustomLineItemMoneyActionImpl.class)
public interface StagedOrderChangeCustomLineItemMoneyAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderChangeCustomLineItemMoneyAction
     */
    String CHANGE_CUSTOM_LINE_ITEM_MONEY = "changeCustomLineItemMoney";

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @JsonProperty("customLineItemKey")
    public String getCustomLineItemKey();

    /**
     *  <p>Value to set. Must not be empty. Can be a negative amount.</p>
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public Money getMoney();

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     */

    public void setCustomLineItemKey(final String customLineItemKey);

    /**
     *  <p>Value to set. Must not be empty. Can be a negative amount.</p>
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
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setMoney(template.getMoney());
        return instance;
    }

    public StagedOrderChangeCustomLineItemMoneyAction copyDeep();

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
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
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
