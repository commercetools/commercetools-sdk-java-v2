package com.commercetools.api.models.subscription;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.message.UserProvidedIdentifiers;
import com.commercetools.api.models.subscription.MessageDelivery;
import com.commercetools.api.models.subscription.ResourceCreatedDelivery;
import com.commercetools.api.models.subscription.ResourceDeletedDelivery;
import com.commercetools.api.models.subscription.ResourceUpdatedDelivery;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.MessageDeliveryImpl.class, name = "Message"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.ResourceUpdatedDeliveryImpl.class, name = "ResourceUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.ResourceCreatedDeliveryImpl.class, name = "ResourceCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.ResourceDeletedDeliveryImpl.class, name = "ResourceDeleted")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "notificationType",
    defaultImpl = SubscriptionDeliveryImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface SubscriptionDelivery  {

    
    @NotNull
    @JsonProperty("projectKey")
    public String getProjectKey();
    
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



    default <T> T withSubscriptionDelivery(Function<SubscriptionDelivery, T> helper) {
        return helper.apply(this);
    }
}
