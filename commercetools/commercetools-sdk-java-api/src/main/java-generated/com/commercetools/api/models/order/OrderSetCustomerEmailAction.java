
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This action updates the <code>customerEmail</code> on the Order, but it does not change the Customer email on the Cart the Order has been created from.</p>
 *  <p>Produces the Order Customer Email Set Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetCustomerEmailAction orderSetCustomerEmailAction = OrderSetCustomerEmailAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetCustomerEmailActionImpl.class)
public interface OrderSetCustomerEmailAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetCustomerEmailAction
     */
    String SET_CUSTOMER_EMAIL = "setCustomerEmail";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return email
     */

    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param email value to be set
     */

    public void setEmail(final String email);

    /**
     * factory method
     * @return instance of OrderSetCustomerEmailAction
     */
    public static OrderSetCustomerEmailAction of() {
        return new OrderSetCustomerEmailActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetCustomerEmailAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetCustomerEmailAction of(final OrderSetCustomerEmailAction template) {
        OrderSetCustomerEmailActionImpl instance = new OrderSetCustomerEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetCustomerEmailAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetCustomerEmailAction deepCopy(@Nullable final OrderSetCustomerEmailAction template) {
        if (template == null) {
            return null;
        }
        OrderSetCustomerEmailActionImpl instance = new OrderSetCustomerEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    /**
     * builder factory method for OrderSetCustomerEmailAction
     * @return builder
     */
    public static OrderSetCustomerEmailActionBuilder builder() {
        return OrderSetCustomerEmailActionBuilder.of();
    }

    /**
     * create builder for OrderSetCustomerEmailAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetCustomerEmailActionBuilder builder(final OrderSetCustomerEmailAction template) {
        return OrderSetCustomerEmailActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetCustomerEmailAction(Function<OrderSetCustomerEmailAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomerEmailAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomerEmailAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetCustomerEmailAction>";
            }
        };
    }
}
