
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CartChangeLineItemsOrderAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeLineItemsOrderAction cartChangeLineItemsOrderAction = CartChangeLineItemsOrderAction.builder()
 *             .plusLineItemOrder(lineItemOrderBuilder -> lineItemOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeLineItemsOrder")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartChangeLineItemsOrderActionImpl.class)
public interface CartChangeLineItemsOrderAction extends CartUpdateAction {

    /**
     * discriminator value for CartChangeLineItemsOrderAction
     */
    String CHANGE_LINE_ITEMS_ORDER = "changeLineItemsOrder";

    /**
     *  <p>All existing LineItem <code>id</code>s in the desired new order.</p>
     * @return lineItemOrder
     */
    @NotNull
    @JsonProperty("lineItemOrder")
    public List<String> getLineItemOrder();

    /**
     *  <p>All existing LineItem <code>id</code>s in the desired new order.</p>
     * @param lineItemOrder values to be set
     */

    @JsonIgnore
    public void setLineItemOrder(final String... lineItemOrder);

    /**
     *  <p>All existing LineItem <code>id</code>s in the desired new order.</p>
     * @param lineItemOrder values to be set
     */

    public void setLineItemOrder(final List<String> lineItemOrder);

    /**
     * factory method
     * @return instance of CartChangeLineItemsOrderAction
     */
    public static CartChangeLineItemsOrderAction of() {
        return new CartChangeLineItemsOrderActionImpl();
    }

    /**
     * factory method to create a shallow copy CartChangeLineItemsOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartChangeLineItemsOrderAction of(final CartChangeLineItemsOrderAction template) {
        CartChangeLineItemsOrderActionImpl instance = new CartChangeLineItemsOrderActionImpl();
        instance.setLineItemOrder(template.getLineItemOrder());
        return instance;
    }

    public CartChangeLineItemsOrderAction copyDeep();

    /**
     * factory method to create a deep copy of CartChangeLineItemsOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartChangeLineItemsOrderAction deepCopy(@Nullable final CartChangeLineItemsOrderAction template) {
        if (template == null) {
            return null;
        }
        CartChangeLineItemsOrderActionImpl instance = new CartChangeLineItemsOrderActionImpl();
        instance.setLineItemOrder(Optional.ofNullable(template.getLineItemOrder()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartChangeLineItemsOrderAction
     * @return builder
     */
    public static CartChangeLineItemsOrderActionBuilder builder() {
        return CartChangeLineItemsOrderActionBuilder.of();
    }

    /**
     * create builder for CartChangeLineItemsOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartChangeLineItemsOrderActionBuilder builder(final CartChangeLineItemsOrderAction template) {
        return CartChangeLineItemsOrderActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartChangeLineItemsOrderAction(Function<CartChangeLineItemsOrderAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartChangeLineItemsOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartChangeLineItemsOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartChangeLineItemsOrderAction>";
            }
        };
    }
}
