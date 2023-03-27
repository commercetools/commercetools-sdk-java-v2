
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetKeyAction customerSetKeyAction = CustomerSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetKeyActionImpl.class)
public interface CustomerSetKeyAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of CustomerSetKeyAction
     */
    public static CustomerSetKeyAction of() {
        return new CustomerSetKeyActionImpl();
    }

    /**
     * factory method to copy an instance of CustomerSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetKeyAction of(final CustomerSetKeyAction template) {
        CustomerSetKeyActionImpl instance = new CustomerSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for CustomerSetKeyAction
     * @return builder
     */
    public static CustomerSetKeyActionBuilder builder() {
        return CustomerSetKeyActionBuilder.of();
    }

    /**
     * create builder for CustomerSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetKeyActionBuilder builder(final CustomerSetKeyAction template) {
        return CustomerSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetKeyAction(Function<CustomerSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static CustomerSetKeyAction ofUnset() {
        return CustomerSetKeyAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetKeyAction>";
            }
        };
    }
}
