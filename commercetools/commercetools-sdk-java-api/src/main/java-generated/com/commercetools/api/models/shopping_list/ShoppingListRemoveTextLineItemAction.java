
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListRemoveTextLineItemAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListRemoveTextLineItemAction shoppingListRemoveTextLineItemAction = ShoppingListRemoveTextLineItemAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeTextLineItem")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListRemoveTextLineItemActionImpl.class)
public interface ShoppingListRemoveTextLineItemAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListRemoveTextLineItemAction
     */
    String REMOVE_TEXT_LINE_ITEM = "removeTextLineItem";

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return textLineItemId
     */

    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return textLineItemKey
     */

    @JsonProperty("textLineItemKey")
    public String getTextLineItemKey();

    /**
     *  <p>Amount to remove from the <code>quantity</code> of the TextLineItem. If not set, the TextLineItem is removed from the ShoppingList. If this value matches or exceeds the current <code>quantity</code> of the TextLineItem, the TextLineItem is removed from the ShoppingList.</p>
     * @return quantity
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemId value to be set
     */

    public void setTextLineItemId(final String textLineItemId);

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemKey value to be set
     */

    public void setTextLineItemKey(final String textLineItemKey);

    /**
     *  <p>Amount to remove from the <code>quantity</code> of the TextLineItem. If not set, the TextLineItem is removed from the ShoppingList. If this value matches or exceeds the current <code>quantity</code> of the TextLineItem, the TextLineItem is removed from the ShoppingList.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * factory method
     * @return instance of ShoppingListRemoveTextLineItemAction
     */
    public static ShoppingListRemoveTextLineItemAction of() {
        return new ShoppingListRemoveTextLineItemActionImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListRemoveTextLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListRemoveTextLineItemAction of(final ShoppingListRemoveTextLineItemAction template) {
        ShoppingListRemoveTextLineItemActionImpl instance = new ShoppingListRemoveTextLineItemActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setTextLineItemKey(template.getTextLineItemKey());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public ShoppingListRemoveTextLineItemAction copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListRemoveTextLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListRemoveTextLineItemAction deepCopy(
            @Nullable final ShoppingListRemoveTextLineItemAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListRemoveTextLineItemActionImpl instance = new ShoppingListRemoveTextLineItemActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setTextLineItemKey(template.getTextLineItemKey());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for ShoppingListRemoveTextLineItemAction
     * @return builder
     */
    public static ShoppingListRemoveTextLineItemActionBuilder builder() {
        return ShoppingListRemoveTextLineItemActionBuilder.of();
    }

    /**
     * create builder for ShoppingListRemoveTextLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListRemoveTextLineItemActionBuilder builder(
            final ShoppingListRemoveTextLineItemAction template) {
        return ShoppingListRemoveTextLineItemActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListRemoveTextLineItemAction(Function<ShoppingListRemoveTextLineItemAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListRemoveTextLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListRemoveTextLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListRemoveTextLineItemAction>";
            }
        };
    }
}
