
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>When multiple shipping addresses are set for a Custom Line Item, use the Add CustomLineItem update action to change the shipping details. Since it is not possible for the API to infer how the overall change in the Custom Line Item quantity should be distributed over the sub-quantities, the <code>shippingDetails</code> field is kept in its current state to avoid data loss.</p>
 *  <p>To change the Custom Line Item quantity and shipping details together, use this update action in combination with the Set CustomLineItemShippingDetails update action in a single Cart update command.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeCustomLineItemQuantityAction cartChangeCustomLineItemQuantityAction = CartChangeCustomLineItemQuantityAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartChangeCustomLineItemQuantityActionImpl.class)
public interface CartChangeCustomLineItemQuantityAction extends CartUpdateAction {

    String CHANGE_CUSTOM_LINE_ITEM_QUANTITY = "changeCustomLineItemQuantity";

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>New value to set.</p>
     *  <p>If <code>0</code>, the Custom Line Item is removed from the Cart.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    public void setCustomLineItemId(final String customLineItemId);

    public void setQuantity(final Long quantity);

    public static CartChangeCustomLineItemQuantityAction of() {
        return new CartChangeCustomLineItemQuantityActionImpl();
    }

    public static CartChangeCustomLineItemQuantityAction of(final CartChangeCustomLineItemQuantityAction template) {
        CartChangeCustomLineItemQuantityActionImpl instance = new CartChangeCustomLineItemQuantityActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static CartChangeCustomLineItemQuantityActionBuilder builder() {
        return CartChangeCustomLineItemQuantityActionBuilder.of();
    }

    public static CartChangeCustomLineItemQuantityActionBuilder builder(
            final CartChangeCustomLineItemQuantityAction template) {
        return CartChangeCustomLineItemQuantityActionBuilder.of(template);
    }

    default <T> T withCartChangeCustomLineItemQuantityAction(
            Function<CartChangeCustomLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartChangeCustomLineItemQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartChangeCustomLineItemQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartChangeCustomLineItemQuantityAction>";
            }
        };
    }
}
