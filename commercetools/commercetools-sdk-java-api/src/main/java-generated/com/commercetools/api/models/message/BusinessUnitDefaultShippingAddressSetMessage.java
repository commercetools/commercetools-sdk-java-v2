package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessageImpl;

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
 *     BusinessUnitDefaultShippingAddressSetMessage businessUnitDefaultShippingAddressSetMessage = BusinessUnitDefaultShippingAddressSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = BusinessUnitDefaultShippingAddressSetMessageImpl.class)
public interface BusinessUnitDefaultShippingAddressSetMessage extends Message {

    /**
     * discriminator value for BusinessUnitDefaultShippingAddressSetMessage
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
     * @return instance of BusinessUnitDefaultShippingAddressSetMessage
     */
    public static BusinessUnitDefaultShippingAddressSetMessage of(){
        return new BusinessUnitDefaultShippingAddressSetMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy BusinessUnitDefaultShippingAddressSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitDefaultShippingAddressSetMessage of(final BusinessUnitDefaultShippingAddressSetMessage template) {
        BusinessUnitDefaultShippingAddressSetMessageImpl instance = new BusinessUnitDefaultShippingAddressSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitDefaultShippingAddressSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitDefaultShippingAddressSetMessage deepCopy(@Nullable final BusinessUnitDefaultShippingAddressSetMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitDefaultShippingAddressSetMessageImpl instance = new BusinessUnitDefaultShippingAddressSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers.deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitDefaultShippingAddressSetMessage
     * @return builder
     */
    public static BusinessUnitDefaultShippingAddressSetMessageBuilder builder() {
        return BusinessUnitDefaultShippingAddressSetMessageBuilder.of();
    }
    
    /**
     * create builder for BusinessUnitDefaultShippingAddressSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitDefaultShippingAddressSetMessageBuilder builder(final BusinessUnitDefaultShippingAddressSetMessage template) {
        return BusinessUnitDefaultShippingAddressSetMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitDefaultShippingAddressSetMessage(Function<BusinessUnitDefaultShippingAddressSetMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDefaultShippingAddressSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDefaultShippingAddressSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitDefaultShippingAddressSetMessage>";
            }
        };
    }
}
