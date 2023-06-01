package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetMiddleNameActionImpl;

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
 * CustomerSetMiddleNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetMiddleNameAction customerSetMiddleNameAction = CustomerSetMiddleNameAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomerSetMiddleNameActionImpl.class)
public interface CustomerSetMiddleNameAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetMiddleNameAction
     */
    String SET_MIDDLE_NAME = "setMiddleName";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return middleName
     */
    
    @JsonProperty("middleName")
    public String getMiddleName();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param middleName value to be set
     */
    
    public void setMiddleName(final String middleName);
    

    /**
     * factory method
     * @return instance of CustomerSetMiddleNameAction
     */
    public static CustomerSetMiddleNameAction of(){
        return new CustomerSetMiddleNameActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomerSetMiddleNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetMiddleNameAction of(final CustomerSetMiddleNameAction template) {
        CustomerSetMiddleNameActionImpl instance = new CustomerSetMiddleNameActionImpl();
        instance.setMiddleName(template.getMiddleName());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerSetMiddleNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetMiddleNameAction deepCopy(@Nullable final CustomerSetMiddleNameAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetMiddleNameActionImpl instance = new CustomerSetMiddleNameActionImpl();
        instance.setMiddleName(template.getMiddleName());
        return instance;
    }

    /**
     * builder factory method for CustomerSetMiddleNameAction
     * @return builder
     */
    public static CustomerSetMiddleNameActionBuilder builder() {
        return CustomerSetMiddleNameActionBuilder.of();
    }
    
    /**
     * create builder for CustomerSetMiddleNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetMiddleNameActionBuilder builder(final CustomerSetMiddleNameAction template) {
        return CustomerSetMiddleNameActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetMiddleNameAction(Function<CustomerSetMiddleNameAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetMiddleNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetMiddleNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetMiddleNameAction>";
            }
        };
    }
}
