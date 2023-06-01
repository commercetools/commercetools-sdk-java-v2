package com.commercetools.api.models.message;

import com.commercetools.api.models.message.OrderMessage;
import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.message.DeliveryItemsUpdatedMessageImpl;

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
 *  <p>Generated after a successful Set Delivery Items update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryItemsUpdatedMessage deliveryItemsUpdatedMessage = DeliveryItemsUpdatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .deliveryId("{deliveryId}")
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .plusOldItems(oldItemsBuilder -> oldItemsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = DeliveryItemsUpdatedMessageImpl.class)
public interface DeliveryItemsUpdatedMessage extends OrderMessage {

    /**
     * discriminator value for DeliveryItemsUpdatedMessage
     */
    String DELIVERY_ITEMS_UPDATED = "DeliveryItemsUpdated";

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();
    /**
     *  <p>Delivery Items after the Set Delivery Items update action.</p>
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();
    /**
     *  <p>Delivery Items before the Set Delivery Items update action.</p>
     * @return oldItems
     */
    @NotNull
    @Valid
    @JsonProperty("oldItems")
    public List<DeliveryItem> getOldItems();
    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @return shippingKey
     */
    
    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     */
    
    public void setDeliveryId(final String deliveryId);
    
    
    /**
     *  <p>Delivery Items after the Set Delivery Items update action.</p>
     * @param items values to be set
     */
    
    @JsonIgnore
    public void setItems(final DeliveryItem ...items);
    /**
     *  <p>Delivery Items after the Set Delivery Items update action.</p>
     * @param items values to be set
     */
    
    public void setItems(final List<DeliveryItem> items);
    
    /**
     *  <p>Delivery Items before the Set Delivery Items update action.</p>
     * @param oldItems values to be set
     */
    
    @JsonIgnore
    public void setOldItems(final DeliveryItem ...oldItems);
    /**
     *  <p>Delivery Items before the Set Delivery Items update action.</p>
     * @param oldItems values to be set
     */
    
    public void setOldItems(final List<DeliveryItem> oldItems);
    
    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */
    
    public void setShippingKey(final String shippingKey);
    

    /**
     * factory method
     * @return instance of DeliveryItemsUpdatedMessage
     */
    public static DeliveryItemsUpdatedMessage of(){
        return new DeliveryItemsUpdatedMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy DeliveryItemsUpdatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryItemsUpdatedMessage of(final DeliveryItemsUpdatedMessage template) {
        DeliveryItemsUpdatedMessageImpl instance = new DeliveryItemsUpdatedMessageImpl();
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
        instance.setDeliveryId(template.getDeliveryId());
        instance.setItems(template.getItems());
        instance.setOldItems(template.getOldItems());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of DeliveryItemsUpdatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryItemsUpdatedMessage deepCopy(@Nullable final DeliveryItemsUpdatedMessage template) {
        if (template == null) {
            return null;
        }
        DeliveryItemsUpdatedMessageImpl instance = new DeliveryItemsUpdatedMessageImpl();
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
        instance.setDeliveryId(template.getDeliveryId());
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream().map(com.commercetools.api.models.order.DeliveryItem::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setOldItems(Optional.ofNullable(template.getOldItems())
                .map(t -> t.stream().map(com.commercetools.api.models.order.DeliveryItem::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for DeliveryItemsUpdatedMessage
     * @return builder
     */
    public static DeliveryItemsUpdatedMessageBuilder builder() {
        return DeliveryItemsUpdatedMessageBuilder.of();
    }
    
    /**
     * create builder for DeliveryItemsUpdatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryItemsUpdatedMessageBuilder builder(final DeliveryItemsUpdatedMessage template) {
        return DeliveryItemsUpdatedMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryItemsUpdatedMessage(Function<DeliveryItemsUpdatedMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryItemsUpdatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryItemsUpdatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryItemsUpdatedMessage>";
            }
        };
    }
}
