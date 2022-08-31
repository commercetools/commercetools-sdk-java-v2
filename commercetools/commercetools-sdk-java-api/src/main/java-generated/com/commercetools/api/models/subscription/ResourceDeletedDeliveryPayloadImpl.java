
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

/**
 * ResourceDeletedDeliveryPayload
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceDeletedDeliveryPayloadImpl implements ResourceDeletedDeliveryPayload, ModelBase {

    private String projectKey;

    private String notificationType;

    private com.commercetools.api.models.common.Reference resource;

    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private Long version;

    private java.time.ZonedDateTime modifiedAt;

    private Boolean dataErasure;

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

    public ResourceDeletedDeliveryPayloadImpl() {
        this.notificationType = RESOURCE_DELETED;
    }

    /**
     *
     */

    public String getProjectKey() {
        return this.projectKey;
    }

    /**
     *
     */

    public String getNotificationType() {
        return this.notificationType;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    /**
     *  <p>User-provided identifiers present on the resource for which the Message is created. The value of the identifier stored in the Message corresponds to the one that was set on the resource at the version shown in <code>resourceVersion</code>.</p>
     */

    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    /**
     *
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *
     */

    public java.time.ZonedDateTime getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     *
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

        return new EqualsBuilder().append(projectKey, that.projectKey)
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
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(notificationType)
                .append(resource)
                .append(resourceUserProvidedIdentifiers)
                .append(version)
                .append(modifiedAt)
                .append(dataErasure)
                .toHashCode();
    }

}
