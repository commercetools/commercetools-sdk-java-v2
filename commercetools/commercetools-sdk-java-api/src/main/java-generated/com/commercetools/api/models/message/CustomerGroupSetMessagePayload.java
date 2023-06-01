package com.commercetools.api.models.message;

import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CustomerGroupSetMessagePayloadImpl;

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
 *  <p>Generated after a successful Set Customer Group update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupSetMessagePayload customerGroupSetMessagePayload = CustomerGroupSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomerGroupSetMessagePayloadImpl.class)
public interface CustomerGroupSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerGroupSetMessagePayload
     */
    String CUSTOMER_GROUP_SET = "CustomerGroupSet";

    /**
     *  <p>Customer Group that was set during the Set Customer Group update action.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Customer Group that was set during the Set Customer Group update action.</p>
     * @param customerGroup value to be set
     */
    
    public void setCustomerGroup(final CustomerGroupReference customerGroup);
    

    /**
     * factory method
     * @return instance of CustomerGroupSetMessagePayload
     */
    public static CustomerGroupSetMessagePayload of(){
        return new CustomerGroupSetMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomerGroupSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupSetMessagePayload of(final CustomerGroupSetMessagePayload template) {
        CustomerGroupSetMessagePayloadImpl instance = new CustomerGroupSetMessagePayloadImpl();
        instance.setCustomerGroup(template.getCustomerGroup());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerGroupSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupSetMessagePayload deepCopy(@Nullable final CustomerGroupSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerGroupSetMessagePayloadImpl instance = new CustomerGroupSetMessagePayloadImpl();
        instance.setCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupReference.deepCopy(template.getCustomerGroup()));
        return instance;
    }

    /**
     * builder factory method for CustomerGroupSetMessagePayload
     * @return builder
     */
    public static CustomerGroupSetMessagePayloadBuilder builder() {
        return CustomerGroupSetMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for CustomerGroupSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupSetMessagePayloadBuilder builder(final CustomerGroupSetMessagePayload template) {
        return CustomerGroupSetMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupSetMessagePayload(Function<CustomerGroupSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupSetMessagePayload>";
            }
        };
    }
}
