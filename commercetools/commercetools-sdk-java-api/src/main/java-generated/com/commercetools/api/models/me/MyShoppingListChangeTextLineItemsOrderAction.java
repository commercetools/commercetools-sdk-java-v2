
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListChangeTextLineItemsOrderAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListChangeTextLineItemsOrderAction myShoppingListChangeTextLineItemsOrderAction = MyShoppingListChangeTextLineItemsOrderAction.builder()
 *             .plusTextLineItemOrder(textLineItemOrderBuilder -> textLineItemOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListChangeTextLineItemsOrderActionImpl.class)
public interface MyShoppingListChangeTextLineItemsOrderAction extends MyShoppingListUpdateAction {

    /**
     * discriminator value for MyShoppingListChangeTextLineItemsOrderAction
     */
    String CHANGE_TEXT_LINE_ITEMS_ORDER = "changeTextLineItemsOrder";

    /**
     *  <p>All existing TextLineItem <code>id</code>s in the desired new order.</p>
     * @return textLineItemOrder
     */
    @NotNull
    @JsonProperty("textLineItemOrder")
    public List<String> getTextLineItemOrder();

    /**
     *  <p>All existing TextLineItem <code>id</code>s in the desired new order.</p>
     * @param textLineItemOrder values to be set
     */

    @JsonIgnore
    public void setTextLineItemOrder(final String... textLineItemOrder);

    /**
     *  <p>All existing TextLineItem <code>id</code>s in the desired new order.</p>
     * @param textLineItemOrder values to be set
     */

    public void setTextLineItemOrder(final List<String> textLineItemOrder);

    /**
     * factory method
     * @return instance of MyShoppingListChangeTextLineItemsOrderAction
     */
    public static MyShoppingListChangeTextLineItemsOrderAction of() {
        return new MyShoppingListChangeTextLineItemsOrderActionImpl();
    }

    /**
     * factory method to copy an instance of MyShoppingListChangeTextLineItemsOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListChangeTextLineItemsOrderAction of(
            final MyShoppingListChangeTextLineItemsOrderAction template) {
        MyShoppingListChangeTextLineItemsOrderActionImpl instance = new MyShoppingListChangeTextLineItemsOrderActionImpl();
        instance.setTextLineItemOrder(template.getTextLineItemOrder());
        return instance;
    }

    /**
     * builder factory method for MyShoppingListChangeTextLineItemsOrderAction
     * @return builder
     */
    public static MyShoppingListChangeTextLineItemsOrderActionBuilder builder() {
        return MyShoppingListChangeTextLineItemsOrderActionBuilder.of();
    }

    /**
     * create builder for MyShoppingListChangeTextLineItemsOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListChangeTextLineItemsOrderActionBuilder builder(
            final MyShoppingListChangeTextLineItemsOrderAction template) {
        return MyShoppingListChangeTextLineItemsOrderActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListChangeTextLineItemsOrderAction(
            Function<MyShoppingListChangeTextLineItemsOrderAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListChangeTextLineItemsOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListChangeTextLineItemsOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListChangeTextLineItemsOrderAction>";
            }
        };
    }
}
