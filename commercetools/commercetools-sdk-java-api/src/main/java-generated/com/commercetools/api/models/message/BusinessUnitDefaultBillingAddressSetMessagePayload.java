package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessagePayloadImpl;

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
 *  <p>Generated after a successful Set Default Billing Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitDefaultBillingAddressSetMessagePayload businessUnitDefaultBillingAddressSetMessagePayload = BusinessUnitDefaultBillingAddressSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = BusinessUnitDefaultBillingAddressSetMessagePayloadImpl.class)
public interface BusinessUnitDefaultBillingAddressSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitDefaultBillingAddressSetMessagePayload
     */
    String BUSINESS_UNIT_DEFAULT_BILLING_ADDRESS_SET = "BusinessUnitDefaultBillingAddressSet";

    /**
     *  <p>The address that was set as the default billing address.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was set as the default billing address.</p>
     * @param address value to be set
     */
    
    public void setAddress(final Address address);
    

    /**
     * factory method
     * @return instance of BusinessUnitDefaultBillingAddressSetMessagePayload
     */
    public static BusinessUnitDefaultBillingAddressSetMessagePayload of(){
        return new BusinessUnitDefaultBillingAddressSetMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy BusinessUnitDefaultBillingAddressSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitDefaultBillingAddressSetMessagePayload of(final BusinessUnitDefaultBillingAddressSetMessagePayload template) {
        BusinessUnitDefaultBillingAddressSetMessagePayloadImpl instance = new BusinessUnitDefaultBillingAddressSetMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitDefaultBillingAddressSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitDefaultBillingAddressSetMessagePayload deepCopy(@Nullable final BusinessUnitDefaultBillingAddressSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitDefaultBillingAddressSetMessagePayloadImpl instance = new BusinessUnitDefaultBillingAddressSetMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitDefaultBillingAddressSetMessagePayload
     * @return builder
     */
    public static BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder builder() {
        return BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for BusinessUnitDefaultBillingAddressSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder builder(final BusinessUnitDefaultBillingAddressSetMessagePayload template) {
        return BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitDefaultBillingAddressSetMessagePayload(Function<BusinessUnitDefaultBillingAddressSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDefaultBillingAddressSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDefaultBillingAddressSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitDefaultBillingAddressSetMessagePayload>";
            }
        };
    }
}
