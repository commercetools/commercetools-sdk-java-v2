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
 *  <p>This payload is sent for a ChangeSubscription when a resource is updated. This includes updates by a background process, like a change in product availability.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ResourceUpdatedDeliveryPayloadImpl implements ResourceUpdatedDeliveryPayload, ModelBase {

    
    private String projectKey;
    
    
    private String notificationType;
    
    
    private com.commercetools.api.models.common.Reference resource;
    
    
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
    
    
    private Long version;
    
    
    private Long oldVersion;
    
    
    private java.time.ZonedDateTime modifiedAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ResourceUpdatedDeliveryPayloadImpl(@JsonProperty("projectKey") final String projectKey, @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("version") final Long version, @JsonProperty("oldVersion") final Long oldVersion, @JsonProperty("modifiedAt") final java.time.ZonedDateTime modifiedAt) {
        this.projectKey = projectKey;
        this.resource = resource;
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        this.version = version;
        this.oldVersion = oldVersion;
        this.modifiedAt = modifiedAt;
        this.notificationType =  RESOURCE_UPDATED;
    }
    /**
     * create empty instance
     */
    public ResourceUpdatedDeliveryPayloadImpl() {
        this.notificationType =  RESOURCE_UPDATED;
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
     *  <p>Version of the resource before the update.</p>
     */
    
    public Long getOldVersion(){
        return this.oldVersion;
    }
    
    /**
     *  <p>Date and time (UTC) the resource was last updated.</p>
     */
    
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
    
    
    public void setOldVersion(final Long oldVersion){
        this.oldVersion = oldVersion;
    }
    
    
    public void setModifiedAt(final java.time.ZonedDateTime modifiedAt){
        this.modifiedAt = modifiedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ResourceUpdatedDeliveryPayloadImpl that = (ResourceUpdatedDeliveryPayloadImpl) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(notificationType, that.notificationType)
                .append(resource, that.resource)
                .append(resourceUserProvidedIdentifiers, that.resourceUserProvidedIdentifiers)
                .append(version, that.version)
                .append(oldVersion, that.oldVersion)
                .append(modifiedAt, that.modifiedAt)
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
            .append(oldVersion)
            .append(modifiedAt)
            .toHashCode();
    }

}
