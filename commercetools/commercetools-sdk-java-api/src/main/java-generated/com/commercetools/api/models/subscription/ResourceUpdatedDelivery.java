
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
@JsonDeserialize(as = ResourceUpdatedDeliveryImpl.class)
public interface ResourceUpdatedDelivery extends SubscriptionDelivery {

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

    public static ResourceUpdatedDelivery of() {
        return new ResourceUpdatedDeliveryImpl();
    }

    public static ResourceUpdatedDelivery of(final ResourceUpdatedDelivery template) {
        ResourceUpdatedDeliveryImpl instance = new ResourceUpdatedDeliveryImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setResource(template.getResource());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setVersion(template.getVersion());
        instance.setOldVersion(template.getOldVersion());
        instance.setModifiedAt(template.getModifiedAt());
        return instance;
    }

    public static ResourceUpdatedDeliveryBuilder builder() {
        return ResourceUpdatedDeliveryBuilder.of();
    }

    public static ResourceUpdatedDeliveryBuilder builder(final ResourceUpdatedDelivery template) {
        return ResourceUpdatedDeliveryBuilder.of(template);
    }

    default <T> T withResourceUpdatedDelivery(Function<ResourceUpdatedDelivery, T> helper) {
        return helper.apply(this);
    }
}
