
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
 * ShoppingListChangeLineItemsOrderAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListChangeLineItemsOrderAction shoppingListChangeLineItemsOrderAction = ShoppingListChangeLineItemsOrderAction.builder()
 *             .plusLineItemOrder(lineItemOrderBuilder -> lineItemOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListChangeLineItemsOrderActionImpl.class)
public interface ShoppingListChangeLineItemsOrderAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListChangeLineItemsOrderAction
     */
    String CHANGE_LINE_ITEMS_ORDER = "changeLineItemsOrder";

    /**
     *  <p>All existing ShoppingListLineItem <code>id</code>s in the desired new order.</p>
     * @return lineItemOrder
     */
    @NotNull
    @JsonProperty("lineItemOrder")
    public List<String> getLineItemOrder();

    /**
     *  <p>All existing ShoppingListLineItem <code>id</code>s in the desired new order.</p>
     * @param lineItemOrder values to be set
     */

    @JsonIgnore
    public void setLineItemOrder(final String... lineItemOrder);

    /**
     *  <p>All existing ShoppingListLineItem <code>id</code>s in the desired new order.</p>
     * @param lineItemOrder values to be set
     */

    public void setLineItemOrder(final List<String> lineItemOrder);

    /**
     * factory method
     * @return instance of ShoppingListChangeLineItemsOrderAction
     */
    public static ShoppingListChangeLineItemsOrderAction of() {
        return new ShoppingListChangeLineItemsOrderActionImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListChangeLineItemsOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListChangeLineItemsOrderAction of(final ShoppingListChangeLineItemsOrderAction template) {
        ShoppingListChangeLineItemsOrderActionImpl instance = new ShoppingListChangeLineItemsOrderActionImpl();
        instance.setLineItemOrder(template.getLineItemOrder());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShoppingListChangeLineItemsOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListChangeLineItemsOrderAction deepCopy(
            @Nullable final ShoppingListChangeLineItemsOrderAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListChangeLineItemsOrderActionImpl instance = new ShoppingListChangeLineItemsOrderActionImpl();
        instance.setLineItemOrder(Optional.ofNullable(template.getLineItemOrder()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ShoppingListChangeLineItemsOrderAction
     * @return builder
     */
    public static ShoppingListChangeLineItemsOrderActionBuilder builder() {
        return ShoppingListChangeLineItemsOrderActionBuilder.of();
    }

    /**
     * create builder for ShoppingListChangeLineItemsOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListChangeLineItemsOrderActionBuilder builder(
            final ShoppingListChangeLineItemsOrderAction template) {
        return ShoppingListChangeLineItemsOrderActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListChangeLineItemsOrderAction(
            Function<ShoppingListChangeLineItemsOrderAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListChangeLineItemsOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListChangeLineItemsOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListChangeLineItemsOrderAction>";
            }
        };
    }
}
