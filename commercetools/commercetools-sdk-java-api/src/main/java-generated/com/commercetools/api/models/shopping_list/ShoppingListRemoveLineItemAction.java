
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Produces the Shopping List Line Item Removed Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListRemoveLineItemAction shoppingListRemoveLineItemAction = ShoppingListRemoveLineItemAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeLineItem")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListRemoveLineItemActionImpl.class)
public interface ShoppingListRemoveLineItemAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListRemoveLineItemAction
     */
    String REMOVE_LINE_ITEM = "removeLineItem";

    /**
     *  <p>The <code>id</code> of the ShoppingListLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>The <code>key</code> of the ShoppingListLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @JsonProperty("lineItemKey")
    public String getLineItemKey();

    /**
     *  <p>Amount to remove from the <code>quantity</code> of the ShoppingListLineItem. If not set, the ShoppingListLineItem is removed from the ShoppingList. If this value matches or exceeds the current <code>quantity</code> of the ShoppingListLineItem, the ShoppingListLineItem is removed from the ShoppingList.</p>
     * @return quantity
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>The <code>id</code> of the ShoppingListLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p>The <code>key</code> of the ShoppingListLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     */

    public void setLineItemKey(final String lineItemKey);

    /**
     *  <p>Amount to remove from the <code>quantity</code> of the ShoppingListLineItem. If not set, the ShoppingListLineItem is removed from the ShoppingList. If this value matches or exceeds the current <code>quantity</code> of the ShoppingListLineItem, the ShoppingListLineItem is removed from the ShoppingList.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * factory method
     * @return instance of ShoppingListRemoveLineItemAction
     */
    public static ShoppingListRemoveLineItemAction of() {
        return new ShoppingListRemoveLineItemActionImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListRemoveLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListRemoveLineItemAction of(final ShoppingListRemoveLineItemAction template) {
        ShoppingListRemoveLineItemActionImpl instance = new ShoppingListRemoveLineItemActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public ShoppingListRemoveLineItemAction copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListRemoveLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListRemoveLineItemAction deepCopy(@Nullable final ShoppingListRemoveLineItemAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListRemoveLineItemActionImpl instance = new ShoppingListRemoveLineItemActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for ShoppingListRemoveLineItemAction
     * @return builder
     */
    public static ShoppingListRemoveLineItemActionBuilder builder() {
        return ShoppingListRemoveLineItemActionBuilder.of();
    }

    /**
     * create builder for ShoppingListRemoveLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListRemoveLineItemActionBuilder builder(final ShoppingListRemoveLineItemAction template) {
        return ShoppingListRemoveLineItemActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListRemoveLineItemAction(Function<ShoppingListRemoveLineItemAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListRemoveLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListRemoveLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListRemoveLineItemAction>";
            }
        };
    }
}
