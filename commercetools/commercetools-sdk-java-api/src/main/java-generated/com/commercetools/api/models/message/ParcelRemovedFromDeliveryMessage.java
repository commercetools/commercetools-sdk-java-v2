
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.Parcel;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ParcelRemovedFromDeliveryMessage parcelRemovedFromDeliveryMessage = ParcelRemovedFromDeliveryMessage.builder()
           .id("{id}")
           .version(0.3)
           .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .sequenceNumber(0.3)
           .resource(resourceBuilder -> resourceBuilder)
           .resourceVersion(0.3)
           .deliveryId("{deliveryId}")
           .parcel(parcelBuilder -> parcelBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelRemovedFromDeliveryMessageImpl.class)
public interface ParcelRemovedFromDeliveryMessage extends OrderMessage {

    String PARCEL_REMOVED_FROM_DELIVERY = "ParcelRemovedFromDelivery";

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @NotNull
    @Valid
    @JsonProperty("parcel")
    public Parcel getParcel();

    public void setDeliveryId(final String deliveryId);

    public void setParcel(final Parcel parcel);

    public static ParcelRemovedFromDeliveryMessage of() {
        return new ParcelRemovedFromDeliveryMessageImpl();
    }

    public static ParcelRemovedFromDeliveryMessage of(final ParcelRemovedFromDeliveryMessage template) {
        ParcelRemovedFromDeliveryMessageImpl instance = new ParcelRemovedFromDeliveryMessageImpl();
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
        instance.setParcel(template.getParcel());
        return instance;
    }

    public static ParcelRemovedFromDeliveryMessageBuilder builder() {
        return ParcelRemovedFromDeliveryMessageBuilder.of();
    }

    public static ParcelRemovedFromDeliveryMessageBuilder builder(final ParcelRemovedFromDeliveryMessage template) {
        return ParcelRemovedFromDeliveryMessageBuilder.of(template);
    }

    default <T> T withParcelRemovedFromDeliveryMessage(Function<ParcelRemovedFromDeliveryMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ParcelRemovedFromDeliveryMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelRemovedFromDeliveryMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelRemovedFromDeliveryMessage>";
            }
        };
    }
}
