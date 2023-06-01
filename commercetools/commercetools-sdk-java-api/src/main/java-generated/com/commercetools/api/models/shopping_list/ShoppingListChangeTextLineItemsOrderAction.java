package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemsOrderActionImpl;

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
 * ShoppingListChangeTextLineItemsOrderAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListChangeTextLineItemsOrderAction shoppingListChangeTextLineItemsOrderAction = ShoppingListChangeTextLineItemsOrderAction.builder()
 *             .plusTextLineItemOrder(textLineItemOrderBuilder -> textLineItemOrderBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ShoppingListChangeTextLineItemsOrderActionImpl.class)
public interface ShoppingListChangeTextLineItemsOrderAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListChangeTextLineItemsOrderAction
     */
    String CHANGE_TEXT_LINE_ITEMS_ORDER = "changeTextLineItemsOrder";

    /**
     *  <p>Must contain all existing TextLineItem <code>id</code>s in the desired new order.</p>
     * @return textLineItemOrder
     */
    @NotNull
    @JsonProperty("textLineItemOrder")
    public List<String> getTextLineItemOrder();

    /**
     *  <p>Must contain all existing TextLineItem <code>id</code>s in the desired new order.</p>
     * @param textLineItemOrder values to be set
     */
    
    @JsonIgnore
    public void setTextLineItemOrder(final String ...textLineItemOrder);
    /**
     *  <p>Must contain all existing TextLineItem <code>id</code>s in the desired new order.</p>
     * @param textLineItemOrder values to be set
     */
    
    public void setTextLineItemOrder(final List<String> textLineItemOrder);

    /**
     * factory method
     * @return instance of ShoppingListChangeTextLineItemsOrderAction
     */
    public static ShoppingListChangeTextLineItemsOrderAction of(){
        return new ShoppingListChangeTextLineItemsOrderActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ShoppingListChangeTextLineItemsOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListChangeTextLineItemsOrderAction of(final ShoppingListChangeTextLineItemsOrderAction template) {
        ShoppingListChangeTextLineItemsOrderActionImpl instance = new ShoppingListChangeTextLineItemsOrderActionImpl();
        instance.setTextLineItemOrder(template.getTextLineItemOrder());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShoppingListChangeTextLineItemsOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListChangeTextLineItemsOrderAction deepCopy(@Nullable final ShoppingListChangeTextLineItemsOrderAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListChangeTextLineItemsOrderActionImpl instance = new ShoppingListChangeTextLineItemsOrderActionImpl();
        instance.setTextLineItemOrder(Optional.ofNullable(template.getTextLineItemOrder())
                .map(ArrayList::new)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ShoppingListChangeTextLineItemsOrderAction
     * @return builder
     */
    public static ShoppingListChangeTextLineItemsOrderActionBuilder builder() {
        return ShoppingListChangeTextLineItemsOrderActionBuilder.of();
    }
    
    /**
     * create builder for ShoppingListChangeTextLineItemsOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListChangeTextLineItemsOrderActionBuilder builder(final ShoppingListChangeTextLineItemsOrderAction template) {
        return ShoppingListChangeTextLineItemsOrderActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListChangeTextLineItemsOrderAction(Function<ShoppingListChangeTextLineItemsOrderAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListChangeTextLineItemsOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListChangeTextLineItemsOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListChangeTextLineItemsOrderAction>";
            }
        };
    }
}
