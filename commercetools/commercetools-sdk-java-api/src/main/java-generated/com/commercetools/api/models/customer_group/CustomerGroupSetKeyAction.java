package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.customer_group.CustomerGroupUpdateAction;
import com.commercetools.api.models.customer_group.CustomerGroupSetKeyActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * CustomerGroupSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupSetKeyAction customerGroupSetKeyAction = CustomerGroupSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomerGroupSetKeyActionImpl.class)
public interface CustomerGroupSetKeyAction extends CustomerGroupUpdateAction {

    /**
     * discriminator value for CustomerGroupSetKeyAction
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
     * @return instance of CustomerGroupSetKeyAction
     */
    public static CustomerGroupSetKeyAction of(){
        return new CustomerGroupSetKeyActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomerGroupSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupSetKeyAction of(final CustomerGroupSetKeyAction template) {
        CustomerGroupSetKeyActionImpl instance = new CustomerGroupSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerGroupSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupSetKeyAction deepCopy(@Nullable final CustomerGroupSetKeyAction template) {
        if (template == null) {
            return null;
        }
        CustomerGroupSetKeyActionImpl instance = new CustomerGroupSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for CustomerGroupSetKeyAction
     * @return builder
     */
    public static CustomerGroupSetKeyActionBuilder builder() {
        return CustomerGroupSetKeyActionBuilder.of();
    }
    
    /**
     * create builder for CustomerGroupSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupSetKeyActionBuilder builder(final CustomerGroupSetKeyAction template) {
        return CustomerGroupSetKeyActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupSetKeyAction(Function<CustomerGroupSetKeyAction, T> helper) {
        return helper.apply(this);
    }
    public static CustomerGroupSetKeyAction ofUnset() {
        return CustomerGroupSetKeyAction.of();
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupSetKeyAction>";
            }
        };
    }
}
