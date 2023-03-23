
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
 *             .textLineItemId("{textLineItemId}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListChangeTextLineItemQuantityActionImpl.class)
public interface MyShoppingListChangeTextLineItemQuantityAction extends MyShoppingListUpdateAction {

    String CHANGE_TEXT_LINE_ITEM_QUANTITY = "changeTextLineItemQuantity";

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @return textLineItemId
     */
    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    /**
     *  <p>New value to set. If <code>0</code>, the TextLineItem is removed from the ShoppingList.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    public void setTextLineItemId(final String textLineItemId);

    public void setQuantity(final Long quantity);

    public static MyShoppingListChangeTextLineItemQuantityAction of() {
        return new MyShoppingListChangeTextLineItemQuantityActionImpl();
    }

    public static MyShoppingListChangeTextLineItemQuantityAction of(
            final MyShoppingListChangeTextLineItemQuantityAction template) {
        MyShoppingListChangeTextLineItemQuantityActionImpl instance = new MyShoppingListChangeTextLineItemQuantityActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static MyShoppingListChangeTextLineItemQuantityActionBuilder builder() {
        return MyShoppingListChangeTextLineItemQuantityActionBuilder.of();
    }

    public static MyShoppingListChangeTextLineItemQuantityActionBuilder builder(
            final MyShoppingListChangeTextLineItemQuantityAction template) {
        return MyShoppingListChangeTextLineItemQuantityActionBuilder.of(template);
    }

    default <T> T withMyShoppingListChangeTextLineItemQuantityAction(
            Function<MyShoppingListChangeTextLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListChangeTextLineItemQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListChangeTextLineItemQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListChangeTextLineItemQuantityAction>";
            }
        };
    }
}
