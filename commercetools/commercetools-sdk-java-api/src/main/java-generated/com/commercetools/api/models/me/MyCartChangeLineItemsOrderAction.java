
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * MyCartChangeLineItemsOrderAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartChangeLineItemsOrderAction myCartChangeLineItemsOrderAction = MyCartChangeLineItemsOrderAction.builder()
 *             .plusLineItemOrder(lineItemOrderBuilder -> lineItemOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeLineItemsOrder")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartChangeLineItemsOrderActionImpl.class)
public interface MyCartChangeLineItemsOrderAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartChangeLineItemsOrderAction
     */
    String CHANGE_LINE_ITEMS_ORDER = "changeLineItemsOrder";

    /**
     *  <p>All existing LineItem <code>id</code>s of the Cart in the desired new order.</p>
     * @return lineItemOrder
     */
    @NotNull
    @JsonProperty("lineItemOrder")
    public List<String> getLineItemOrder();

    /**
     *  <p>All existing LineItem <code>id</code>s of the Cart in the desired new order.</p>
     * @param lineItemOrder values to be set
     */

    @JsonIgnore
    public void setLineItemOrder(final String... lineItemOrder);

    /**
     *  <p>All existing LineItem <code>id</code>s of the Cart in the desired new order.</p>
     * @param lineItemOrder values to be set
     */

    public void setLineItemOrder(final List<String> lineItemOrder);

    /**
     * factory method
     * @return instance of MyCartChangeLineItemsOrderAction
     */
    public static MyCartChangeLineItemsOrderAction of() {
        return new MyCartChangeLineItemsOrderActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartChangeLineItemsOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartChangeLineItemsOrderAction of(final MyCartChangeLineItemsOrderAction template) {
        MyCartChangeLineItemsOrderActionImpl instance = new MyCartChangeLineItemsOrderActionImpl();
        instance.setLineItemOrder(template.getLineItemOrder());
        return instance;
    }

    public MyCartChangeLineItemsOrderAction copyDeep();

    /**
     * factory method to create a deep copy of MyCartChangeLineItemsOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartChangeLineItemsOrderAction deepCopy(@Nullable final MyCartChangeLineItemsOrderAction template) {
        if (template == null) {
            return null;
        }
        MyCartChangeLineItemsOrderActionImpl instance = new MyCartChangeLineItemsOrderActionImpl();
        instance.setLineItemOrder(Optional.ofNullable(template.getLineItemOrder()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for MyCartChangeLineItemsOrderAction
     * @return builder
     */
    public static MyCartChangeLineItemsOrderActionBuilder builder() {
        return MyCartChangeLineItemsOrderActionBuilder.of();
    }

    /**
     * create builder for MyCartChangeLineItemsOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartChangeLineItemsOrderActionBuilder builder(final MyCartChangeLineItemsOrderAction template) {
        return MyCartChangeLineItemsOrderActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartChangeLineItemsOrderAction(Function<MyCartChangeLineItemsOrderAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartChangeLineItemsOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartChangeLineItemsOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartChangeLineItemsOrderAction>";
            }
        };
    }
}
