
package com.commercetools.api.models.subscription;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ResourceDeletedDeliveryPayloadImpl.class)
public interface ResourceDeletedDeliveryPayload extends DeliveryPayload {

    String RESOURCE_DELETED = "ResourceDeleted";

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("modifiedAt")
    public ZonedDateTime getModifiedAt();

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
