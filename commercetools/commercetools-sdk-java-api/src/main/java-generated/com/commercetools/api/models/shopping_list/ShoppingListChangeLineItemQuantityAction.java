
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ShoppingListChangeLineItemQuantityAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListChangeLineItemQuantityAction shoppingListChangeLineItemQuantityAction = ShoppingListChangeLineItemQuantityAction.builder()
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeLineItemQuantity")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListChangeLineItemQuantityActionImpl.class)
public interface ShoppingListChangeLineItemQuantityAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListChangeLineItemQuantityAction
     */
    String CHANGE_LINE_ITEM_QUANTITY = "changeLineItemQuantity";

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @JsonProperty("lineItemKey")
    public String getLineItemKey();

    /**
     *  <p>New value to set. If <code>0</code>, the ShoppingListLineItem is removed from the ShoppingList.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     */

    public void setLineItemKey(final String lineItemKey);

    /**
     *  <p>New value to set. If <code>0</code>, the ShoppingListLineItem is removed from the ShoppingList.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * factory method
     * @return instance of ShoppingListChangeLineItemQuantityAction
     */
    public static ShoppingListChangeLineItemQuantityAction of() {
        return new ShoppingListChangeLineItemQuantityActionImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListChangeLineItemQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListChangeLineItemQuantityAction of(final ShoppingListChangeLineItemQuantityAction template) {
        ShoppingListChangeLineItemQuantityActionImpl instance = new ShoppingListChangeLineItemQuantityActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public ShoppingListChangeLineItemQuantityAction copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListChangeLineItemQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListChangeLineItemQuantityAction deepCopy(
            @Nullable final ShoppingListChangeLineItemQuantityAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListChangeLineItemQuantityActionImpl instance = new ShoppingListChangeLineItemQuantityActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for ShoppingListChangeLineItemQuantityAction
     * @return builder
     */
    public static ShoppingListChangeLineItemQuantityActionBuilder builder() {
        return ShoppingListChangeLineItemQuantityActionBuilder.of();
    }

    /**
     * create builder for ShoppingListChangeLineItemQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListChangeLineItemQuantityActionBuilder builder(
            final ShoppingListChangeLineItemQuantityAction template) {
        return ShoppingListChangeLineItemQuantityActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListChangeLineItemQuantityAction(
            Function<ShoppingListChangeLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListChangeLineItemQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListChangeLineItemQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListChangeLineItemQuantityAction>";
            }
        };
    }
}
