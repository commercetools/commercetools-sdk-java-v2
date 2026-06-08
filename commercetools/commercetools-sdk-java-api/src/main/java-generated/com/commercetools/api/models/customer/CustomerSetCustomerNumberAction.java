
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets a new ID that can be used to refer to a Customer in a human-reabable way (for use in emails, invoices, etc).</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetCustomerNumberAction customerSetCustomerNumberAction = CustomerSetCustomerNumberAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomerNumber")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetCustomerNumberActionImpl.class)
public interface CustomerSetCustomerNumberAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetCustomerNumberAction
     */
    String SET_CUSTOMER_NUMBER = "setCustomerNumber";

    /**
     *  <p>Value to set. Once set, it cannot be changed.</p>
     * @return customerNumber
     */

    @JsonProperty("customerNumber")
    public String getCustomerNumber();

    /**
     *  <p>Value to set. Once set, it cannot be changed.</p>
     * @param customerNumber value to be set
     */

    public void setCustomerNumber(final String customerNumber);

    /**
     * factory method
     * @return instance of CustomerSetCustomerNumberAction
     */
    public static CustomerSetCustomerNumberAction of() {
        return new CustomerSetCustomerNumberActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerSetCustomerNumberAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetCustomerNumberAction of(final CustomerSetCustomerNumberAction template) {
        CustomerSetCustomerNumberActionImpl instance = new CustomerSetCustomerNumberActionImpl();
        instance.setCustomerNumber(template.getCustomerNumber());
        return instance;
    }

    public CustomerSetCustomerNumberAction copyDeep();

    /**
     * factory method to create a deep copy of CustomerSetCustomerNumberAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetCustomerNumberAction deepCopy(@Nullable final CustomerSetCustomerNumberAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetCustomerNumberActionImpl instance = new CustomerSetCustomerNumberActionImpl();
        instance.setCustomerNumber(template.getCustomerNumber());
        return instance;
    }

    /**
     * builder factory method for CustomerSetCustomerNumberAction
     * @return builder
     */
    public static CustomerSetCustomerNumberActionBuilder builder() {
        return CustomerSetCustomerNumberActionBuilder.of();
    }

    /**
     * create builder for CustomerSetCustomerNumberAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetCustomerNumberActionBuilder builder(final CustomerSetCustomerNumberAction template) {
        return CustomerSetCustomerNumberActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetCustomerNumberAction(Function<CustomerSetCustomerNumberAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetCustomerNumberAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetCustomerNumberAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetCustomerNumberAction>";
            }
        };
    }
}
