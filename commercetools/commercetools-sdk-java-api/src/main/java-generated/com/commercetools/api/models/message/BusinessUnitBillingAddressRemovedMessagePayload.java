package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessagePayloadImpl;

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
 *  <p>Generated after a successful Remove Billing Address Identifier update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitBillingAddressRemovedMessagePayload businessUnitBillingAddressRemovedMessagePayload = BusinessUnitBillingAddressRemovedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = BusinessUnitBillingAddressRemovedMessagePayloadImpl.class)
public interface BusinessUnitBillingAddressRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitBillingAddressRemovedMessagePayload
     */
    String BUSINESS_UNIT_BILLING_ADDRESS_REMOVED = "BusinessUnitBillingAddressRemoved";

    /**
     *  <p>The address that was removed from the billing addresses of the Business Unit.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was removed from the billing addresses of the Business Unit.</p>
     * @param address value to be set
     */
    
    public void setAddress(final Address address);
    

    /**
     * factory method
     * @return instance of BusinessUnitBillingAddressRemovedMessagePayload
     */
    public static BusinessUnitBillingAddressRemovedMessagePayload of(){
        return new BusinessUnitBillingAddressRemovedMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy BusinessUnitBillingAddressRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitBillingAddressRemovedMessagePayload of(final BusinessUnitBillingAddressRemovedMessagePayload template) {
        BusinessUnitBillingAddressRemovedMessagePayloadImpl instance = new BusinessUnitBillingAddressRemovedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitBillingAddressRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitBillingAddressRemovedMessagePayload deepCopy(@Nullable final BusinessUnitBillingAddressRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitBillingAddressRemovedMessagePayloadImpl instance = new BusinessUnitBillingAddressRemovedMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitBillingAddressRemovedMessagePayload
     * @return builder
     */
    public static BusinessUnitBillingAddressRemovedMessagePayloadBuilder builder() {
        return BusinessUnitBillingAddressRemovedMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for BusinessUnitBillingAddressRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitBillingAddressRemovedMessagePayloadBuilder builder(final BusinessUnitBillingAddressRemovedMessagePayload template) {
        return BusinessUnitBillingAddressRemovedMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitBillingAddressRemovedMessagePayload(Function<BusinessUnitBillingAddressRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitBillingAddressRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitBillingAddressRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitBillingAddressRemovedMessagePayload>";
            }
        };
    }
}
