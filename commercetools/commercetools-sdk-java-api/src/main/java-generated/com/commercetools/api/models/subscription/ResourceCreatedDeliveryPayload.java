
package com.commercetools.api.models.subscription;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>This payload is sent for a ChangeSubscription when a resource is created.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceCreatedDeliveryPayload resourceCreatedDeliveryPayload = ResourceCreatedDeliveryPayload.builder()
 *             .projectKey("{projectKey}")
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .version(0.3)
 *             .modifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ResourceCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ResourceCreatedDeliveryPayloadImpl.class)
public interface ResourceCreatedDeliveryPayload extends DeliveryPayload {

    /**
     * discriminator value for ResourceCreatedDeliveryPayload
     */
    String RESOURCE_CREATED = "ResourceCreated";

    /**
     *  <p>Last seen version of the resource.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the resource was last modified.</p>
     * @return modifiedAt
     */
    @NotNull
    @JsonProperty("modifiedAt")
    public ZonedDateTime getModifiedAt();

    /**
     *  <p>Last seen version of the resource.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the resource was last modified.</p>
     * @param modifiedAt value to be set
     */

    public void setModifiedAt(final ZonedDateTime modifiedAt);

    /**
     * factory method
     * @return instance of ResourceCreatedDeliveryPayload
     */
    public static ResourceCreatedDeliveryPayload of() {
        return new ResourceCreatedDeliveryPayloadImpl();
    }

    /**
     * factory method to create a shallow copy ResourceCreatedDeliveryPayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ResourceCreatedDeliveryPayload of(final ResourceCreatedDeliveryPayload template) {
        ResourceCreatedDeliveryPayloadImpl instance = new ResourceCreatedDeliveryPayloadImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setResource(template.getResource());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setVersion(template.getVersion());
        instance.setModifiedAt(template.getModifiedAt());
        return instance;
    }

    public ResourceCreatedDeliveryPayload copyDeep();

    /**
     * factory method to create a deep copy of ResourceCreatedDeliveryPayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ResourceCreatedDeliveryPayload deepCopy(@Nullable final ResourceCreatedDeliveryPayload template) {
        if (template == null) {
            return null;
        }
        ResourceCreatedDeliveryPayloadImpl instance = new ResourceCreatedDeliveryPayloadImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setVersion(template.getVersion());
        instance.setModifiedAt(template.getModifiedAt());
        return instance;
    }

    /**
     * builder factory method for ResourceCreatedDeliveryPayload
     * @return builder
     */
    public static ResourceCreatedDeliveryPayloadBuilder builder() {
        return ResourceCreatedDeliveryPayloadBuilder.of();
    }

    /**
     * create builder for ResourceCreatedDeliveryPayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ResourceCreatedDeliveryPayloadBuilder builder(final ResourceCreatedDeliveryPayload template) {
        return ResourceCreatedDeliveryPayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withResourceCreatedDeliveryPayload(Function<ResourceCreatedDeliveryPayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ResourceCreatedDeliveryPayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResourceCreatedDeliveryPayload>() {
            @Override
            public String toString() {
                return "TypeReference<ResourceCreatedDeliveryPayload>";
            }
        };
    }
}
