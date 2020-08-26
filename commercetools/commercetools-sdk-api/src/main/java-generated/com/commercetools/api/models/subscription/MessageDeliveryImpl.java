package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.PayloadNotIncluded;
import com.commercetools.api.models.subscription.SubscriptionDelivery;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MessageDeliveryImpl implements MessageDelivery {

    private String projectKey;
    
    private String notificationType;
    
    private com.commercetools.api.models.common.Reference resource;
    
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
    
    private String id;
    
    private Long version;
    
    private java.time.ZonedDateTime createdAt;
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    private Long sequenceNumber;
    
    private Long resourceVersion;
    
    private com.commercetools.api.models.subscription.PayloadNotIncluded payloadNotIncluded;

    @JsonCreator
    MessageDeliveryImpl(@JsonProperty("projectKey") final String projectKey, @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("sequenceNumber") final Long sequenceNumber, @JsonProperty("resourceVersion") final Long resourceVersion, @JsonProperty("payloadNotIncluded") final com.commercetools.api.models.subscription.PayloadNotIncluded payloadNotIncluded) {
        this.projectKey = projectKey;
        this.resource = resource;
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.sequenceNumber = sequenceNumber;
        this.resourceVersion = resourceVersion;
        this.payloadNotIncluded = payloadNotIncluded;
        this.notificationType = "Message";
    }
    public MessageDeliveryImpl() {
       
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
    
    
    public String getId(){
        return this.id;
    }
    
    
    public Long getVersion(){
        return this.version;
    }
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    
    public Long getSequenceNumber(){
        return this.sequenceNumber;
    }
    
    
    public Long getResourceVersion(){
        return this.resourceVersion;
    }
    
    
    public com.commercetools.api.models.subscription.PayloadNotIncluded getPayloadNotIncluded(){
        return this.payloadNotIncluded;
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
    
    public void setId(final String id){
        this.id = id;
    }
    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    public void setCreatedAt(final java.time.ZonedDateTime createdAt){
        this.createdAt = createdAt;
    }
    
    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
        this.lastModifiedAt = lastModifiedAt;
    }
    
    public void setSequenceNumber(final Long sequenceNumber){
        this.sequenceNumber = sequenceNumber;
    }
    
    public void setResourceVersion(final Long resourceVersion){
        this.resourceVersion = resourceVersion;
    }
    
    public void setPayloadNotIncluded(final com.commercetools.api.models.subscription.PayloadNotIncluded payloadNotIncluded){
        this.payloadNotIncluded = payloadNotIncluded;
    }

}
