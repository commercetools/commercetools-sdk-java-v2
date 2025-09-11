
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the last name of the Customer produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerLastNameSetMessage" rel="nofollow">CustomerLastNameSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetLastNameAction customerSetLastNameAction = CustomerSetLastNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLastName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetLastNameActionImpl.class)
public interface CustomerSetLastNameAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetLastNameAction
     */
    String SET_LAST_NAME = "setLastName";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return lastName
     */

    @JsonProperty("lastName")
    public String getLastName();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param lastName value to be set
     */

    public void setLastName(final String lastName);

    /**
     * factory method
     * @return instance of CustomerSetLastNameAction
     */
    public static CustomerSetLastNameAction of() {
        return new CustomerSetLastNameActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerSetLastNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetLastNameAction of(final CustomerSetLastNameAction template) {
        CustomerSetLastNameActionImpl instance = new CustomerSetLastNameActionImpl();
        instance.setLastName(template.getLastName());
        return instance;
    }

    public CustomerSetLastNameAction copyDeep();

    /**
     * factory method to create a deep copy of CustomerSetLastNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetLastNameAction deepCopy(@Nullable final CustomerSetLastNameAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetLastNameActionImpl instance = new CustomerSetLastNameActionImpl();
        instance.setLastName(template.getLastName());
        return instance;
    }

    /**
     * builder factory method for CustomerSetLastNameAction
     * @return builder
     */
    public static CustomerSetLastNameActionBuilder builder() {
        return CustomerSetLastNameActionBuilder.of();
    }

    /**
     * create builder for CustomerSetLastNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetLastNameActionBuilder builder(final CustomerSetLastNameAction template) {
        return CustomerSetLastNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetLastNameAction(Function<CustomerSetLastNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetLastNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetLastNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetLastNameAction>";
            }
        };
    }
}
