
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String SET_LINE_ITEM_TOTAL_PRICE = "setLineItemTotalPrice";

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Value to set. If <code>externalTotalPrice</code> is not given and the <code>priceMode</code> is <code>ExternalTotal</code>, the external price is unset and the <code>priceMode</code> is set to <code>Platform</code>.</p>
     */
    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    public void setLineItemId(final String lineItemId);

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    public static CartSetLineItemTotalPriceAction of() {
        return new CartSetLineItemTotalPriceActionImpl();
    }

    public static CartSetLineItemTotalPriceAction of(final CartSetLineItemTotalPriceAction template) {
        CartSetLineItemTotalPriceActionImpl instance = new CartSetLineItemTotalPriceActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        return instance;
    }

    public static CartSetLineItemTotalPriceActionBuilder builder() {
        return CartSetLineItemTotalPriceActionBuilder.of();
    }

    public static CartSetLineItemTotalPriceActionBuilder builder(final CartSetLineItemTotalPriceAction template) {
        return CartSetLineItemTotalPriceActionBuilder.of(template);
    }

    default <T> T withCartSetLineItemTotalPriceAction(Function<CartSetLineItemTotalPriceAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemTotalPriceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemTotalPriceAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetLineItemTotalPriceAction>";
            }
        };
    }
}
