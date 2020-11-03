package com.commercetools.api.models.subscription;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.message.UserProvidedIdentifiers;
import com.commercetools.api.models.subscription.MessageDelivery;
import com.commercetools.api.models.subscription.ResourceCreatedDelivery;
import com.commercetools.api.models.subscription.ResourceDeletedDelivery;
import com.commercetools.api.models.subscription.ResourceUpdatedDelivery;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SubscriptionDeliveryImpl implements SubscriptionDelivery {

    private String projectKey;
    
    private String notificationType;
    
    private com.commercetools.api.models.common.Reference resource;
    
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    @JsonCreator
    SubscriptionDeliveryImpl(@JsonProperty("projectKey") final String projectKey, @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.projectKey = projectKey;
        this.resource = resource;
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        this.notificationType = "null";
    }
    public SubscriptionDeliveryImpl() {
       
    }

    
    public String getProjectKey(){
        return this.projectKey;
    }
    
    
    public String getNotificationType(){
        return this.notificationType;
    }
    
    
    public com.commercetools.api.models.common.Reference getResource(){
        return this.resource;
    }
    
    
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
        return this.resourceUserProvidedIdentifiers;
    }

    public void setProjectKey(final String projectKey){
        this.projectKey = projectKey;
    }
    
    public void setResource(final com.commercetools.api.models.common.Reference resource){
        this.resource = resource;
    }
    
    public void setResourceUserProvidedIdentifiers(final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers){
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
    }

}
