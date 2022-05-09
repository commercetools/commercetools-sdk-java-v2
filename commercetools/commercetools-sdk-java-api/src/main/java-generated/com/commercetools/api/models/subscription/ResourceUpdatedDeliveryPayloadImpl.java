
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ResourceUpdatedDeliveryPayloadImpl implements ResourceUpdatedDeliveryPayload, ModelBase {

    private String projectKey;

    private String notificationType;

    private com.commercetools.api.models.common.Reference resource;

    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private Long version;

    private Long oldVersion;

    private java.time.ZonedDateTime modifiedAt;

    @JsonCreator
    ResourceUpdatedDeliveryPayloadImpl(@JsonProperty("projectKey") final String projectKey,
            @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource,
            @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers,
            @JsonProperty("version") final Long version, @JsonProperty("oldVersion") final Long oldVersion,
            @JsonProperty("modifiedAt") final java.time.ZonedDateTime modifiedAt) {
        this.projectKey = projectKey;
        this.resource = resource;
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        this.version = version;
        this.oldVersion = oldVersion;
        this.modifiedAt = modifiedAt;
        this.notificationType = RESOURCE_UPDATED;
    }

    public ResourceUpdatedDeliveryPayloadImpl() {
        this.notificationType = RESOURCE_UPDATED;
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getNotificationType() {
        return this.notificationType;
    }

    /**
    *  <p>A Reference represents a loose reference to another resource in the same commercetools Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like <a href="ctp:api:type:ChannelReference">ChannelReference</a>.  A referenced resource can be embedded through <a href="/general-concepts#reference-expansion">Reference Expansion</a>. The expanded reference is the value of an additional <code>obj</code> field then.</p>
    */
    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    public Long getVersion() {
        return this.version;
    }

    public Long getOldVersion() {
        return this.oldVersion;
    }

    public java.time.ZonedDateTime getModifiedAt() {
        return this.modifiedAt;
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

    public void setOldVersion(final Long oldVersion) {
        this.oldVersion = oldVersion;
    }

    public void setModifiedAt(final java.time.ZonedDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ResourceUpdatedDeliveryPayloadImpl that = (ResourceUpdatedDeliveryPayloadImpl) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
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
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(notificationType)
                .append(resource)
                .append(resourceUserProvidedIdentifiers)
                .append(version)
                .append(oldVersion)
                .append(modifiedAt)
                .toHashCode();
    }

}
