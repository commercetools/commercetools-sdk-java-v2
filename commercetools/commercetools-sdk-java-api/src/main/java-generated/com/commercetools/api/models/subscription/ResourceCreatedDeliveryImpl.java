package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.SubscriptionDelivery;
import java.time.ZonedDateTime;
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
public final class ResourceCreatedDeliveryImpl implements ResourceCreatedDelivery {

    private String projectKey;
    
    private String notificationType;
    
    private com.commercetools.api.models.common.Reference resource;
    
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
    
    private Long version;
    
    private java.time.ZonedDateTime modifiedAt;

    @JsonCreator
    ResourceCreatedDeliveryImpl(@JsonProperty("projectKey") final String projectKey, @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("version") final Long version, @JsonProperty("modifiedAt") final java.time.ZonedDateTime modifiedAt) {
        this.projectKey = projectKey;
        this.resource = resource;
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        this.version = version;
        this.modifiedAt = modifiedAt;
        this.notificationType = "ResourceCreated";
    }
    public ResourceCreatedDeliveryImpl() {
        this.notificationType = "ResourceCreated";
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
    
    
    public Long getVersion(){
        return this.version;
    }
    
    
    public java.time.ZonedDateTime getModifiedAt(){
        return this.modifiedAt;
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
    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    public void setModifiedAt(final java.time.ZonedDateTime modifiedAt){
        this.modifiedAt = modifiedAt;
    }

}
