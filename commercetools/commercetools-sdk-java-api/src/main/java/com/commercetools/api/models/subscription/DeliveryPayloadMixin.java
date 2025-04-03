
package com.commercetools.api.models.subscription;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.MessageDeliveryPayloadImpl.class, name = MessageDeliveryPayload.MESSAGE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayloadImpl.class, name = ResourceCreatedDeliveryPayload.RESOURCE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.ResourceDeletedDeliveryPayloadImpl.class, name = ResourceDeletedDeliveryPayload.RESOURCE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.ResourceUpdatedDeliveryPayloadImpl.class, name = ResourceUpdatedDeliveryPayload.RESOURCE_UPDATED) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "notificationType", defaultImpl = DeliveryPayloadImpl.class, visible = true)
@JsonDeserialize(as = DeliveryPayloadImpl.class)
public class DeliveryPayloadMixin {
}
