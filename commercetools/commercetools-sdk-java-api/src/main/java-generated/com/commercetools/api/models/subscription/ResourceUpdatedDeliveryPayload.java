
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
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ResourceUpdatedDeliveryPayload resourceUpdatedDeliveryPayload = ResourceUpdatedDeliveryPayload.builder()
           .projectKey("{projectKey}")
           .resource(resourceBuilder -> resourceBuilder)
           .version(0.3)
           .oldVersion(0.3)
           .modifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ResourceUpdatedDeliveryPayloadImpl.class)
public interface ResourceUpdatedDeliveryPayload extends DeliveryPayload {

    String RESOURCE_UPDATED = "ResourceUpdated";

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("oldVersion")
    public Long getOldVersion();

    @NotNull
    @JsonProperty("modifiedAt")
    public ZonedDateTime getModifiedAt();

    public void setVersion(final Long version);

    public void setOldVersion(final Long oldVersion);

    public void setModifiedAt(final ZonedDateTime modifiedAt);

    public static ResourceUpdatedDeliveryPayload of() {
        return new ResourceUpdatedDeliveryPayloadImpl();
    }

    public static ResourceUpdatedDeliveryPayload of(final ResourceUpdatedDeliveryPayload template) {
        ResourceUpdatedDeliveryPayloadImpl instance = new ResourceUpdatedDeliveryPayloadImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setResource(template.getResource());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setVersion(template.getVersion());
        instance.setOldVersion(template.getOldVersion());
        instance.setModifiedAt(template.getModifiedAt());
        return instance;
    }

    public static ResourceUpdatedDeliveryPayloadBuilder builder() {
        return ResourceUpdatedDeliveryPayloadBuilder.of();
    }

    public static ResourceUpdatedDeliveryPayloadBuilder builder(final ResourceUpdatedDeliveryPayload template) {
        return ResourceUpdatedDeliveryPayloadBuilder.of(template);
    }

    default <T> T withResourceUpdatedDeliveryPayload(Function<ResourceUpdatedDeliveryPayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ResourceUpdatedDeliveryPayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResourceUpdatedDeliveryPayload>() {
            @Override
            public String toString() {
                return "TypeReference<ResourceUpdatedDeliveryPayload>";
            }
        };
    }
}
