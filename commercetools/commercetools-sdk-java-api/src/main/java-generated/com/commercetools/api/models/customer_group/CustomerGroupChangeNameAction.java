package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.customer_group.CustomerGroupUpdateAction;
import com.commercetools.api.models.customer_group.CustomerGroupChangeNameActionImpl;

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
 * CustomerGroupChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupChangeNameAction customerGroupChangeNameAction = CustomerGroupChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomerGroupChangeNameActionImpl.class)
public interface CustomerGroupChangeNameAction extends CustomerGroupUpdateAction {

    /**
     * discriminator value for CustomerGroupChangeNameAction
     */
    String CHANGE_NAME = "changeName";

    /**
     *  <p>New name of the CustomerGroup.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>New name of the CustomerGroup.</p>
     * @param name value to be set
     */
    
    public void setName(final String name);
    

    /**
     * factory method
     * @return instance of CustomerGroupChangeNameAction
     */
    public static CustomerGroupChangeNameAction of(){
        return new CustomerGroupChangeNameActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomerGroupChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupChangeNameAction of(final CustomerGroupChangeNameAction template) {
        CustomerGroupChangeNameActionImpl instance = new CustomerGroupChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerGroupChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupChangeNameAction deepCopy(@Nullable final CustomerGroupChangeNameAction template) {
        if (template == null) {
            return null;
        }
        CustomerGroupChangeNameActionImpl instance = new CustomerGroupChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for CustomerGroupChangeNameAction
     * @return builder
     */
    public static CustomerGroupChangeNameActionBuilder builder() {
        return CustomerGroupChangeNameActionBuilder.of();
    }
    
    /**
     * create builder for CustomerGroupChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupChangeNameActionBuilder builder(final CustomerGroupChangeNameAction template) {
        return CustomerGroupChangeNameActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupChangeNameAction(Function<CustomerGroupChangeNameAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupChangeNameAction>";
            }
        };
    }
}
