
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the Order's <code>customerId</code> does not recalculate prices or discounts on the Order. If the Customer belongs to a Customer Group, <code>customerGroup</code> on the Order is updated automatically.</p>
 *  <p>Produces the OrderCustomerSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetCustomerIdAction orderSetCustomerIdAction = OrderSetCustomerIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetCustomerIdActionImpl.class)
public interface OrderSetCustomerIdAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetCustomerIdAction
     */
    String SET_CUSTOMER_ID = "setCustomerId";

    /**
     *  <p><code>id</code> of an existing Customer. If empty, any existing value is removed.</p>
     * @return customerId
     */

    @JsonProperty("customerId")
    public String getCustomerId();

    /**
     *  <p><code>id</code> of an existing Customer. If empty, any existing value is removed.</p>
     * @param customerId value to be set
     */

    public void setCustomerId(final String customerId);

    /**
     * factory method
     * @return instance of OrderSetCustomerIdAction
     */
    public static OrderSetCustomerIdAction of() {
        return new OrderSetCustomerIdActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetCustomerIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetCustomerIdAction of(final OrderSetCustomerIdAction template) {
        OrderSetCustomerIdActionImpl instance = new OrderSetCustomerIdActionImpl();
        instance.setCustomerId(template.getCustomerId());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetCustomerIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetCustomerIdAction deepCopy(@Nullable final OrderSetCustomerIdAction template) {
        if (template == null) {
            return null;
        }
        OrderSetCustomerIdActionImpl instance = new OrderSetCustomerIdActionImpl();
        instance.setCustomerId(template.getCustomerId());
        return instance;
    }

    /**
     * builder factory method for OrderSetCustomerIdAction
     * @return builder
     */
    public static OrderSetCustomerIdActionBuilder builder() {
        return OrderSetCustomerIdActionBuilder.of();
    }

    /**
     * create builder for OrderSetCustomerIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetCustomerIdActionBuilder builder(final OrderSetCustomerIdAction template) {
        return OrderSetCustomerIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetCustomerIdAction(Function<OrderSetCustomerIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomerIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomerIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetCustomerIdAction>";
            }
        };
    }
}
