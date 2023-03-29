
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetFirstNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetFirstNameAction customerSetFirstNameAction = CustomerSetFirstNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetFirstNameActionImpl.class)
public interface CustomerSetFirstNameAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetFirstNameAction
     */
    String SET_FIRST_NAME = "setFirstName";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return firstName
     */

    @JsonProperty("firstName")
    public String getFirstName();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param firstName value to be set
     */

    public void setFirstName(final String firstName);

    /**
     * factory method
     * @return instance of CustomerSetFirstNameAction
     */
    public static CustomerSetFirstNameAction of() {
        return new CustomerSetFirstNameActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerSetFirstNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetFirstNameAction of(final CustomerSetFirstNameAction template) {
        CustomerSetFirstNameActionImpl instance = new CustomerSetFirstNameActionImpl();
        instance.setFirstName(template.getFirstName());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerSetFirstNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetFirstNameAction deepCopy(@Nullable final CustomerSetFirstNameAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetFirstNameActionImpl instance = new CustomerSetFirstNameActionImpl();
        instance.setFirstName(template.getFirstName());
        return instance;
    }

    /**
     * builder factory method for CustomerSetFirstNameAction
     * @return builder
     */
    public static CustomerSetFirstNameActionBuilder builder() {
        return CustomerSetFirstNameActionBuilder.of();
    }

    /**
     * create builder for CustomerSetFirstNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetFirstNameActionBuilder builder(final CustomerSetFirstNameAction template) {
        return CustomerSetFirstNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetFirstNameAction(Function<CustomerSetFirstNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetFirstNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetFirstNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetFirstNameAction>";
            }
        };
    }
}
