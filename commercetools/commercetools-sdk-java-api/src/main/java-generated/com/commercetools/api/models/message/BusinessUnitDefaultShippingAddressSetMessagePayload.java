package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessagePayloadImpl;

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
 *  <p>Generated after a successful Set Default Shipping Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitDefaultShippingAddressSetMessagePayload businessUnitDefaultShippingAddressSetMessagePayload = BusinessUnitDefaultShippingAddressSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = BusinessUnitDefaultShippingAddressSetMessagePayloadImpl.class)
public interface BusinessUnitDefaultShippingAddressSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitDefaultShippingAddressSetMessagePayload
     */
    String BUSINESS_UNIT_DEFAULT_SHIPPING_ADDRESS_SET = "BusinessUnitDefaultShippingAddressSet";

    /**
     *  <p>The address that was set as the default shipping address.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was set as the default shipping address.</p>
     * @param address value to be set
     */
    
    public void setAddress(final Address address);
    

    /**
     * factory method
     * @return instance of BusinessUnitDefaultShippingAddressSetMessagePayload
     */
    public static BusinessUnitDefaultShippingAddressSetMessagePayload of(){
        return new BusinessUnitDefaultShippingAddressSetMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy BusinessUnitDefaultShippingAddressSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitDefaultShippingAddressSetMessagePayload of(final BusinessUnitDefaultShippingAddressSetMessagePayload template) {
        BusinessUnitDefaultShippingAddressSetMessagePayloadImpl instance = new BusinessUnitDefaultShippingAddressSetMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitDefaultShippingAddressSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitDefaultShippingAddressSetMessagePayload deepCopy(@Nullable final BusinessUnitDefaultShippingAddressSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitDefaultShippingAddressSetMessagePayloadImpl instance = new BusinessUnitDefaultShippingAddressSetMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitDefaultShippingAddressSetMessagePayload
     * @return builder
     */
    public static BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder builder() {
        return BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for BusinessUnitDefaultShippingAddressSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder builder(final BusinessUnitDefaultShippingAddressSetMessagePayload template) {
        return BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitDefaultShippingAddressSetMessagePayload(Function<BusinessUnitDefaultShippingAddressSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDefaultShippingAddressSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDefaultShippingAddressSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitDefaultShippingAddressSetMessagePayload>";
            }
        };
    }
}
