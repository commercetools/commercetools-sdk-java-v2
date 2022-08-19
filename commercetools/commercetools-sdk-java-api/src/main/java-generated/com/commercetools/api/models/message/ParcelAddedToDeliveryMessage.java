
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.order.Parcel;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Add Parcel To Delivery update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelAddedToDeliveryMessage parcelAddedToDeliveryMessage = ParcelAddedToDeliveryMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .delivery(deliveryBuilder -> deliveryBuilder)
 *             .parcel(parcelBuilder -> parcelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelAddedToDeliveryMessageImpl.class)
public interface ParcelAddedToDeliveryMessage extends OrderMessage {

    String PARCEL_ADDED_TO_DELIVERY = "ParcelAddedToDelivery";

    /**
     *  <p>Unique identifier of the Delivery.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("delivery")
    public Delivery getDelivery();

    /**
     *  <p>Parcel that was added to the Delivery.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("parcel")
    public Parcel getParcel();

    public void setDelivery(final Delivery delivery);

    public void setParcel(final Parcel parcel);

    public static ParcelAddedToDeliveryMessage of() {
        return new ParcelAddedToDeliveryMessageImpl();
    }

    public static ParcelAddedToDeliveryMessage of(final ParcelAddedToDeliveryMessage template) {
        ParcelAddedToDeliveryMessageImpl instance = new ParcelAddedToDeliveryMessageImpl();
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
        instance.setDelivery(template.getDelivery());
        instance.setParcel(template.getParcel());
        return instance;
    }

    public static ParcelAddedToDeliveryMessageBuilder builder() {
        return ParcelAddedToDeliveryMessageBuilder.of();
    }

    public static ParcelAddedToDeliveryMessageBuilder builder(final ParcelAddedToDeliveryMessage template) {
        return ParcelAddedToDeliveryMessageBuilder.of(template);
    }

    default <T> T withParcelAddedToDeliveryMessage(Function<ParcelAddedToDeliveryMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ParcelAddedToDeliveryMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelAddedToDeliveryMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelAddedToDeliveryMessage>";
            }
        };
    }
}
