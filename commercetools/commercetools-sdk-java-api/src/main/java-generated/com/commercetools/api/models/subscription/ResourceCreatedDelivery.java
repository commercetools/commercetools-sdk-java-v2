
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
@JsonDeserialize(as = ResourceCreatedDeliveryImpl.class)
public interface ResourceCreatedDelivery extends SubscriptionDelivery {

    String RESOURCE_CREATED = "ResourceCreated";

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("modifiedAt")
    public ZonedDateTime getModifiedAt();

    public void setVersion(final Long version);

    public void setModifiedAt(final ZonedDateTime modifiedAt);

    public static ResourceCreatedDelivery of() {
        return new ResourceCreatedDeliveryImpl();
    }

    public static ResourceCreatedDelivery of(final ResourceCreatedDelivery template) {
        ResourceCreatedDeliveryImpl instance = new ResourceCreatedDeliveryImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setResource(template.getResource());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setVersion(template.getVersion());
        instance.setModifiedAt(template.getModifiedAt());
        return instance;
    }

    public static ResourceCreatedDeliveryBuilder builder() {
        return ResourceCreatedDeliveryBuilder.of();
    }

    public static ResourceCreatedDeliveryBuilder builder(final ResourceCreatedDelivery template) {
        return ResourceCreatedDeliveryBuilder.of(template);
    }

    default <T> T withResourceCreatedDelivery(Function<ResourceCreatedDelivery, T> helper) {
        return helper.apply(this);
    }
}
