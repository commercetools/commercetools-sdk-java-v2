package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.me.MyShoppingListChangeLineItemsOrderActionImpl;

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
 * MyShoppingListChangeLineItemsOrderAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListChangeLineItemsOrderAction myShoppingListChangeLineItemsOrderAction = MyShoppingListChangeLineItemsOrderAction.builder()
 *             .plusLineItemOrder(lineItemOrderBuilder -> lineItemOrderBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = MyShoppingListChangeLineItemsOrderActionImpl.class)
public interface MyShoppingListChangeLineItemsOrderAction extends MyShoppingListUpdateAction {

    /**
     * discriminator value for MyShoppingListChangeLineItemsOrderAction
     */
    String CHANGE_LINE_ITEMS_ORDER = "changeLineItemsOrder";

    /**
     *  <p>All existing ShoppingListLineItem <code>id</code>s of the ShoppingList in the desired new order.</p>
     * @return lineItemOrder
     */
    @NotNull
    @JsonProperty("lineItemOrder")
    public List<String> getLineItemOrder();

    /**
     *  <p>All existing ShoppingListLineItem <code>id</code>s of the ShoppingList in the desired new order.</p>
     * @param lineItemOrder values to be set
     */
    
    @JsonIgnore
    public void setLineItemOrder(final String ...lineItemOrder);
    /**
     *  <p>All existing ShoppingListLineItem <code>id</code>s of the ShoppingList in the desired new order.</p>
     * @param lineItemOrder values to be set
     */
    
    public void setLineItemOrder(final List<String> lineItemOrder);

    /**
     * factory method
     * @return instance of MyShoppingListChangeLineItemsOrderAction
     */
    public static MyShoppingListChangeLineItemsOrderAction of(){
        return new MyShoppingListChangeLineItemsOrderActionImpl();
    }
    

    /**
     * factory method to create a shallow copy MyShoppingListChangeLineItemsOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListChangeLineItemsOrderAction of(final MyShoppingListChangeLineItemsOrderAction template) {
        MyShoppingListChangeLineItemsOrderActionImpl instance = new MyShoppingListChangeLineItemsOrderActionImpl();
        instance.setLineItemOrder(template.getLineItemOrder());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyShoppingListChangeLineItemsOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyShoppingListChangeLineItemsOrderAction deepCopy(@Nullable final MyShoppingListChangeLineItemsOrderAction template) {
        if (template == null) {
            return null;
        }
        MyShoppingListChangeLineItemsOrderActionImpl instance = new MyShoppingListChangeLineItemsOrderActionImpl();
        instance.setLineItemOrder(Optional.ofNullable(template.getLineItemOrder())
                .map(ArrayList::new)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MyShoppingListChangeLineItemsOrderAction
     * @return builder
     */
    public static MyShoppingListChangeLineItemsOrderActionBuilder builder() {
        return MyShoppingListChangeLineItemsOrderActionBuilder.of();
    }
    
    /**
     * create builder for MyShoppingListChangeLineItemsOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListChangeLineItemsOrderActionBuilder builder(final MyShoppingListChangeLineItemsOrderAction template) {
        return MyShoppingListChangeLineItemsOrderActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListChangeLineItemsOrderAction(Function<MyShoppingListChangeLineItemsOrderAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListChangeLineItemsOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListChangeLineItemsOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListChangeLineItemsOrderAction>";
            }
        };
    }
}
