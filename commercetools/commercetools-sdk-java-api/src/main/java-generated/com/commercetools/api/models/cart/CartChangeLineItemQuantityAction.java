
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>When multiple shipping addresses are set for a Line Item, use the Remove LineItem and Add LineItem update action to change the shipping details. Since it is not possible for the API to infer how the overall change in the Line Item quantity should be distributed over the sub-quantities, the <code>shippingDetails</code> field is kept in its current state to avoid data loss.</p>
 *  <p>To change the Line Item quantity and shipping details together, use this update action in combination with the Set LineItemShippingDetails update action in a single Cart update command.</p>
 *  <p>The LineItem price is set as described in LineItem Price selection.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeLineItemQuantityAction cartChangeLineItemQuantityAction = CartChangeLineItemQuantityAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartChangeLineItemQuantityActionImpl.class)
public interface CartChangeLineItemQuantityAction extends CartUpdateAction {

    String CHANGE_LINE_ITEM_QUANTITY = "changeLineItemQuantity";

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>New value to set.</p>
     *  <p>If <code>0</code>, the Line Item is removed from the Cart.</p>
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Sets the LineItem <code>price</code> to the given value when changing the quantity of a Line Item with the <code>ExternalPrice</code> LineItemPriceMode.</p>
     *  <p>The LineItem price is updated as described in LineItem Price selection.</p>
     */
    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> to the given value when changing the quantity of a Line Item with the <code>ExternalTotal</code> LineItemPriceMode.</p>
     */
    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    public void setLineItemId(final String lineItemId);

    public void setQuantity(final Long quantity);

    public void setExternalPrice(final Money externalPrice);

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    public static CartChangeLineItemQuantityAction of() {
        return new CartChangeLineItemQuantityActionImpl();
    }

    public static CartChangeLineItemQuantityAction of(final CartChangeLineItemQuantityAction template) {
        CartChangeLineItemQuantityActionImpl instance = new CartChangeLineItemQuantityActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setExternalPrice(template.getExternalPrice());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        return instance;
    }

    public static CartChangeLineItemQuantityActionBuilder builder() {
        return CartChangeLineItemQuantityActionBuilder.of();
    }

    public static CartChangeLineItemQuantityActionBuilder builder(final CartChangeLineItemQuantityAction template) {
        return CartChangeLineItemQuantityActionBuilder.of(template);
    }

    default <T> T withCartChangeLineItemQuantityAction(Function<CartChangeLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartChangeLineItemQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartChangeLineItemQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartChangeLineItemQuantityAction>";
            }
        };
    }
}
