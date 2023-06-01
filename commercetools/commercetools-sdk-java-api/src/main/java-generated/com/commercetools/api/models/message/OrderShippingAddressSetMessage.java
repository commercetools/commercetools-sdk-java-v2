package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.OrderMessage;
import com.commercetools.api.models.message.OrderShippingAddressSetMessageImpl;

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
 *  <p>Generated after a successful Set Shipping Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderShippingAddressSetMessage orderShippingAddressSetMessage = OrderShippingAddressSetMessage.builder()
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
@JsonDeserialize(as = OrderShippingAddressSetMessageImpl.class)
public interface OrderShippingAddressSetMessage extends OrderMessage {

    /**
     * discriminator value for OrderShippingAddressSetMessage
     */
    String ORDER_SHIPPING_ADDRESS_SET = "OrderShippingAddressSet";

    /**
     *  <p>Shipping address on the Order after the Set Shipping Address update action.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();
    /**
     *  <p>Shipping address on the Order before the Set Shipping Address update action.</p>
     * @return oldAddress
     */
    @Valid
    @JsonProperty("oldAddress")
    public Address getOldAddress();

    /**
     *  <p>Shipping address on the Order after the Set Shipping Address update action.</p>
     * @param address value to be set
     */
    
    public void setAddress(final Address address);
    
    
    /**
     *  <p>Shipping address on the Order before the Set Shipping Address update action.</p>
     * @param oldAddress value to be set
     */
    
    public void setOldAddress(final Address oldAddress);
    

    /**
     * factory method
     * @return instance of OrderShippingAddressSetMessage
     */
    public static OrderShippingAddressSetMessage of(){
        return new OrderShippingAddressSetMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderShippingAddressSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderShippingAddressSetMessage of(final OrderShippingAddressSetMessage template) {
        OrderShippingAddressSetMessageImpl instance = new OrderShippingAddressSetMessageImpl();
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
        instance.setOldAddress(template.getOldAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderShippingAddressSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderShippingAddressSetMessage deepCopy(@Nullable final OrderShippingAddressSetMessage template) {
        if (template == null) {
            return null;
        }
        OrderShippingAddressSetMessageImpl instance = new OrderShippingAddressSetMessageImpl();
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
        instance.setOldAddress(com.commercetools.api.models.common.Address.deepCopy(template.getOldAddress()));
        return instance;
    }

    /**
     * builder factory method for OrderShippingAddressSetMessage
     * @return builder
     */
    public static OrderShippingAddressSetMessageBuilder builder() {
        return OrderShippingAddressSetMessageBuilder.of();
    }
    
    /**
     * create builder for OrderShippingAddressSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderShippingAddressSetMessageBuilder builder(final OrderShippingAddressSetMessage template) {
        return OrderShippingAddressSetMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderShippingAddressSetMessage(Function<OrderShippingAddressSetMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderShippingAddressSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderShippingAddressSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderShippingAddressSetMessage>";
            }
        };
    }
}
