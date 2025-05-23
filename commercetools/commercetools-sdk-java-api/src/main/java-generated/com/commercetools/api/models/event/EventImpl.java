
package com.commercetools.api.models.event;

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
 *  <p>Base representation of an Event containing common fields to all Event Types.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EventImpl implements Event, ModelBase {

    private String id;

    private String notificationType;

    private com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType;

    private com.commercetools.api.models.subscription.EventType type;

    private java.time.ZonedDateTime createdAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    EventImpl(@JsonProperty("id") final String id, @JsonProperty("notificationType") final String notificationType,
            @JsonProperty("resourceType") final com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType,
            @JsonProperty("type") final com.commercetools.api.models.subscription.EventType type,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt) {
        this.id = id;
        this.notificationType = notificationType;
        this.resourceType = resourceType;
        this.type = type;
        this.createdAt = createdAt;
    }

    /**
     * create empty instance
     */
    public EventImpl() {
    }

    /**
     *  <p>Unique identifier of the Event.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *
     */

    public String getNotificationType() {
        return this.notificationType;
    }

    /**
     *  <p>The type of resource targeted by the Event.</p>
     */

    public com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId getResourceType() {
        return this.resourceType;
    }

    /**
     *  <p>The type of Event that has occurred.</p>
     */

    public com.commercetools.api.models.subscription.EventType getType() {
        return this.type;
    }

    /**
     *  <p>Date and time (UTC) the Event was generated.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setNotificationType(final String notificationType) {
        this.notificationType = notificationType;
    }

    public void setResourceType(
            final com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType) {
        this.resourceType = resourceType;
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

        EventImpl that = (EventImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(notificationType, that.notificationType)
                .append(resourceType, that.resourceType)
                .append(type, that.type)
                .append(createdAt, that.createdAt)
                .append(id, that.id)
                .append(notificationType, that.notificationType)
                .append(resourceType, that.resourceType)
                .append(type, that.type)
                .append(createdAt, that.createdAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(notificationType)
                .append(resourceType)
                .append(type)
                .append(createdAt)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("notificationType", notificationType)
                .append("resourceType", resourceType)
                .append("type", type)
                .append("createdAt", createdAt)
                .build();
    }

    @Override
    public Event copyDeep() {
        return Event.deepCopy(this);
    }
}
