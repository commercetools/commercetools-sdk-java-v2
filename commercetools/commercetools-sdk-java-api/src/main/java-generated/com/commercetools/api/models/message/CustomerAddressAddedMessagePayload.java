package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CustomerAddressAddedMessagePayloadImpl;

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
 *  <p>Generated after a successful Add Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressAddedMessagePayload customerAddressAddedMessagePayload = CustomerAddressAddedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomerAddressAddedMessagePayloadImpl.class)
public interface CustomerAddressAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerAddressAddedMessagePayload
     */
    String CUSTOMER_ADDRESS_ADDED = "CustomerAddressAdded";

    /**
     *  <p>Address that was added during the Add Address update action.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>Address that was added during the Add Address update action.</p>
     * @param address value to be set
     */
    
    public void setAddress(final Address address);
    

    /**
     * factory method
     * @return instance of CustomerAddressAddedMessagePayload
     */
    public static CustomerAddressAddedMessagePayload of(){
        return new CustomerAddressAddedMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomerAddressAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddressAddedMessagePayload of(final CustomerAddressAddedMessagePayload template) {
        CustomerAddressAddedMessagePayloadImpl instance = new CustomerAddressAddedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerAddressAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerAddressAddedMessagePayload deepCopy(@Nullable final CustomerAddressAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerAddressAddedMessagePayloadImpl instance = new CustomerAddressAddedMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for CustomerAddressAddedMessagePayload
     * @return builder
     */
    public static CustomerAddressAddedMessagePayloadBuilder builder() {
        return CustomerAddressAddedMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for CustomerAddressAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressAddedMessagePayloadBuilder builder(final CustomerAddressAddedMessagePayload template) {
        return CustomerAddressAddedMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddressAddedMessagePayload(Function<CustomerAddressAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddressAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddressAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddressAddedMessagePayload>";
            }
        };
    }
}
