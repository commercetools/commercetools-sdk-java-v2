
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

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.MessageDeliveryPayloadImpl.class, name = MessageDeliveryPayload.MESSAGE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayloadImpl.class, name = ResourceCreatedDeliveryPayload.RESOURCE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.ResourceDeletedDeliveryPayloadImpl.class, name = ResourceDeletedDeliveryPayload.RESOURCE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.ResourceUpdatedDeliveryPayloadImpl.class, name = ResourceUpdatedDeliveryPayload.RESOURCE_UPDATED) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "notificationType", defaultImpl = DeliveryPayloadImpl.class, visible = true)
@JsonDeserialize(as = DeliveryPayloadImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface DeliveryPayload {

    @NotNull
    @JsonProperty("projectKey")
    public String getProjectKey();

    @NotNull
    @JsonProperty("notificationType")
    public String getNotificationType();

    @NotNull
    @Valid
    @JsonProperty("resource")
    public Reference getResource();

    @Valid
    @JsonProperty("resourceUserProvidedIdentifiers")
    public UserProvidedIdentifiers getResourceUserProvidedIdentifiers();

    public void setProjectKey(final String projectKey);

    public void setResource(final Reference resource);

    public void setResourceUserProvidedIdentifiers(final UserProvidedIdentifiers resourceUserProvidedIdentifiers);

    default <T> T withDeliveryPayload(Function<DeliveryPayload, T> helper) {
        return helper.apply(this);
    }
}
