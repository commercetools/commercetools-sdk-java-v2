
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
@JsonDeserialize(as = ResourceDeletedDeliveryImpl.class)
public interface ResourceDeletedDelivery extends SubscriptionDelivery {

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

    public static ResourceDeletedDelivery of() {
        return new ResourceDeletedDeliveryImpl();
    }

    public static ResourceDeletedDelivery of(final ResourceDeletedDelivery template) {
        ResourceDeletedDeliveryImpl instance = new ResourceDeletedDeliveryImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setResource(template.getResource());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setVersion(template.getVersion());
        instance.setModifiedAt(template.getModifiedAt());
        instance.setDataErasure(template.getDataErasure());
        return instance;
    }

    public static ResourceDeletedDeliveryBuilder builder() {
        return ResourceDeletedDeliveryBuilder.of();
    }

    public static ResourceDeletedDeliveryBuilder builder(final ResourceDeletedDelivery template) {
        return ResourceDeletedDeliveryBuilder.of(template);
    }

    default <T> T withResourceDeletedDelivery(Function<ResourceDeletedDelivery, T> helper) {
        return helper.apply(this);
    }
}
