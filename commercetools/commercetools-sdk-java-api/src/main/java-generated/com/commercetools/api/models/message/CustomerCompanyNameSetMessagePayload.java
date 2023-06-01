package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayloadImpl;

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
 *  <p>Generated after a successful Set Company Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerCompanyNameSetMessagePayload customerCompanyNameSetMessagePayload = CustomerCompanyNameSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomerCompanyNameSetMessagePayloadImpl.class)
public interface CustomerCompanyNameSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerCompanyNameSetMessagePayload
     */
    String CUSTOMER_COMPANY_NAME_SET = "CustomerCompanyNameSet";

    /**
     *  <p>The <code>companyName</code> that was set during the Set Company Name update action.</p>
     * @return companyName
     */
    
    @JsonProperty("companyName")
    public String getCompanyName();

    /**
     *  <p>The <code>companyName</code> that was set during the Set Company Name update action.</p>
     * @param companyName value to be set
     */
    
    public void setCompanyName(final String companyName);
    

    /**
     * factory method
     * @return instance of CustomerCompanyNameSetMessagePayload
     */
    public static CustomerCompanyNameSetMessagePayload of(){
        return new CustomerCompanyNameSetMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomerCompanyNameSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerCompanyNameSetMessagePayload of(final CustomerCompanyNameSetMessagePayload template) {
        CustomerCompanyNameSetMessagePayloadImpl instance = new CustomerCompanyNameSetMessagePayloadImpl();
        instance.setCompanyName(template.getCompanyName());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerCompanyNameSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerCompanyNameSetMessagePayload deepCopy(@Nullable final CustomerCompanyNameSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerCompanyNameSetMessagePayloadImpl instance = new CustomerCompanyNameSetMessagePayloadImpl();
        instance.setCompanyName(template.getCompanyName());
        return instance;
    }

    /**
     * builder factory method for CustomerCompanyNameSetMessagePayload
     * @return builder
     */
    public static CustomerCompanyNameSetMessagePayloadBuilder builder() {
        return CustomerCompanyNameSetMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for CustomerCompanyNameSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerCompanyNameSetMessagePayloadBuilder builder(final CustomerCompanyNameSetMessagePayload template) {
        return CustomerCompanyNameSetMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerCompanyNameSetMessagePayload(Function<CustomerCompanyNameSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerCompanyNameSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerCompanyNameSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerCompanyNameSetMessagePayload>";
            }
        };
    }
}
