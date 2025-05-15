
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
 *  <p>This payload is sent for a ChangeSubscription when a resource is updated. This includes updates by a background process, like a change in product availability.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceUpdatedDeliveryPayloadImpl implements ResourceUpdatedDeliveryPayload, ModelBase {

    private String notificationType;

    private String projectKey;

    private com.commercetools.api.models.common.Reference resource;

    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private Long version;

    private Long oldVersion;

    private java.time.ZonedDateTime modifiedAt;

    /**
     * create instance with all properties
     */
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

    /**
     * create empty instance
     */
    public ResourceUpdatedDeliveryPayloadImpl() {
        this.notificationType = RESOURCE_UPDATED;
    }

    /**
     *  <p>Identifies the payload.</p>
     */

    public String getNotificationType() {
        return this.notificationType;
    }

    /**
     *  <p><code>key</code> of the Project. Useful for processing notifications if the Destination receives them from multiple Projects.</p>
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
     *  <p>Version of the resource before the update.</p>
     */

    public Long getOldVersion() {
        return this.oldVersion;
    }

    /**
     *  <p>Date and time (UTC) the resource was last updated.</p>
     */

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

        return new EqualsBuilder().append(notificationType, that.notificationType)
                .append(projectKey, that.projectKey)
                .append(resource, that.resource)
                .append(resourceUserProvidedIdentifiers, that.resourceUserProvidedIdentifiers)
                .append(version, that.version)
                .append(oldVersion, that.oldVersion)
                .append(modifiedAt, that.modifiedAt)
                .append(notificationType, that.notificationType)
                .append(projectKey, that.projectKey)
                .append(resource, that.resource)
                .append(resourceUserProvidedIdentifiers, that.resourceUserProvidedIdentifiers)
                .append(version, that.version)
                .append(oldVersion, that.oldVersion)
                .append(modifiedAt, that.modifiedAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(notificationType)
                .append(projectKey)
                .append(resource)
                .append(resourceUserProvidedIdentifiers)
                .append(version)
                .append(oldVersion)
                .append(modifiedAt)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("notificationType", notificationType)
                .append("projectKey", projectKey)
                .append("resource", resource)
                .append("resourceUserProvidedIdentifiers", resourceUserProvidedIdentifiers)
                .append("version", version)
                .append("oldVersion", oldVersion)
                .append("modifiedAt", modifiedAt)
                .build();
    }

    @Override
    public ResourceUpdatedDeliveryPayload copyDeep() {
        return ResourceUpdatedDeliveryPayload.deepCopy(this);
    }
}
