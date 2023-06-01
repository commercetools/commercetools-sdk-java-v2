package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.DeliveryPayload;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>This payload is sent for a ChangeSubscription when a resource is deleted.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ResourceDeletedDeliveryPayloadImpl implements ResourceDeletedDeliveryPayload, ModelBase {

    
    private String projectKey;
    
    
    private String notificationType;
    
    
    private com.commercetools.api.models.common.Reference resource;
    
    
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
    
    
    private Long version;
    
    
    private java.time.ZonedDateTime modifiedAt;
    
    
    private Boolean dataErasure;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ResourceDeletedDeliveryPayloadImpl(@JsonProperty("projectKey") final String projectKey, @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("version") final Long version, @JsonProperty("modifiedAt") final java.time.ZonedDateTime modifiedAt, @JsonProperty("dataErasure") final Boolean dataErasure) {
        this.projectKey = projectKey;
        this.resource = resource;
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        this.version = version;
        this.modifiedAt = modifiedAt;
        this.dataErasure = dataErasure;
        this.notificationType =  RESOURCE_DELETED;
    }
    /**
     * create empty instance
     */
    public ResourceDeletedDeliveryPayloadImpl() {
        this.notificationType =  RESOURCE_DELETED;
    }

    /**
     *  <p><code>key</code> of the Project. Useful in message processing if the Destination receives events from multiple Projects.</p>
     */
    
    public String getProjectKey(){
        return this.projectKey;
    }
    
    /**
     *  <p>Identifies the payload.</p>
     */
    
    public String getNotificationType(){
        return this.notificationType;
    }
    
    /**
     *  <p>Reference to the resource that triggered the message.</p>
     */
    
    public com.commercetools.api.models.common.Reference getResource(){
        return this.resource;
    }
    
    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     */
    
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
        return this.resourceUserProvidedIdentifiers;
    }
    
    /**
     *  <p>Last seen version of the resource.</p>
     */
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Date and time (UTC) the resource was last deleted.</p>
     */
    
    public java.time.ZonedDateTime getModifiedAt(){
        return this.modifiedAt;
    }
    
    /**
     *  <p><code>true</code> if the <code>dataErasure</code> parameter on the <code>DELETE</code> request was set to <code>true</code>.</p>
     */
    
    public Boolean getDataErasure(){
        return this.dataErasure;
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
    
    
    public void setDataErasure(final Boolean dataErasure){
        this.dataErasure = dataErasure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ResourceDeletedDeliveryPayloadImpl that = (ResourceDeletedDeliveryPayloadImpl) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(notificationType, that.notificationType)
                .append(resource, that.resource)
                .append(resourceUserProvidedIdentifiers, that.resourceUserProvidedIdentifiers)
                .append(version, that.version)
                .append(modifiedAt, that.modifiedAt)
                .append(dataErasure, that.dataErasure)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(notificationType)
            .append(resource)
            .append(resourceUserProvidedIdentifiers)
            .append(version)
            .append(modifiedAt)
            .append(dataErasure)
            .toHashCode();
    }

}
