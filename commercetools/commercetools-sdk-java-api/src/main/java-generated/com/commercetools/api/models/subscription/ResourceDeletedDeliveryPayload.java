
package com.commercetools.api.models.subscription;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
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

    /**
     * discriminator value for ResourceDeletedDeliveryPayload
     */
    String RESOURCE_DELETED = "ResourceDeleted";

    /**
     *  <p>Last seen version of the resource.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the resource was last deleted.</p>
     * @return modifiedAt
     */
    @NotNull
    @JsonProperty("modifiedAt")
    public ZonedDateTime getModifiedAt();

    /**
     *  <p><code>true</code> if the <code>dataErasure</code> parameter on the <code>DELETE</code> request was set to <code>true</code>.</p>
     * @return dataErasure
     */

    @JsonProperty("dataErasure")
    public Boolean getDataErasure();

    /**
     *  <p>Last seen version of the resource.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the resource was last deleted.</p>
     * @param modifiedAt value to be set
     */

    public void setModifiedAt(final ZonedDateTime modifiedAt);

    /**
     *  <p><code>true</code> if the <code>dataErasure</code> parameter on the <code>DELETE</code> request was set to <code>true</code>.</p>
     * @param dataErasure value to be set
     */

    public void setDataErasure(final Boolean dataErasure);

    /**
     * factory method
     * @return instance of ResourceDeletedDeliveryPayload
     */
    public static ResourceDeletedDeliveryPayload of() {
        return new ResourceDeletedDeliveryPayloadImpl();
    }

    /**
     * factory method to create a shallow copy ResourceDeletedDeliveryPayload
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of ResourceDeletedDeliveryPayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ResourceDeletedDeliveryPayload deepCopy(@Nullable final ResourceDeletedDeliveryPayload template) {
        if (template == null) {
            return null;
        }
        ResourceDeletedDeliveryPayloadImpl instance = new ResourceDeletedDeliveryPayloadImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setVersion(template.getVersion());
        instance.setModifiedAt(template.getModifiedAt());
        instance.setDataErasure(template.getDataErasure());
        return instance;
    }

    /**
     * builder factory method for ResourceDeletedDeliveryPayload
     * @return builder
     */
    public static ResourceDeletedDeliveryPayloadBuilder builder() {
        return ResourceDeletedDeliveryPayloadBuilder.of();
    }

    /**
     * create builder for ResourceDeletedDeliveryPayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ResourceDeletedDeliveryPayloadBuilder builder(final ResourceDeletedDeliveryPayload template) {
        return ResourceDeletedDeliveryPayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withResourceDeletedDeliveryPayload(Function<ResourceDeletedDeliveryPayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ResourceDeletedDeliveryPayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResourceDeletedDeliveryPayload>() {
            @Override
            public String toString() {
                return "TypeReference<ResourceDeletedDeliveryPayload>";
            }
        };
    }
}
