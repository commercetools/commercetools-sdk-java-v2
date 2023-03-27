
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetCustomerIdAction
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
     *
     * @return customerId
     */

    @JsonProperty("customerId")
    public String getCustomerId();

    /**
     * set customerId
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
     * factory method to copy an instance of OrderSetCustomerIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetCustomerIdAction of(final OrderSetCustomerIdAction template) {
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
