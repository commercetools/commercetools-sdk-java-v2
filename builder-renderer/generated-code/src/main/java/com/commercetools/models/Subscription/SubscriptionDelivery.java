package com.commercetools.models.Subscription;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Message.UserProvidedIdentifiers;
import com.commercetools.models.Subscription.MessageDelivery;
import com.commercetools.models.Subscription.ResourceCreatedDelivery;
import com.commercetools.models.Subscription.ResourceDeletedDelivery;
import com.commercetools.models.Subscription.ResourceUpdatedDelivery;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Subscription.MessageDeliveryImpl.class, name = "Message"),
   @JsonSubTypes.Type(value = com.commercetools.models.Subscription.ResourceCreatedDeliveryImpl.class, name = "ResourceCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.Subscription.ResourceDeletedDeliveryImpl.class, name = "ResourceDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.models.Subscription.ResourceUpdatedDeliveryImpl.class, name = "ResourceUpdated")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "notificationType"
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
   


}