
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
 *  <p>This payload is sent for a MessageSubscription.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MessageDeliveryPayloadImpl implements MessageDeliveryPayload, ModelBase {

    private String notificationType;

    private String projectKey;

    private com.commercetools.api.models.common.Reference resource;

    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private Long sequenceNumber;

    private Long resourceVersion;

    private com.commercetools.api.models.subscription.PayloadNotIncluded payloadNotIncluded;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MessageDeliveryPayloadImpl(@JsonProperty("projectKey") final String projectKey,
            @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource,
            @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers,
            @JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("sequenceNumber") final Long sequenceNumber,
            @JsonProperty("resourceVersion") final Long resourceVersion,
            @JsonProperty("payloadNotIncluded") final com.commercetools.api.models.subscription.PayloadNotIncluded payloadNotIncluded) {
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
        this.notificationType = MESSAGE;
    }

    /**
     * create empty instance
     */
    public MessageDeliveryPayloadImpl() {
        this.notificationType = MESSAGE;
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
     *  <p>Unique ID of the message.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Last seen version of the resource.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the resource was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the resource was last modified.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Used to ensure all messages of the resource are processed in correct order. The <code>sequenceNumber</code> of the next message of the resource is a successor of the <code>sequenceNumber</code> of the current message.</p>
     */

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     *  <p>Version of the resource on which the update was performed.</p>
     */

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    /**
     *  <p>If the payload does not fit into the size limit or its format is not accepted by the messaging service, the <code>payloadNotIncluded</code> field is present.</p>
     */

    public com.commercetools.api.models.subscription.PayloadNotIncluded getPayloadNotIncluded() {
        return this.payloadNotIncluded;
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

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setSequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public void setResourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public void setPayloadNotIncluded(
            final com.commercetools.api.models.subscription.PayloadNotIncluded payloadNotIncluded) {
        this.payloadNotIncluded = payloadNotIncluded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MessageDeliveryPayloadImpl that = (MessageDeliveryPayloadImpl) o;

        return new EqualsBuilder().append(notificationType, that.notificationType)
                .append(projectKey, that.projectKey)
                .append(resource, that.resource)
                .append(resourceUserProvidedIdentifiers, that.resourceUserProvidedIdentifiers)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(sequenceNumber, that.sequenceNumber)
                .append(resourceVersion, that.resourceVersion)
                .append(payloadNotIncluded, that.payloadNotIncluded)
                .append(notificationType, that.notificationType)
                .append(projectKey, that.projectKey)
                .append(resource, that.resource)
                .append(resourceUserProvidedIdentifiers, that.resourceUserProvidedIdentifiers)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(sequenceNumber, that.sequenceNumber)
                .append(resourceVersion, that.resourceVersion)
                .append(payloadNotIncluded, that.payloadNotIncluded)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(notificationType)
                .append(projectKey)
                .append(resource)
                .append(resourceUserProvidedIdentifiers)
                .append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(sequenceNumber)
                .append(resourceVersion)
                .append(payloadNotIncluded)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("notificationType", notificationType)
                .append("projectKey", projectKey)
                .append("resource", resource)
                .append("resourceUserProvidedIdentifiers", resourceUserProvidedIdentifiers)
                .append("id", id)
                .append("version", version)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("sequenceNumber", sequenceNumber)
                .append("resourceVersion", resourceVersion)
                .append("payloadNotIncluded", payloadNotIncluded)
                .build();
    }

    private com.commercetools.api.models.message.MessagePayload messagePayload;

    @Override
    public com.commercetools.api.models.message.MessagePayload getMessagePayload() {
        return messagePayload;
    }

}
