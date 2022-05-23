
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.message.UserProvidedIdentifiers;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create a subtype instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   DeliveryPayload deliveryPayload = DeliveryPayload.messageBuilder()
           projectKey("{projectKey}")
           resource(resourceBuilder -> resourceBuilder)
           id("{id}")
           version(0.3)
           createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           sequenceNumber(0.3)
           resourceVersion(0.3)
           payloadNotIncluded(payloadNotIncludedBuilder -> payloadNotIncludedBuilder)
           .build()
 </code></pre>
 </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.MessageDeliveryPayloadImpl.class, name = MessageDeliveryPayload.MESSAGE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayloadImpl.class, name = ResourceCreatedDeliveryPayload.RESOURCE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.ResourceDeletedDeliveryPayloadImpl.class, name = ResourceDeletedDeliveryPayload.RESOURCE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.ResourceUpdatedDeliveryPayloadImpl.class, name = ResourceUpdatedDeliveryPayload.RESOURCE_UPDATED) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "notificationType", defaultImpl = DeliveryPayloadImpl.class, visible = true)
@JsonDeserialize(as = DeliveryPayloadImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface DeliveryPayload {

    @NotNull
    @JsonProperty("projectKey")
    public String getProjectKey();

    @NotNull
    @JsonProperty("notificationType")
    public String getNotificationType();

    /**
     *  <p>A Reference represents a loose reference to another resource in the same commercetools Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("resource")
    public Reference getResource();

    @Valid
    @JsonProperty("resourceUserProvidedIdentifiers")
    public UserProvidedIdentifiers getResourceUserProvidedIdentifiers();

    public void setProjectKey(final String projectKey);

    public void setResource(final Reference resource);

    public void setResourceUserProvidedIdentifiers(final UserProvidedIdentifiers resourceUserProvidedIdentifiers);

    public static com.commercetools.api.models.subscription.MessageDeliveryPayloadBuilder messageBuilder() {
        return com.commercetools.api.models.subscription.MessageDeliveryPayloadBuilder.of();
    }

    public static com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayloadBuilder resourceCreatedBuilder() {
        return com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayloadBuilder.of();
    }

    public static com.commercetools.api.models.subscription.ResourceDeletedDeliveryPayloadBuilder resourceDeletedBuilder() {
        return com.commercetools.api.models.subscription.ResourceDeletedDeliveryPayloadBuilder.of();
    }

    public static com.commercetools.api.models.subscription.ResourceUpdatedDeliveryPayloadBuilder resourceUpdatedBuilder() {
        return com.commercetools.api.models.subscription.ResourceUpdatedDeliveryPayloadBuilder.of();
    }

    default <T> T withDeliveryPayload(Function<DeliveryPayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryPayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryPayload>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryPayload>";
            }
        };
    }
}
