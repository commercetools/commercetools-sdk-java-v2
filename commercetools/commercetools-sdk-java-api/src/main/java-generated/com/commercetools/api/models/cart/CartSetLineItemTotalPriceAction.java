
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the LineItem <code>totalPrice</code> and <code>price</code>, and changes the <code>priceMode</code> to <code>ExternalTotal</code> LineItemPriceMode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLineItemTotalPriceAction cartSetLineItemTotalPriceAction = CartSetLineItemTotalPriceAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetLineItemTotalPriceActionImpl.class)
public interface CartSetLineItemTotalPriceAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetLineItemTotalPriceAction
     */
    String SET_LINE_ITEM_TOTAL_PRICE = "setLineItemTotalPrice";

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Value to set. If <code>externalTotalPrice</code> is not given and the <code>priceMode</code> is <code>ExternalTotal</code>, the external price is unset and the <code>priceMode</code> is set to <code>Platform</code>.</p>
     * @return externalTotalPrice
     */
    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p>Value to set. If <code>externalTotalPrice</code> is not given and the <code>priceMode</code> is <code>ExternalTotal</code>, the external price is unset and the <code>priceMode</code> is set to <code>Platform</code>.</p>
     * @param externalTotalPrice value to be set
     */

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    /**
     * factory method
     * @return instance of CartSetLineItemTotalPriceAction
     */
    public static CartSetLineItemTotalPriceAction of() {
        return new CartSetLineItemTotalPriceActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetLineItemTotalPriceAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetLineItemTotalPriceAction of(final CartSetLineItemTotalPriceAction template) {
        CartSetLineItemTotalPriceActionImpl instance = new CartSetLineItemTotalPriceActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetLineItemTotalPriceAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetLineItemTotalPriceAction deepCopy(@Nullable final CartSetLineItemTotalPriceAction template) {
        if (template == null) {
            return null;
        }
        CartSetLineItemTotalPriceActionImpl instance = new CartSetLineItemTotalPriceActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalTotalPrice(Optional.ofNullable(template.getExternalTotalPrice())
                .map(com.commercetools.api.models.cart.ExternalLineItemTotalPrice::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartSetLineItemTotalPriceAction
     * @return builder
     */
    public static CartSetLineItemTotalPriceActionBuilder builder() {
        return CartSetLineItemTotalPriceActionBuilder.of();
    }

    /**
     * create builder for CartSetLineItemTotalPriceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetLineItemTotalPriceActionBuilder builder(final CartSetLineItemTotalPriceAction template) {
        return CartSetLineItemTotalPriceActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetLineItemTotalPriceAction(Function<CartSetLineItemTotalPriceAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemTotalPriceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemTotalPriceAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetLineItemTotalPriceAction>";
            }
        };
    }
}
