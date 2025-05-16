
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.DeliveryItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Parcel Items update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelItemsUpdatedMessage parcelItemsUpdatedMessage = ParcelItemsUpdatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .parcelId("{parcelId}")
 *             .deliveryId("{deliveryId}")
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .plusOldItems(oldItemsBuilder -> oldItemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ParcelItemsUpdated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelItemsUpdatedMessageImpl.class)
public interface ParcelItemsUpdatedMessage extends OrderMessage {

    /**
     * discriminator value for ParcelItemsUpdatedMessage
     */
    String PARCEL_ITEMS_UPDATED = "ParcelItemsUpdated";

    /**
     *  <p>Unique identifier of the Parcel.</p>
     * @return parcelId
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Delivery Items after the Set Parcel Items update action.</p>
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     *  <p>Delivery Items before the Set Parcel Items update action.</p>
     * @return oldItems
     */
    @NotNull
    @Valid
    @JsonProperty("oldItems")
    public List<DeliveryItem> getOldItems();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Unique identifier of the Parcel.</p>
     * @param parcelId value to be set
     */

    public void setParcelId(final String parcelId);

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p>Delivery Items after the Set Parcel Items update action.</p>
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    /**
     *  <p>Delivery Items after the Set Parcel Items update action.</p>
     * @param items values to be set
     */

    public void setItems(final List<DeliveryItem> items);

    /**
     *  <p>Delivery Items before the Set Parcel Items update action.</p>
     * @param oldItems values to be set
     */

    @JsonIgnore
    public void setOldItems(final DeliveryItem... oldItems);

    /**
     *  <p>Delivery Items before the Set Parcel Items update action.</p>
     * @param oldItems values to be set
     */

    public void setOldItems(final List<DeliveryItem> oldItems);

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of ParcelItemsUpdatedMessage
     */
    public static ParcelItemsUpdatedMessage of() {
        return new ParcelItemsUpdatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ParcelItemsUpdatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ParcelItemsUpdatedMessage of(final ParcelItemsUpdatedMessage template) {
        ParcelItemsUpdatedMessageImpl instance = new ParcelItemsUpdatedMessageImpl();
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
        instance.setParcelId(template.getParcelId());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setItems(template.getItems());
        instance.setOldItems(template.getOldItems());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public ParcelItemsUpdatedMessage copyDeep();

    /**
     * factory method to create a deep copy of ParcelItemsUpdatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ParcelItemsUpdatedMessage deepCopy(@Nullable final ParcelItemsUpdatedMessage template) {
        if (template == null) {
            return null;
        }
        ParcelItemsUpdatedMessageImpl instance = new ParcelItemsUpdatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setParcelId(template.getParcelId());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setOldItems(Optional.ofNullable(template.getOldItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for ParcelItemsUpdatedMessage
     * @return builder
     */
    public static ParcelItemsUpdatedMessageBuilder builder() {
        return ParcelItemsUpdatedMessageBuilder.of();
    }

    /**
     * create builder for ParcelItemsUpdatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelItemsUpdatedMessageBuilder builder(final ParcelItemsUpdatedMessage template) {
        return ParcelItemsUpdatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withParcelItemsUpdatedMessage(Function<ParcelItemsUpdatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ParcelItemsUpdatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelItemsUpdatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelItemsUpdatedMessage>";
            }
        };
    }
}
