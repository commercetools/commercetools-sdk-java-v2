package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetVatIdActionImpl;

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
 * CustomerSetVatIdAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetVatIdAction customerSetVatIdAction = CustomerSetVatIdAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomerSetVatIdActionImpl.class)
public interface CustomerSetVatIdAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetVatIdAction
     */
    String SET_VAT_ID = "setVatId";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return vatId
     */
    
    @JsonProperty("vatId")
    public String getVatId();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param vatId value to be set
     */
    
    public void setVatId(final String vatId);
    

    /**
     * factory method
     * @return instance of CustomerSetVatIdAction
     */
    public static CustomerSetVatIdAction of(){
        return new CustomerSetVatIdActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomerSetVatIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetVatIdAction of(final CustomerSetVatIdAction template) {
        CustomerSetVatIdActionImpl instance = new CustomerSetVatIdActionImpl();
        instance.setVatId(template.getVatId());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerSetVatIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetVatIdAction deepCopy(@Nullable final CustomerSetVatIdAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetVatIdActionImpl instance = new CustomerSetVatIdActionImpl();
        instance.setVatId(template.getVatId());
        return instance;
    }

    /**
     * builder factory method for CustomerSetVatIdAction
     * @return builder
     */
    public static CustomerSetVatIdActionBuilder builder() {
        return CustomerSetVatIdActionBuilder.of();
    }
    
    /**
     * create builder for CustomerSetVatIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetVatIdActionBuilder builder(final CustomerSetVatIdAction template) {
        return CustomerSetVatIdActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetVatIdAction(Function<CustomerSetVatIdAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetVatIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetVatIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetVatIdAction>";
            }
        };
    }
}
