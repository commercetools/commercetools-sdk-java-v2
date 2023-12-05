
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListChangeTextLineItemQuantityAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListChangeTextLineItemQuantityAction myShoppingListChangeTextLineItemQuantityAction = MyShoppingListChangeTextLineItemQuantityAction.builder()
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListChangeTextLineItemQuantityActionImpl.class)
public interface MyShoppingListChangeTextLineItemQuantityAction extends MyShoppingListUpdateAction {

    /**
     * discriminator value for MyShoppingListChangeTextLineItemQuantityAction
     */
    String CHANGE_TEXT_LINE_ITEM_QUANTITY = "changeTextLineItemQuantity";

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
     *  <p>New value to set. If <code>0</code>, the TextLineItem is removed from the ShoppingList.</p>
     * @return quantity
     */
    @NotNull
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
     *  <p>New value to set. If <code>0</code>, the TextLineItem is removed from the ShoppingList.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * factory method
     * @return instance of MyShoppingListChangeTextLineItemQuantityAction
     */
    public static MyShoppingListChangeTextLineItemQuantityAction of() {
        return new MyShoppingListChangeTextLineItemQuantityActionImpl();
    }

    /**
     * factory method to create a shallow copy MyShoppingListChangeTextLineItemQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListChangeTextLineItemQuantityAction of(
            final MyShoppingListChangeTextLineItemQuantityAction template) {
        MyShoppingListChangeTextLineItemQuantityActionImpl instance = new MyShoppingListChangeTextLineItemQuantityActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setTextLineItemKey(template.getTextLineItemKey());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyShoppingListChangeTextLineItemQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyShoppingListChangeTextLineItemQuantityAction deepCopy(
            @Nullable final MyShoppingListChangeTextLineItemQuantityAction template) {
        if (template == null) {
            return null;
        }
        MyShoppingListChangeTextLineItemQuantityActionImpl instance = new MyShoppingListChangeTextLineItemQuantityActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setTextLineItemKey(template.getTextLineItemKey());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for MyShoppingListChangeTextLineItemQuantityAction
     * @return builder
     */
    public static MyShoppingListChangeTextLineItemQuantityActionBuilder builder() {
        return MyShoppingListChangeTextLineItemQuantityActionBuilder.of();
    }

    /**
     * create builder for MyShoppingListChangeTextLineItemQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListChangeTextLineItemQuantityActionBuilder builder(
            final MyShoppingListChangeTextLineItemQuantityAction template) {
        return MyShoppingListChangeTextLineItemQuantityActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListChangeTextLineItemQuantityAction(
            Function<MyShoppingListChangeTextLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListChangeTextLineItemQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListChangeTextLineItemQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListChangeTextLineItemQuantityAction>";
            }
        };
    }
}
