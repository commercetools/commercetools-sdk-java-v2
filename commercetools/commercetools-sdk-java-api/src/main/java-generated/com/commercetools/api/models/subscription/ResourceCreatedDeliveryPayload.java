
package com.commercetools.api.models.subscription;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ResourceCreatedDeliveryPayloadImpl.class)
public interface ResourceCreatedDeliveryPayload extends DeliveryPayload {

    String RESOURCE_CREATED = "ResourceCreated";

    /**
     *  <p>Last seen version of the resource.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the resource was last modified.</p>
     */
    @NotNull
    @JsonProperty("modifiedAt")
    public ZonedDateTime getModifiedAt();

    public void setVersion(final Long version);

    public void setModifiedAt(final ZonedDateTime modifiedAt);

    public static ResourceCreatedDeliveryPayload of() {
        return new ResourceCreatedDeliveryPayloadImpl();
    }

    public static ResourceCreatedDeliveryPayload of(final ResourceCreatedDeliveryPayload template) {
        ResourceCreatedDeliveryPayloadImpl instance = new ResourceCreatedDeliveryPayloadImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setResource(template.getResource());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setVersion(template.getVersion());
        instance.setModifiedAt(template.getModifiedAt());
        return instance;
    }

    public static ResourceCreatedDeliveryPayloadBuilder builder() {
        return ResourceCreatedDeliveryPayloadBuilder.of();
    }

    public static ResourceCreatedDeliveryPayloadBuilder builder(final ResourceCreatedDeliveryPayload template) {
        return ResourceCreatedDeliveryPayloadBuilder.of(template);
    }

    default <T> T withResourceCreatedDeliveryPayload(Function<ResourceCreatedDeliveryPayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ResourceCreatedDeliveryPayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResourceCreatedDeliveryPayload>() {
            @Override
            public String toString() {
                return "TypeReference<ResourceCreatedDeliveryPayload>";
            }
        };
    }
}
