
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>This payload is sent for a <a href="https://docs.commercetools.com/apis/ctp:api:type:ChangeSubscription" rel="nofollow">ChangeSubscription</a> when a resource is deleted.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceDeletedDeliveryPayloadImpl implements ResourceDeletedDeliveryPayload, ModelBase {

    private String notificationType;

    private String projectKey;

    private com.commercetools.api.models.common.Reference resource;

    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private Long version;

    private java.time.ZonedDateTime modifiedAt;

    private Boolean dataErasure;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ResourceDeletedDeliveryPayloadImpl(@JsonProperty("projectKey") final String projectKey,
            @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource,
            @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers,
            @JsonProperty("version") final Long version,
            @JsonProperty("modifiedAt") final java.time.ZonedDateTime modifiedAt,
            @JsonProperty("dataErasure") final Boolean dataErasure) {
        this.projectKey = projectKey;
        this.resource = resource;
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        this.version = version;
        this.modifiedAt = modifiedAt;
        this.dataErasure = dataErasure;
        this.notificationType = RESOURCE_DELETED;
    }

    /**
     * create empty instance
     */
    public ResourceDeletedDeliveryPayloadImpl() {
        this.notificationType = RESOURCE_DELETED;
    }

    /**
     *  <p>Identifies the payload.</p>
     */

    public String getNotificationType() {
        return this.notificationType;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>. Useful for processing notifications if the Destination receives them from multiple Projects.</p>
     */

    public String getProjectKey() {
        return this.projectKey;
    }

    /**
     *  <p>Reference to the resource that triggered the notification.</p>
     */

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     */

    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    /**
     *  <p>Last seen version of the resource.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the resource was last deleted.</p>
     */

    public java.time.ZonedDateTime getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     *  <p><code>true</code> if the <code>dataErasure</code> <span>parameter</span> on the <code>DELETE</code> request was set to <code>true</code>.</p>
     */

    public Boolean getDataErasure() {
        return this.dataErasure;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setResource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
    }

    public void setResourceUserProvidedIdentifiers(
            final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setModifiedAt(final java.time.ZonedDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public void setDataErasure(final Boolean dataErasure) {
        this.dataErasure = dataErasure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ResourceDeletedDeliveryPayloadImpl that = (ResourceDeletedDeliveryPayloadImpl) o;

        return new EqualsBuilder().append(notificationType, that.notificationType)
                .append(projectKey, that.projectKey)
                .append(resource, that.resource)
                .append(resourceUserProvidedIdentifiers, that.resourceUserProvidedIdentifiers)
                .append(version, that.version)
                .append(modifiedAt, that.modifiedAt)
                .append(dataErasure, that.dataErasure)
                .append(notificationType, that.notificationType)
                .append(projectKey, that.projectKey)
                .append(resource, that.resource)
                .append(resourceUserProvidedIdentifiers, that.resourceUserProvidedIdentifiers)
                .append(version, that.version)
                .append(modifiedAt, that.modifiedAt)
                .append(dataErasure, that.dataErasure)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(notificationType)
                .append(projectKey)
                .append(resource)
                .append(resourceUserProvidedIdentifiers)
                .append(version)
                .append(modifiedAt)
                .append(dataErasure)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("notificationType", notificationType)
                .append("projectKey", projectKey)
                .append("resource", resource)
                .append("resourceUserProvidedIdentifiers", resourceUserProvidedIdentifiers)
                .append("version", version)
                .append("modifiedAt", modifiedAt)
                .append("dataErasure", dataErasure)
                .build();
    }

    @Override
    public ResourceDeletedDeliveryPayload copyDeep() {
        return ResourceDeletedDeliveryPayload.deepCopy(this);
    }
}
