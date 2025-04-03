
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
 *  <p>This payload is sent for an EventSubscription.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EventDeliveryPayloadImpl implements EventDeliveryPayload, ModelBase {

    private String notificationType;

    private String id;

    private com.commercetools.api.models.subscription.EventType type;

    private String resourceType;

    private java.lang.Object data;

    private java.time.ZonedDateTime createdAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    EventDeliveryPayloadImpl(@JsonProperty("id") final String id,
            @JsonProperty("type") final com.commercetools.api.models.subscription.EventType type,
            @JsonProperty("resourceType") final String resourceType, @JsonProperty("data") final java.lang.Object data,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt) {
        this.id = id;
        this.type = type;
        this.resourceType = resourceType;
        this.data = data;
        this.createdAt = createdAt;
        this.notificationType = EVENT;
    }

    /**
     * create empty instance
     */
    public EventDeliveryPayloadImpl() {
        this.notificationType = EVENT;
    }

    /**
     *  <p>Identifies the payload.</p>
     */

    public String getNotificationType() {
        return this.notificationType;
    }

    /**
     *  <p>Unique identifier of the Event.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>The type of Event that has occurred.</p>
     */

    public com.commercetools.api.models.subscription.EventType getType() {
        return this.type;
    }

    /**
     *  <p>The type of resource targeted by the Event.</p>
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     *  <p>The data describing the event that has taken place.</p>
     */

    public java.lang.Object getData() {
        return this.data;
    }

    /**
     *  <p>Date and time (UTC) the resource was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setType(final com.commercetools.api.models.subscription.EventType type) {
        this.type = type;
    }

    public void setResourceType(final String resourceType) {
        this.resourceType = resourceType;
    }

    public void setData(final java.lang.Object data) {
        this.data = data;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        EventDeliveryPayloadImpl that = (EventDeliveryPayloadImpl) o;

        return new EqualsBuilder().append(notificationType, that.notificationType)
                .append(id, that.id)
                .append(type, that.type)
                .append(resourceType, that.resourceType)
                .append(data, that.data)
                .append(createdAt, that.createdAt)
                .append(notificationType, that.notificationType)
                .append(id, that.id)
                .append(type, that.type)
                .append(resourceType, that.resourceType)
                .append(data, that.data)
                .append(createdAt, that.createdAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(notificationType)
                .append(id)
                .append(type)
                .append(resourceType)
                .append(data)
                .append(createdAt)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("notificationType", notificationType)
                .append("id", id)
                .append("type", type)
                .append("resourceType", resourceType)
                .append("data", data)
                .append("createdAt", createdAt)
                .build();
    }

}
