
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartChangeCustomLineItemMoneyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeCustomLineItemMoneyAction cartChangeCustomLineItemMoneyAction = CartChangeCustomLineItemMoneyAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .money(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartChangeCustomLineItemMoneyActionImpl.class)
public interface CartChangeCustomLineItemMoneyAction extends CartUpdateAction {

    /**
     * discriminator value for CartChangeCustomLineItemMoneyAction
     */
    String CHANGE_CUSTOM_LINE_ITEM_MONEY = "changeCustomLineItemMoney";

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>Value to set. Must not be empty. Can be a negative amount.</p>
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public Money getMoney();

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p>Value to set. Must not be empty. Can be a negative amount.</p>
     * @param money value to be set
     */

    public void setMoney(final Money money);

    /**
     * factory method
     * @return instance of CartChangeCustomLineItemMoneyAction
     */
    public static CartChangeCustomLineItemMoneyAction of() {
        return new CartChangeCustomLineItemMoneyActionImpl();
    }

    /**
     * factory method to create a shallow copy CartChangeCustomLineItemMoneyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartChangeCustomLineItemMoneyAction of(final CartChangeCustomLineItemMoneyAction template) {
        CartChangeCustomLineItemMoneyActionImpl instance = new CartChangeCustomLineItemMoneyActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setMoney(template.getMoney());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartChangeCustomLineItemMoneyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartChangeCustomLineItemMoneyAction deepCopy(
            @Nullable final CartChangeCustomLineItemMoneyAction template) {
        if (template == null) {
            return null;
        }
        CartChangeCustomLineItemMoneyActionImpl instance = new CartChangeCustomLineItemMoneyActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setMoney(com.commercetools.api.models.common.Money.deepCopy(template.getMoney()));
        return instance;
    }

    /**
     * builder factory method for CartChangeCustomLineItemMoneyAction
     * @return builder
     */
    public static CartChangeCustomLineItemMoneyActionBuilder builder() {
        return CartChangeCustomLineItemMoneyActionBuilder.of();
    }

    /**
     * create builder for CartChangeCustomLineItemMoneyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartChangeCustomLineItemMoneyActionBuilder builder(
            final CartChangeCustomLineItemMoneyAction template) {
        return CartChangeCustomLineItemMoneyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartChangeCustomLineItemMoneyAction(Function<CartChangeCustomLineItemMoneyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartChangeCustomLineItemMoneyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartChangeCustomLineItemMoneyAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartChangeCustomLineItemMoneyAction>";
            }
        };
    }
}
