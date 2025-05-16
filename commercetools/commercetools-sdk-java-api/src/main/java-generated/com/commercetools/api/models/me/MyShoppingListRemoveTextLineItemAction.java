
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListRemoveTextLineItemAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListRemoveTextLineItemAction myShoppingListRemoveTextLineItemAction = MyShoppingListRemoveTextLineItemAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeTextLineItem")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListRemoveTextLineItemActionImpl.class)
public interface MyShoppingListRemoveTextLineItemAction extends MyShoppingListUpdateAction {

    /**
     * discriminator value for MyShoppingListRemoveTextLineItemAction
     */
    String REMOVE_TEXT_LINE_ITEM = "removeTextLineItem";

    /**
     *  <p>The <code>id</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return textLineItemId
     */

    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    /**
     *  <p>The <code>key</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
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
     *  <p>The <code>id</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemId value to be set
     */

    public void setTextLineItemId(final String textLineItemId);

    /**
     *  <p>The <code>key</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
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
     * @return instance of MyShoppingListRemoveTextLineItemAction
     */
    public static MyShoppingListRemoveTextLineItemAction of() {
        return new MyShoppingListRemoveTextLineItemActionImpl();
    }

    /**
     * factory method to create a shallow copy MyShoppingListRemoveTextLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListRemoveTextLineItemAction of(final MyShoppingListRemoveTextLineItemAction template) {
        MyShoppingListRemoveTextLineItemActionImpl instance = new MyShoppingListRemoveTextLineItemActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setTextLineItemKey(template.getTextLineItemKey());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public MyShoppingListRemoveTextLineItemAction copyDeep();

    /**
     * factory method to create a deep copy of MyShoppingListRemoveTextLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyShoppingListRemoveTextLineItemAction deepCopy(
            @Nullable final MyShoppingListRemoveTextLineItemAction template) {
        if (template == null) {
            return null;
        }
        MyShoppingListRemoveTextLineItemActionImpl instance = new MyShoppingListRemoveTextLineItemActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setTextLineItemKey(template.getTextLineItemKey());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for MyShoppingListRemoveTextLineItemAction
     * @return builder
     */
    public static MyShoppingListRemoveTextLineItemActionBuilder builder() {
        return MyShoppingListRemoveTextLineItemActionBuilder.of();
    }

    /**
     * create builder for MyShoppingListRemoveTextLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListRemoveTextLineItemActionBuilder builder(
            final MyShoppingListRemoveTextLineItemAction template) {
        return MyShoppingListRemoveTextLineItemActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListRemoveTextLineItemAction(
            Function<MyShoppingListRemoveTextLineItemAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListRemoveTextLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListRemoveTextLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListRemoveTextLineItemAction>";
            }
        };
    }
}
