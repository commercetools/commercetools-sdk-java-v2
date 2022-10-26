
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
 *  <p>This payload is sent for a ChangeSubscription when a resource is deleted.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceDeletedDeliveryPayload resourceDeletedDeliveryPayload = ResourceDeletedDeliveryPayload.builder()
 *             .projectKey("{projectKey}")
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .version(0.3)
 *             .modifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ResourceDeletedDeliveryPayloadImpl.class)
public interface ResourceDeletedDeliveryPayload extends DeliveryPayload {

    String RESOURCE_DELETED = "ResourceDeleted";

    /**
     *  <p>Last seen version of the resource.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the resource was last deleted.</p>
     */
    @NotNull
    @JsonProperty("modifiedAt")
    public ZonedDateTime getModifiedAt();

    /**
     *  <p><code>true</code> if the <code>dataErasure</code> parameter on the <code>DELETE</code> request was set to <code>true</code>.</p>
     */

    @JsonProperty("dataErasure")
    public Boolean getDataErasure();

    public void setVersion(final Long version);

    public void setModifiedAt(final ZonedDateTime modifiedAt);

    public void setDataErasure(final Boolean dataErasure);

    public static ResourceDeletedDeliveryPayload of() {
        return new ResourceDeletedDeliveryPayloadImpl();
    }

    public static ResourceDeletedDeliveryPayload of(final ResourceDeletedDeliveryPayload template) {
        ResourceDeletedDeliveryPayloadImpl instance = new ResourceDeletedDeliveryPayloadImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setResource(template.getResource());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setVersion(template.getVersion());
        instance.setModifiedAt(template.getModifiedAt());
        instance.setDataErasure(template.getDataErasure());
        return instance;
    }

    public static ResourceDeletedDeliveryPayloadBuilder builder() {
        return ResourceDeletedDeliveryPayloadBuilder.of();
    }

    public static ResourceDeletedDeliveryPayloadBuilder builder(final ResourceDeletedDeliveryPayload template) {
        return ResourceDeletedDeliveryPayloadBuilder.of(template);
    }

    default <T> T withResourceDeletedDeliveryPayload(Function<ResourceDeletedDeliveryPayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ResourceDeletedDeliveryPayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResourceDeletedDeliveryPayload>() {
            @Override
            public String toString() {
                return "TypeReference<ResourceDeletedDeliveryPayload>";
            }
        };
    }
}
