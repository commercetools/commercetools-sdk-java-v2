
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
 *  <p>All payloads for the PlatformFormat share these common fields.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryPayload deliveryPayload = DeliveryPayload.messageBuilder()
 *             projectKey("{projectKey}")
 *             resource(resourceBuilder -> resourceBuilder)
 *             id("{id}")
 *             version(0.3)
 *             createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             sequenceNumber(0.3)
 *             resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
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

    /**
     *  <p><code>key</code> of the Project. Useful in message processing if the Destination receives events from multiple Projects.</p>
     * @return projectKey
     */
    @NotNull
    @JsonProperty("projectKey")
    public String getProjectKey();

    /**
     *  <p>Identifies the payload.</p>
     * @return notificationType
     */
    @NotNull
    @JsonProperty("notificationType")
    public String getNotificationType();

    /**
     *  <p>Reference to the resource that triggered the message.</p>
     * @return resource
     */
    @NotNull
    @Valid
    @JsonProperty("resource")
    public Reference getResource();

    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     * @return resourceUserProvidedIdentifiers
     */
    @Valid
    @JsonProperty("resourceUserProvidedIdentifiers")
    public UserProvidedIdentifiers getResourceUserProvidedIdentifiers();

    /**
     *  <p><code>key</code> of the Project. Useful in message processing if the Destination receives events from multiple Projects.</p>
     * @param projectKey value to be set
     */

    public void setProjectKey(final String projectKey);

    /**
     *  <p>Reference to the resource that triggered the message.</p>
     * @param resource value to be set
     */

    public void setResource(final Reference resource);

    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     */

    public void setResourceUserProvidedIdentifiers(final UserProvidedIdentifiers resourceUserProvidedIdentifiers);

    /**
     * builder for message subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.MessageDeliveryPayloadBuilder messageBuilder() {
        return com.commercetools.api.models.subscription.MessageDeliveryPayloadBuilder.of();
    }

    /**
     * builder for resourceCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayloadBuilder resourceCreatedBuilder() {
        return com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayloadBuilder.of();
    }

    /**
     * builder for resourceDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.ResourceDeletedDeliveryPayloadBuilder resourceDeletedBuilder() {
        return com.commercetools.api.models.subscription.ResourceDeletedDeliveryPayloadBuilder.of();
    }

    /**
     * builder for resourceUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.ResourceUpdatedDeliveryPayloadBuilder resourceUpdatedBuilder() {
        return com.commercetools.api.models.subscription.ResourceUpdatedDeliveryPayloadBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryPayload(Function<DeliveryPayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryPayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryPayload>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryPayload>";
            }
        };
    }
}
