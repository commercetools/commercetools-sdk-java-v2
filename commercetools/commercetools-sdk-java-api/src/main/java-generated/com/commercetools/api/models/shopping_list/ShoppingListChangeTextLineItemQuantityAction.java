package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemQuantityActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * ShoppingListChangeTextLineItemQuantityAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListChangeTextLineItemQuantityAction shoppingListChangeTextLineItemQuantityAction = ShoppingListChangeTextLineItemQuantityAction.builder()
 *             .textLineItemId("{textLineItemId}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ShoppingListChangeTextLineItemQuantityActionImpl.class)
public interface ShoppingListChangeTextLineItemQuantityAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListChangeTextLineItemQuantityAction
     */
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

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @param textLineItemId value to be set
     */
    
    public void setTextLineItemId(final String textLineItemId);
    
    
    /**
     *  <p>New value to set. If <code>0</code>, the TextLineItem is removed from the ShoppingList.</p>
     * @param quantity value to be set
     */
    
    public void setQuantity(final Long quantity);
    

    /**
     * factory method
     * @return instance of ShoppingListChangeTextLineItemQuantityAction
     */
    public static ShoppingListChangeTextLineItemQuantityAction of(){
        return new ShoppingListChangeTextLineItemQuantityActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ShoppingListChangeTextLineItemQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListChangeTextLineItemQuantityAction of(final ShoppingListChangeTextLineItemQuantityAction template) {
        ShoppingListChangeTextLineItemQuantityActionImpl instance = new ShoppingListChangeTextLineItemQuantityActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShoppingListChangeTextLineItemQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListChangeTextLineItemQuantityAction deepCopy(@Nullable final ShoppingListChangeTextLineItemQuantityAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListChangeTextLineItemQuantityActionImpl instance = new ShoppingListChangeTextLineItemQuantityActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for ShoppingListChangeTextLineItemQuantityAction
     * @return builder
     */
    public static ShoppingListChangeTextLineItemQuantityActionBuilder builder() {
        return ShoppingListChangeTextLineItemQuantityActionBuilder.of();
    }
    
    /**
     * create builder for ShoppingListChangeTextLineItemQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListChangeTextLineItemQuantityActionBuilder builder(final ShoppingListChangeTextLineItemQuantityAction template) {
        return ShoppingListChangeTextLineItemQuantityActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListChangeTextLineItemQuantityAction(Function<ShoppingListChangeTextLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListChangeTextLineItemQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListChangeTextLineItemQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListChangeTextLineItemQuantityAction>";
            }
        };
    }
}
