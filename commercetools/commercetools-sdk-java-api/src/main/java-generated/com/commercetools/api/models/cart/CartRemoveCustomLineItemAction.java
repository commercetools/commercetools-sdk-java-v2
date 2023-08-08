
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action does not support specifying quantities, unlike the Remove LineItem update action.</p>
 *  <p>If <code>shippingDetails</code> must be partially removed, use the Change CustomLineItem Quantity update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartRemoveCustomLineItemAction cartRemoveCustomLineItemAction = CartRemoveCustomLineItemAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartRemoveCustomLineItemActionImpl.class)
public interface CartRemoveCustomLineItemAction extends CartUpdateAction {

    /**
     * discriminator value for CartRemoveCustomLineItemAction
     */
    String REMOVE_CUSTOM_LINE_ITEM = "removeCustomLineItem";

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
     * factory method
     * @return instance of CartRemoveCustomLineItemAction
     */
    public static CartRemoveCustomLineItemAction of() {
        return new CartRemoveCustomLineItemActionImpl();
    }

    /**
     * factory method to create a shallow copy CartRemoveCustomLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartRemoveCustomLineItemAction of(final CartRemoveCustomLineItemAction template) {
        CartRemoveCustomLineItemActionImpl instance = new CartRemoveCustomLineItemActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartRemoveCustomLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartRemoveCustomLineItemAction deepCopy(@Nullable final CartRemoveCustomLineItemAction template) {
        if (template == null) {
            return null;
        }
        CartRemoveCustomLineItemActionImpl instance = new CartRemoveCustomLineItemActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        return instance;
    }

    /**
     * builder factory method for CartRemoveCustomLineItemAction
     * @return builder
     */
    public static CartRemoveCustomLineItemActionBuilder builder() {
        return CartRemoveCustomLineItemActionBuilder.of();
    }

    /**
     * create builder for CartRemoveCustomLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartRemoveCustomLineItemActionBuilder builder(final CartRemoveCustomLineItemAction template) {
        return CartRemoveCustomLineItemActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartRemoveCustomLineItemAction(Function<CartRemoveCustomLineItemAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartRemoveCustomLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartRemoveCustomLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartRemoveCustomLineItemAction>";
            }
        };
    }
}
